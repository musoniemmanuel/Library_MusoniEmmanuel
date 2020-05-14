/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Book;
import Models.Client;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sudo
 */
public class BookDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public Book SearchById(int id){
        try{
            ss=sf.openSession();
            return (Book) ss.get(Book.class, id);
        }catch(HibernateException ex){
            return null;
        }finally{
            ss.close();
        }
    }
    public Book SearchByName(String name){
        ss=sf.openSession();
        String hql="FROM Book WHERE tittle = : nam";
        Query query=ss.createQuery(hql);
        query.setParameter("nam", name);
        return (Book) query.uniqueResult();
    }
}
