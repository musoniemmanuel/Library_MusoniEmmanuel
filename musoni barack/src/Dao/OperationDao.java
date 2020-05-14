/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Book;
import Models.BookCategory;
import Models.OperationCategory;
import Models.Operations;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sudo
 */
public class OperationDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public List SearchOperationByDate(String from,String to) throws ParseException{
        ss=sf.openSession();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date fromD=sdf.parse(from);
        Date toD=sdf.parse(to);
//        BookCategory bc=new BookCategoryDao().SearchByName(Category);
        
        String hql="FROM Operations WHERE datetime BETWEEN :fromdate AND :todate";
        Query query=ss.createQuery(hql);
        query.setParameter("fromdate", fromD);
        query.setParameter("todate", toD);
//        query.setParameter("cat", bc);
        
        return query.list();
    }
    
    public void UpdateBook(Book b){
        try{
        ss=sf.openSession();
        tx=ss.beginTransaction();
        ss.update(b);
        tx.commit();
        }catch(HibernateException ex){
            
        }finally{
            ss.close();
        }
    }
    
    public List FetchChekOut(){
        try{
        ss=sf.openSession();
        String hql="FROM Operations WHERE opcat = '"+OperationCategory.Check_Out+"'";
        Query query=ss.createQuery(hql);
        return (List<Operations>)query.list();
        }finally{
            ss.close();
        }
    }
        public List FetchChekIn(){
        try{
        ss=sf.openSession();
        String hql="FROM Operations WHERE opcat = '"+OperationCategory.Check_In+"'";
        Query query=ss.createQuery(hql);
        return (List<Operations>)query.list();
        }finally{
            ss.close();
        }
    }
}
