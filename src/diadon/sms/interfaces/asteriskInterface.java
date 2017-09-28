/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.interfaces;

import diadon.sms.logic.SmsRaw;
import java.io.IOException;

/**
 *
 * @author S00728979
 */
public class asteriskInterface {
public static void send(SmsRaw sr, String asterisk, String dongle) {
String pdu=String.format("%s%s%s%s%s%s%s%s%s%s",sr.getSca(),sr.getPdu_type(),sr.getTp_mr(),sr.getTp_da(),sr.getTp_pid(),sr.getTp_dcs(),sr.getTp_vp(),sr.getTp_udl(),sr.getTp_udh(),sr.getTp_ud()); 
try {   
  Process p = new ProcessBuilder(asterisk, "-rx"," 'dongle pdu "+dongle+" "+pdu+"'").start();  
}  
 catch (IOException e) {
   System.out.println("Error to exec Asterisk");  
 }
}
}
