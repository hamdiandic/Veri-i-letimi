
package dosyaAktarımı;

import  java.io.*;
import java.net.*;


public class Server {
    
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(3547);
        Socket sr=s.accept();
        FileInputStream fr = new FileInputStream("C:\\Users\\yok07\\OneDrive\\Masaüstü\\yeni/giden");
        byte b[] = new byte[20002];
        fr.read(b,0,b.length);
        OutputStream os= sr.getOutputStream();  
        os.write(b,0,b.length);
        
         
    }
    
}
