/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Book;
import Models.BookStatus;
import Models.Client;
import Models.OperationCategory;
import Models.Operations;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class GenericDaoNGTest {
    
    public GenericDaoNGTest() {
    }

    @Test
    public void testRegister() throws ParseException {
        Operations op=new Operations();
        GenericDao gd=new GenericDao();
        Book buk=new Book();
        Client cl=new Client();
        
        
        op.setBuk(new BookDao().SearchById(51));
        op.setClient(new ClientDao().SearchById(48));
        
        String dt="10/6/2020";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        op.setDatetime(sdf.parse(dt));
        op.setOpcat(OperationCategory.Check_Out);
        System.out.println(gd.Register(op));
    }

    @Test
    public void testFetchAll() {
        Book bk=new Book();
        GenericDao gd=new GenericDao();
        List<Book> liste=(List<Book>)gd.FetchAll(bk);
        
        liste.forEach((x)->{
            System.out.println(x.getBookId()+" "+x.getTittle());
        });
    }

    @Test
    public void testUpdate() {
        
    }
    
}
