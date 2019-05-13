package priv.edward.graduationdesign.model;

import java.util.List;

public class PensionStaffInfo {
    private Integer pensionid;

    private Float pensionbalance;

    private Float pensionavg;

    private Float pensionadd;

    private Float pensionmonthly;

    private String pensionstate;

    private Integer staffid;

    private StaffInfo staffInfo;

//    private Staff staff;

//    private List<Staff> staffList;

//    private List<StaffState> staffStateList;


    public PensionStaffInfo() {
    }

    public PensionStaffInfo(Integer pensionid, Float pensionbalance, Float pensionavg, Float pensionadd, Float pensionmonthly, String pensionstate, Integer staffid, StaffInfo staffInfo) {
        this.pensionid = pensionid;
        this.pensionbalance = pensionbalance;
        this.pensionavg = pensionavg;
        this.pensionadd = pensionadd;
        this.pensionmonthly = pensionmonthly;
        this.pensionstate = pensionstate;
        this.staffid = staffid;
        this.staffInfo = staffInfo;
    }

    public Integer getPensionid() {
        return pensionid;
    }

    public void setPensionid(Integer pensionid) {
        this.pensionid = pensionid;
    }

    public Float getPensionbalance() {
        return pensionbalance;
    }

    public void setPensionbalance(Float pensionbalance) {
        this.pensionbalance = pensionbalance;
    }

    public Float getPensionavg() {
        return pensionavg;
    }

    public void setPensionavg(Float pensionavg) {
        this.pensionavg = pensionavg;
    }

    public Float getPensionadd() {
        return pensionadd;
    }

    public void setPensionadd(Float pensionadd) {
        this.pensionadd = pensionadd;
    }

    public Float getPensionmonthly() {
        return pensionmonthly;
    }

    public void setPensionmonthly(Float pensionmonthly) {
        this.pensionmonthly = pensionmonthly;
    }

    public String getPensionstate() {
        return pensionstate;
    }

    public void setPensionstate(String pensionstate) {
        this.pensionstate = pensionstate;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public StaffInfo getStaffInfo() {
        return staffInfo;
    }

    public void setStaffInfo(StaffInfo staffInfo) {
        this.staffInfo = staffInfo;
    }
}
