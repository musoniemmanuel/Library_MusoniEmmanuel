/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordEncryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



/**
 *
 * @author sudo
 */
public class Encryption {
    public String Hash(String Pass){
        String GeneretedPassword=null;
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(Pass.getBytes());
            byte[] bytes=md.digest();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<bytes.length;i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            GeneretedPassword=sb.toString();
            return GeneretedPassword;
        }catch(NoSuchAlgorithmException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
