package priv.edward.graduationdesign.model;

import java.util.Date;

public class Staff {
    private Integer staffid;

    private String staffname;

    private String staffgender;

    private Float salary;

    private Integer jobid;

    private Date birthday;

    private Date employmentdate;

    private Integer ssid;

    private String imagepath;

    public Staff(Integer staffid, String staffname, String staffgender, Float salary, Integer jobid, Date birthday, Date employmentdate, Integer ssid, String imagepath) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.staffgender = staffgender;
        this.salary = salary;
        this.jobid = jobid;
        this.birthday = birthday;
        this.employmentdate = employmentdate;
        this.ssid = ssid;
        this.imagepath = imagepath;
    }

    public Staff() {
        super();
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
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffgender() {
        return staffgender;
    }

    public void setStaffgender(String staffgender) {
        this.staffgender = staffgender == null ? null : staffgender.trim();
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

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }
}