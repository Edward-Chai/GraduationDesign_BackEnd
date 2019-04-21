package priv.edward.graduationdesign.model;

public class StaffState {
    private Integer ssid;

    private String ssname;

    public StaffState(Integer ssid, String ssname) {
        this.ssid = ssid;
        this.ssname = ssname;
    }

    public StaffState() {
        super();
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname == null ? null : ssname.trim();
    }
}