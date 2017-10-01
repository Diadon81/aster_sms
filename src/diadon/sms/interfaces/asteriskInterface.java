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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S00728979
 */
public class asteriskInterface {
public static void send(SmsRaw sr, String asterisk, String dongle) {
String pdu=String.format("%s%s%s%s%s%s%s%s%s%s",sr.getSca(),sr.getPdu_type(),sr.getTp_mr(),sr.getTp_da(),sr.getTp_pid(),sr.getTp_dcs(),sr.getTp_vp(),sr.getTp_udl(),sr.getTp_udh(),sr.getTp_ud()); 
try { 
  String[] command={asterisk,"-rx","dongle pdu "+dongle+" "+pdu};
 // System.out.println(command);
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
