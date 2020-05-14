/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.BookCategory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class BookCategoryDaoNGTest {
    
    public BookCategoryDaoNGTest() {
    }

    @Test
    public void testSearchByName() {
//        BookCategoryDao bd=new BookCategoryDao();
//        BookCategory bk=new BookCategory();
//        
//        BookCategory k=bd.SearchByName("rugamba");
//        
//        System.out.println(k.getId()+" "+k.getCategoryName());
    }

    @Test
    public void testDeleteBookCategory() {
        BookCategoryDao bd=new BookCategoryDao();
        BookCategory bk=new BookCategory();
        
        bd.DeleteBookCategory("rugamba");
    }
    
}
