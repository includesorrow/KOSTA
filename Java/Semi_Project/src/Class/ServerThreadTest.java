/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import Class.HandleReservation;
import Class.DataInput;
import Class.DataCheck;
import POJO.Member;
import Class.ServerThreadTest;
import GUI.Shin_GUI;

/**
 *
 * @author KOSTA
 */
public class ServerThreadTest {
    public void ServerThreadTest() throws Exception{
    DataCheck dc = new DataCheck();
    DataInput di = new DataInput();
    HandleReservation hr = new HandleReservation();
    GUI.Shin_GUI gsg = new GUI.Shin_GUI();
        
        
        
        
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

       
   //? file내용 유무 check하면서 읽어 들임과 동시에 server단으로 전송
   
    
   
   
        int ch = 0;
   
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

