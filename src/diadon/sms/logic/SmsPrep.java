/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.logic;
//import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author Diadon
 */
public class SmsPrep {
    
    public static final List<SmsRaw> getSmsPrep(Sms s) {
        List<SmsRaw> smsRaw = new ArrayList<>();
        String telNum="";
        String convTelNum="";
        
        
       
        
        
        if(s.getTelNum().length()%2>0) telNum=telNum+s.getTelNum()+"F";
        else  telNum=telNum+s.getTelNum();
        for(int i=0;i<telNum.length();i=i+2) {
            convTelNum=convTelNum+telNum.charAt(i+1)+telNum.charAt(i);
        }
      
        /* String format SCA + PDU_TYPE + TP_MR + TP_DA + TP_PID + TP_DCS + TP_VP + TP_UDL +TP_UDH+ TP_UD */
       if (s.getTextMessage().length()<70) {
         
         smsRaw.add(new SmsRaw("00","01","00",String.format("%02x%s%s", s.getTelNum().length(),"91",convTelNum),"00","08","",String.format("%02x",s.getTextMessage().length()*2),"",s.getTextMessage()));
          
          
          
       }
       else {
          int random=(int)(Math.random()*255);
          
          List<String> mparts=splitByNumber(s.getTextMessage(),67);
       
          for(int i=0;i<mparts.size();i++) {
          
          smsRaw.add(new SmsRaw("00","41",String.format("%02x",i),String.format("%02x%s%s", s.getTelNum().length(),"91",convTelNum),"00","08","",String.format("%02x",(mparts.get(i).length()*2)+6),String.format("050003%02x%02x%02x",random,mparts.size(),i+1),mparts.get(i)));
       }
       
       
    }
    
  return(smsRaw);
}
    public static List<String> splitByNumber(String text, int num) {
List<String> strings = new ArrayList<>();
int index = 0;
while (index < text.length()) {
    strings.add(text.substring(index, Math.min(index + num,text.length())));
    index += num;
}

        return strings;
    }
}
