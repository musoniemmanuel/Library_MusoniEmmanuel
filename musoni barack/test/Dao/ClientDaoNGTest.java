/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Client;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class ClientDaoNGTest {
    
    public ClientDaoNGTest() {
    }

    @Test
    public void testLoginT() {
    }

    @Test
    public void testSearcById() {
        ClientDao cd=new ClientDao();
        Client c=new Client();
        
//        Client cl=cd.SearchById(48);
//        System.out.println(cl.getFullName());
    }

    @Test
    public void testSearchById() {
    }

    @Test
    public void testSearchByName() {
        ClientDao cd=new ClientDao();
        Client c=new Client();
        
        Boolean b=cd.SearchByName("mihigo", "mihig");
        
        if(Boolean.TRUE.equals(b)){
            System.out.println("welcome");
        }else{
            System.out.println("Access Dinied");
        }
    }
    
}
