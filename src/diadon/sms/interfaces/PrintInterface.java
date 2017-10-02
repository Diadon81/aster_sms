/*
 * To change sr license header, choose License Headers in Project Properties.
 * To change sr template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.interfaces;

import diadon.sms.logic.SmsRaw;

/**
 *
 * @author S00728979
 */
public class PrintInterface {
   

    public static void send(SmsRaw sr) {
        System.out.println(String.format("%s%s%s%s%s%s%s%s%s%s",sr.getSca(),sr.getPduType(),sr.getTpMr(),sr.getTpDa(),sr.getTpPid(),sr.getTpDcs(),sr.getTpVp(),sr.getTpUdl(),sr.getTpUdh(),sr.getTpUd()));
       
    }
    
}
