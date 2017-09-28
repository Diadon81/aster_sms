/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.logic;


/**
 *
 * @author Diadon
 */
public class Sms {
    private String telNum;
    private String textMessage;
    
    public Sms() {
     this.telNum="";
     this.textMessage="";
        
     }
    public Sms(String telNum,String textMessage){
        setTelNum(telNum);
        setTextMessage(textMessage);
    }

    /**
     * @return the telNum
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * @param telNum the telNum to set
     */
    public final void setTelNum(String telNum)  {
         if (telNum.matches("[0-9,+,-]+")) {
            this.telNum = telNum;
        }
         else System.out.println("Wrong pattern!!!");
    }

    /**
     * @return the textMessage
     */
    public String getTextMessage() {
        return textMessage;
    }

    /**
     * @param textMessage the textMessage to set
     */
    public final void setTextMessage(String textMessage) {
 
        this.textMessage = textMessage;
    }
    @Override
    public String toString() {
        
        return telNum + " " + textMessage;
        
    }
}
