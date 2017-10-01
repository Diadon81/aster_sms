/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.logic;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author S00728979
 */
public final class SmsRaw {
    private String sca;
    private String pdu_type;
    private String tp_mr;
    private String tp_da;
    private String tp_pid;
    private String tp_dcs;
    private String tp_vp;
    private String tp_udl;
    private String tp_udh;
    private String tp_ud;
    
    
    /* Default constructor */
    public SmsRaw() {
       

}
    public SmsRaw(String sca, String pdu_type, String tp_mr, String tp_da, String tp_pid, String tp_dcs, String tp_vp, String tp_udl, String tp_udh, String tp_ud) {
        setSca(sca);
        setPdu_type(pdu_type);
        setTp_mr(tp_mr);
        setTp_da(tp_da);
        setTp_pid(tp_pid);
        setTp_dcs(tp_dcs);
        setTp_vp(tp_vp);
        setTp_udl(tp_udl);
        setTp_udh(tp_udh);
        setTp_ud(tp_ud);
    }
   
    /**
     * @return the sca
     */
    public String getSca() {
        return sca;
    }

    /**
     * @param sca the sca to set
     */
    public void setSca(String sca) {
        this.sca = sca;
    }

    /**
     * @return the pdu_type
     */
    public String getPdu_type() {
        return pdu_type;
    }

    /**
     * @param pdu_type the pdu_type to set
     */
    public void setPdu_type(String pdu_type) {
        this.pdu_type = pdu_type;
    }

    /**
     * @return the tp_mr
     */
    public String getTp_mr() {
        return tp_mr;
    }

    /**
     * @param tp_mr the tp_mr to set
     */
    public void setTp_mr(String tp_mr) {
        this.tp_mr = tp_mr;
    }

    /**
     * @return the tp_da
     */
    public String getTp_da() {
        return tp_da;
    }

    /**
     * @param tp_da the tp_da to set
     */
    public void setTp_da(String tp_da) {
        this.tp_da = tp_da;
    }

    /**
     * @return the tp_pid
     */
    public String getTp_pid() {
        return tp_pid;
    }

    /**
     * @param tp_pid the tp_pid to set
     */
    public void setTp_pid(String tp_pid) {
        this.tp_pid = tp_pid;
    }

    /**
     * @return the tp_dcs
     */
    public String getTp_dcs() {
        return tp_dcs;
    }

    /**
     * @param tp_dcs the tp_dcs to set
     */
    public void setTp_dcs(String tp_dcs) {
        this.tp_dcs = tp_dcs;
    }

    /**
     * @return the tp_vp
     */
    public String getTp_vp() {
        return tp_vp;
    }

    /**
     * @param tp_vp the tp_vp to set
     */
    public void setTp_vp(String tp_vp) {
        this.tp_vp = tp_vp;
    }

    /**
     * @return the tp_udl
     */
    public String getTp_udl() {
        return tp_udl;
    }

    /**
     * @param tp_udl the tp_udl to set
     */
    public void setTp_udl(String tp_udl) {
        this.tp_udl = tp_udl;
    }

    /**
     * @return the tp_udh
     */
    public String getTp_udh() {
        return tp_udh;
    }

    /**
     * @param tp_udh the tp_udh to set
     */
    public void setTp_udh(String tp_udh) {
        this.tp_udh = tp_udh;
    }

    /**
     * @return the tp_ud
     */
    public String getTp_ud() {
      
        return tp_ud;
    }
    
    public String getTp_ud_encoded(){
     return tp_ud;
    }

    /**
     * @param tp_ud the tp_ud to set
     */
    public void setTp_ud(String tp_ud) {
        
        try {
            
           tp_ud=encodeUCS2HEX(tp_ud);
           this.tp_ud=tp_ud;
        } catch (UnsupportedEncodingException e) {
            
            System.out.println("Error encode to UCS2");
        }
        
          
        this.tp_ud = tp_ud;
    }
    
    
    static String encodeUCS2HEX(String messageContent) throws UnsupportedEncodingException {
    byte[] bytes = messageContent.getBytes("UTF-16BE");

    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
        sb.append(String.format("%02x", b));
    }

    return sb.toString();
} 
   
    
}
