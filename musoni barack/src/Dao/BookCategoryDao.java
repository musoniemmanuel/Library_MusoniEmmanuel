/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Models.BookCategory;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author sudo
 */
public class BookCategoryDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public BookCategory SearchByName(String name){
        try{
        ss=sf.openSession();
        String hql="FROM BookCategory WHERE CategoryName = :cname ";
        Query query=ss.createQuery(hql);
        query.setParameter("cname", name);
        return (BookCategory)query.uniqueResult();
        }catch(HibernateException ex){
            
        }finally{
            ss.close();
        }
        return null;
    }
    
    public void DeleteBookCategory(String name){
        ss=sf.openSession();
        tx=ss.beginTransaction();
        String hql="DELETE FROM BookCategory WHERE CategoryName = :cname";
        Query query=ss.createQuery(hql);
        query.setParameter("cname", name);
        query.executeUpdate();
        tx.commit();
    }
}
