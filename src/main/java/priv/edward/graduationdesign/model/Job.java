package priv.edward.graduationdesign.model;

public class Job {
    private Integer jobid;

    private String jobname;

    private String specificity;

    public Job(Integer jobid, String jobname, String specificity) {
        this.jobid = jobid;
        this.jobname = jobname;
        this.specificity = specificity;
    }

    public Job() {
        super();
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getSpecificity() {
        return specificity;
    }

    public void setSpecificity(String specificity) {
        this.specificity = specificity == null ? null : specificity.trim();
    }
}