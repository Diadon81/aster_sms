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
public class printInterface {
   

    public static void send(SmsRaw sr) {
        System.out.println(String.format("%s%s%s%s%s%s%s%s%s%s",sr.getSca(),sr.getPdu_type(),sr.getTp_mr(),sr.getTp_da(),sr.getTp_pid(),sr.getTp_dcs(),sr.getTp_vp(),sr.getTp_udl(),sr.getTp_udh(),sr.getTp_ud()));
       
    }
    
}
