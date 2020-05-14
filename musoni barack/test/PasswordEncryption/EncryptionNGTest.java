/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordEncryption;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class EncryptionNGTest {
    
    public EncryptionNGTest() {
    }

    @Test
    public void testHash() {
        Encryption ency=new Encryption();
        
        System.out.println(ency.Hash("password"));
    }
//    7382eb78824cb03ae4a8e6f2d0a2da3f  8b74d8ade5c04b3975f81dd4c12c639c
}
