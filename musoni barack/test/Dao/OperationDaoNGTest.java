/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

//import static org.testng.Assert.*;
import Models.Book;
import Models.BookCategory;
import Models.Client;
import Models.OperationCategory;
import Models.Operations;
import java.text.ParseException;
import java.util.List;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class OperationDaoNGTest {
    
    public OperationDaoNGTest() {
    }

    @Test
    public void testSearchOperation() throws ParseException {
//        OperationDao od=new OperationDao();
//        Book buk=new Book();
//        Client cl=new Client();
//        
//        List<Operations> liste=(List<Operations>)od.SearchOperation("10/5/2020", "10/6/2020","geo");
//        
//       liste.forEach((x)->{
//           System.out.println(x.getBuk().getTittle());
//       });
    }

    @Test
    public void testUpdateBook() {
    }

    @Test
    public void testFetch() {
//        OperationDao od=new OperationDao();
//        List<Operations> liste=od.FetchChekOut();
//        liste.forEach((x)->{
//            if(new ClientDao().SearchById(63).getFullName().equalsIgnoreCase(x.getClient().getFullName())){
//            System.out.println(x.getBuk().getTittle());
//            }
//        });
    }

    @Test
    public void testSearchOperationByDate() throws Exception {
         OperationDao od=new OperationDao();
        List<Operations> liste=od.SearchOperationByDate("10/5/2020", "1/6/2020");
        liste.forEach((x)->{
            System.out.println(x.getDatetime());
        });
    }

    @Test
    public void testFetchChekOut() {
    }

    @Test
    public void testFetchChekIn() {
    }
    
}
