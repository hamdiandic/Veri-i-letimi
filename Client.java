package dosyaAktarımı;

import  java.io.*;
import java.net.*;


public class Client {
    
     public static void main(String[] args) throws Exception {
        
         byte [] b = new byte[20002];
         Socket sr = new Socket("192.168.1.100",3547);
         InputStream is= sr.getInputStream();
         FileOutputStream fr=new FileOutputStream("C:\\Users\\yok07\\OneDrive\\Masaüstü\\yeni/gelen2.txt");
         is.read(b,0,b.length);
         fr.write(b,0,b.length);
    }
     
}
