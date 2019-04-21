package priv.edward.graduationdesign.model;

import java.util.Date;

public class PensionEvent {
    private Integer peid;

    private String pecata;

    private Date pestartdate;

    private Date peenddate;

    public PensionEvent(Integer peid, String pecata, Date pestartdate, Date peenddate) {
        this.peid = peid;
        this.pecata = pecata;
        this.pestartdate = pestartdate;
        this.peenddate = peenddate;
    }

    public PensionEvent() {
        super();
    }

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }

    public String getPecata() {
        return pecata;
    }

    public void setPecata(String pecata) {
        this.pecata = pecata == null ? null : pecata.trim();
    }

    public Date getPestartdate() {
        return pestartdate;
    }

    public void setPestartdate(Date pestartdate) {
        this.pestartdate = pestartdate;
    }

    public Date getPeenddate() {
        return peenddate;
    }

    public void setPeenddate(Date peenddate) {
        this.peenddate = peenddate;
    }
}