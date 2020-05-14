    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author sudo
 */
public class GenericDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    
    public String Register(Object o){
        try{
        ss=sf.openSession();
        tx=ss.beginTransaction();
        ss.save(o);
        tx.commit();
        return "Successifully registered";
        }catch(HibernateException ex){
            return ex.getMessage();
        }finally{
            ss.close();
        }
    }
    
    public List FetchAll(Object o){
        try{
            ss=sf.openSession();
            List<Object> liste=(List<Object>) ss.createCriteria(o.getClass()).list();
            return liste;
        }catch(HibernateException ex){
            
        }
        return null;
    }
    
    public void Update(Object o){
        try{
        ss=sf.openSession();
        tx=ss.beginTransaction();
        ss.update(o);
        tx.commit();
        }catch(HibernateException ex){
            
        }finally{
            ss.close();
        }
    }
}
