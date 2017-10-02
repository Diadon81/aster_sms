/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadon.sms.logic;

import java.io.UnsupportedEncodingException;

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
        setPduType(pdu_type);
        setTpMr(tp_mr);
        setTpDa(tp_da);
        setTpPid(tp_pid);
        setTpDcs(tp_dcs);
        setTpVp(tp_vp);
        setTpUdl(tp_udl);
        setTpUdh(tp_udh);
        setTpUd(tp_ud);
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
    public String getPduType() {
        return pdu_type;
    }

    /**
     * @param pdu_type the pdu_type to set
     */
    public void setPduType(String pdu_type) {
        this.pdu_type = pdu_type;
    }

    /**
     * @return the tp_mr
     */
    public String getTpMr() {
        return tp_mr;
    }

    /**
     * @param tp_mr the tp_mr to set
     */
    public void setTpMr(String tp_mr) {
        this.tp_mr = tp_mr;
    }

    /**
     * @return the tp_da
     */
    public String getTpDa() {
        return tp_da;
    }

    /**
     * @param tp_da the tp_da to set
     */
    public void setTpDa(String tp_da) {
        this.tp_da = tp_da;
    }

    /**
     * @return the tp_pid
     */
    public String getTpPid() {
        return tp_pid;
    }

    /**
     * @param tp_pid the tp_pid to set
     */
    public void setTpPid(String tp_pid) {
        this.tp_pid = tp_pid;
    }

    /**
     * @return the tp_dcs
     */
    public String getTpDcs() {
        return tp_dcs;
    }

    /**
     * @param tp_dcs the tp_dcs to set
     */
    public void setTpDcs(String tp_dcs) {
        this.tp_dcs = tp_dcs;
    }

    /**
     * @return the tp_vp
     */
    public String getTpVp() {
        return tp_vp;
    }

    /**
     * @param tp_vp the tp_vp to set
     */
    public void setTpVp(String tp_vp) {
        this.tp_vp = tp_vp;
    }

    /**
     * @return the tp_udl
     */
    public String getTpUdl() {
        return tp_udl;
    }

    /**
     * @param tp_udl the tp_udl to set
     */
    public void setTpUdl(String tp_udl) {
        this.tp_udl = tp_udl;
    }

    /**
     * @return the tp_udh
     */
    public String getTpUdh() {
        return tp_udh;
    }

    /**
     * @param tp_udh the tp_udh to set
     */
    public void setTpUdh(String tp_udh) {
        this.tp_udh = tp_udh;
    }

    /**
     * @return the tp_ud
     */
    public String getTpUd() {
      
        return tp_ud;
    }
    
    public String getTpUdEncoded(){
     return tp_ud;
    }

    /**
     * @param tp_ud the tp_ud to set
     */
    public void setTpUd(String tp_ud) {
        
        try {
            
           tp_ud=encodeUCS2HEX(tp_ud);
           this.tp_ud=tp_ud;
        } catch (UnsupportedEncodingException e) {
            
            System.out.println("Error encode to UCS2");
        }
        
          
        this.tp_ud = tp_ud;
    }
    
    
    public static String encodeUCS2HEX(String messageContent) throws UnsupportedEncodingException {
    byte[] bytes = messageContent.getBytes("UTF-16BE");

    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
        sb.append(String.format("%02x", b));
    }

    return sb.toString();
} 
   
    
}
