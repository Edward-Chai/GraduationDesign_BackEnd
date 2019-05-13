package priv.edward.graduationdesign.model;

import java.util.Date;

public class StaffInfo {

    private Integer staffid;

    private String staffname;

    private String staffgender;

    private Float salary;

    private Integer jobid;

    private Date birthday;

    private Date employmentdate;

    private Integer ssid;

    private String cadre;

    private String jobname;

    private String specificity;

    private String ssname;

    public StaffInfo() {
    }

    public StaffInfo(Integer staffid, String staffname, String staffgender, Float salary, Integer jobid, Date birthday, Date employmentdate, Integer ssid, String cadre, String jobname, String specificity, String ssname) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.staffgender = staffgender;
        this.salary = salary;
        this.jobid = jobid;
        this.birthday = birthday;
        this.employmentdate = employmentdate;
        this.ssid = ssid;
        this.cadre = cadre;
        this.jobname = jobname;
        this.specificity = specificity;
        this.ssname = ssname;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffgender() {
        return staffgender;
    }

    public void setStaffgender(String staffgender) {
        this.staffgender = staffgender;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEmploymentdate() {
        return employmentdate;
    }

    public void setEmploymentdate(Date employmentdate) {
        this.employmentdate = employmentdate;
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getSpecificity() {
        return specificity;
    }

    public void setSpecificity(String specificity) {
        this.specificity = specificity;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname;
    }

    @Override
    public String toString() {
        return "StaffInfo{" +
                "staffid=" + staffid +
                ", staffname='" + staffname + '\'' +
                ", staffgender='" + staffgender + '\'' +
                ", salary=" + salary +
                ", jobid=" + jobid +
                ", birthday=" + birthday +
                ", employmentdate=" + employmentdate +
                ", ssid=" + ssid +
                ", cadre='" + cadre + '\'' +
                ", jobname='" + jobname + '\'' +
                ", specificity='" + specificity + '\'' +
                ", ssname='" + ssname + '\'' +
                '}';
    }
}
