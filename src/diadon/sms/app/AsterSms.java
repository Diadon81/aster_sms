package diadon.sms.app;
import diadon.sms.interfaces.AsteriskInterface;
import diadon.sms.logic.*;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diadon
 */
public class AsterSms {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        // TODO code application logic here
    StackTraceElement[] stack = Thread.currentThread ().getStackTrace ();
    StackTraceElement main = stack[stack.length - 1];
    String mainClass = main.getClassName ();
    if (args.length!=4) {
           System.out.println("Use: "+mainClass+" <phone> \"message\" <asterisk path> <dongle_id>"); 
           System.out.println();
           System.out.println("Example: AsterSms 71234567890 \"Hello world!\" /usr/sbin/asterisk dongle0");
           System.out.println();
           System.exit(0);
    }

    Sms s=new Sms(args[0],args[1]);

        List<SmsRaw> smsRaw=SmsPrep.getSmsPrep(s);
        
        smsRaw.forEach((sraw) -> {
          
          AsteriskInterface.send(sraw,args[2],args[3]);
            
        });
    }
    
}
