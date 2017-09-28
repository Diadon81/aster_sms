package diadon.sms.app;
import diadon.sms.interfaces.printInterface;
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
        System.out.println("Test");
        Sms s=new Sms("79637108412","The punishments could be severe. The EU has a reputation for hitting companies that don't play by its rules hard. Earlier this year, it ordered Google to pay $2.8 billion in an antitrust fine. On Wednesday, it announced a $1 billion penalty for truck manufacturer Scania for participating in a cartel. Several European countries aren't waiting for the EU to act. They're already pushing through strict laws punishing social media companies for being too lax when it comes to illegal hate speech.");
        
        List<SmsRaw> smsRaw=SmsPrep.getSmsPrep(s);
        smsRaw.forEach((sraw) -> {
            printInterface.print(sraw);
        });
    }
    
}
