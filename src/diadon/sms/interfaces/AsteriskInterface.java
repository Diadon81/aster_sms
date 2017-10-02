/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.interfaces;

import diadon.sms.logic.SmsRaw;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author S00728979
 */
public class AsteriskInterface {
public static void send(SmsRaw sr, String asterisk, String dongle) {
String pdu=String.format("%s%s%s%s%s%s%s%s%s%s",sr.getSca(),sr.getPduType(),sr.getTpMr(),sr.getTpDa(),sr.getTpPid(),sr.getTpDcs(),sr.getTpVp(),sr.getTpUdl(),sr.getTpUdh(),sr.getTpUd()); 
try { 
  String[] command={asterisk,"-rx","dongle pdu "+dongle+" "+pdu};

  //Process p = Runtime.getRuntime().exec(command);
       Runtime runtime = Runtime.getRuntime();
       

       Process process = runtime.exec(command);
      
       InputStream is = process.getInputStream();

       InputStreamReader isr = new InputStreamReader(is);

       BufferedReader br = new BufferedReader(isr);
       
       String line;
  
       while ((line = br.readLine()) != null) {

         System.out.println(line);

       }
   
    
  
}  
 catch (IOException e) {
   System.out.println("Error to exec Asterisk");  
 }
}
}
