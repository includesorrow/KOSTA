/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import Class.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author KOSTA
 */
public class ServerThreadTest {
    public void ServerThreadTest() throws Exception{
     Socket s = new Socket("162.168.0.16", 9999);
  String filename = null;
  BufferedOutputStream toServer = null;
  BufferedInputStream bis = null;
  FileInputStream fis = null;
  DataOutputStream dos = null;

  try{

   filename = "C:\\bigdataStudy\\memoarray.txt";

   toServer = new BufferedOutputStream( s.getOutputStream() );
   dos = new DataOutputStream( s.getOutputStream() );
   dos.writeUTF( filename );

   fis = new FileInputStream( filename );
   bis = new BufferedInputStream( fis );

            int ch = 0;
   //? file내용 유무 check하면서 읽어 들임과 동시에 server단으로 전송
   
            while((ch = bis.read()  ) != -1) {
                toServer.write(ch);        
   }    
   
            toServer.flush();     
            toServer.close();
            fis.close();
            s.close();      
   

  }catch(FileNotFoundException fnfe){
   fnfe.printStackTrace();
  }catch(IOException ioe){
   ioe.printStackTrace();
  }      
 }}

