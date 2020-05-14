/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Client;
import PasswordEncryption.Encryption;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author sudo
 */
public class ClientDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public Client SearchById(int id){
        try{
            ss=sf.openSession();
            return (Client) ss.get(Client.class, id);
        }catch(HibernateException ex){
            return null;
        }finally{
            ss.close();
        }
    }
    public Boolean SearchByName(String Name,String pass){
        try{
        ss=sf.openSession();
        String hql="FROM Client WHERE Username = '"+Name+"'";
        Query query=ss.createQuery(hql);
        Client c=(Client)query.uniqueResult();
        if(c!=null){
        if(c.getPassword().equals(new Encryption().Hash(pass))){
            return Boolean.TRUE;
        }else{
            return Boolean.FALSE;
        }
        }else{
            return  Boolean.FALSE;
        }

        }finally{
        ss.close();
        }   
    }
}
