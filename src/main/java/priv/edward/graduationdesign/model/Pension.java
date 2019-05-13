package priv.edward.graduationdesign.model;

public class Pension {
    private Integer pensionid;

    private Float pensionbalance;

    private Float pensionavg;

    private Float pensionadd;

    private Float pensionmonthly;

    private String pensionstate;

    private Integer staffid;

    public Pension(Integer pensionid, Float pensionbalance, Float pensionavg, Float pensionadd, Float pensionmonthly, String pensionstate, Integer staffid) {
        this.pensionid = pensionid;
        this.pensionbalance = pensionbalance;
        this.pensionavg = pensionavg;
        this.pensionadd = pensionadd;
        this.pensionmonthly = pensionmonthly;
        this.pensionstate = pensionstate;
        this.staffid = staffid;
    }

    public Pension() {
        super();
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
        this.pensionstate = pensionstate == null ? null : pensionstate.trim();
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    @Override
    public String toString() {
        return "Pension{" +
                "pensionid=" + pensionid +
                ", pensionbalance=" + pensionbalance +
                ", pensionavg=" + pensionavg +
                ", pensionadd=" + pensionadd +
                ", pensionmonthly=" + pensionmonthly +
                ", pensionstate='" + pensionstate + '\'' +
                ", staffid=" + staffid +
                '}';
    }
}