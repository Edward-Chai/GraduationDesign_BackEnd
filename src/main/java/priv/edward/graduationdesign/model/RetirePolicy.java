package priv.edward.graduationdesign.model;

public class RetirePolicy {
    private Integer rpid;

    private String rpname;

    private Integer normalagem;

    private Integer normalagemc;

    private Integer normalagef;

    private Integer normalagefc;

    private Integer specialjobagem;

    private Integer specialjobagemc;

    private Integer specialjobagef;

    private Integer specialjobagefc;

    private Integer bankruptcyagem;

    private Integer bankruptcyagemc;

    private Integer bankruptcyagef;

    private Integer bankruptcyagefc;

    private Integer illnessagem;

    private Integer illnessagemc;

    private Integer illnessagef;

    private Integer illnessagefc;

    private Integer industrialaccidentagem;

    private Integer industrialaccidentagemc;

    private Integer industrialaccidentagef;

    private Integer industrialaccidentagefc;

    public RetirePolicy(Integer rpid, String rpname, Integer normalagem, Integer normalagemc, Integer normalagef, Integer normalagefc, Integer specialjobagem, Integer specialjobagemc, Integer specialjobagef, Integer specialjobagefc, Integer bankruptcyagem, Integer bankruptcyagemc, Integer bankruptcyagef, Integer bankruptcyagefc, Integer illnessagem, Integer illnessagemc, Integer illnessagef, Integer illnessagefc, Integer industrialaccidentagem, Integer industrialaccidentagemc, Integer industrialaccidentagef, Integer industrialaccidentagefc) {
        this.rpid = rpid;
        this.rpname = rpname;
        this.normalagem = normalagem;
        this.normalagemc = normalagemc;
        this.normalagef = normalagef;
        this.normalagefc = normalagefc;
        this.specialjobagem = specialjobagem;
        this.specialjobagemc = specialjobagemc;
        this.specialjobagef = specialjobagef;
        this.specialjobagefc = specialjobagefc;
        this.bankruptcyagem = bankruptcyagem;
        this.bankruptcyagemc = bankruptcyagemc;
        this.bankruptcyagef = bankruptcyagef;
        this.bankruptcyagefc = bankruptcyagefc;
        this.illnessagem = illnessagem;
        this.illnessagemc = illnessagemc;
        this.illnessagef = illnessagef;
        this.illnessagefc = illnessagefc;
        this.industrialaccidentagem = industrialaccidentagem;
        this.industrialaccidentagemc = industrialaccidentagemc;
        this.industrialaccidentagef = industrialaccidentagef;
        this.industrialaccidentagefc = industrialaccidentagefc;
    }

    public RetirePolicy() {
        super();
    }

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public String getRpname() {
        return rpname;
    }

    public void setRpname(String rpname) {
        this.rpname = rpname == null ? null : rpname.trim();
    }

    public Integer getNormalagem() {
        return normalagem;
    }

    public void setNormalagem(Integer normalagem) {
        this.normalagem = normalagem;
    }

    public Integer getNormalagemc() {
        return normalagemc;
    }

    public void setNormalagemc(Integer normalagemc) {
        this.normalagemc = normalagemc;
    }

    public Integer getNormalagef() {
        return normalagef;
    }

    public void setNormalagef(Integer normalagef) {
        this.normalagef = normalagef;
    }

    public Integer getNormalagefc() {
        return normalagefc;
    }

    public void setNormalagefc(Integer normalagefc) {
        this.normalagefc = normalagefc;
    }

    public Integer getSpecialjobagem() {
        return specialjobagem;
    }

    public void setSpecialjobagem(Integer specialjobagem) {
        this.specialjobagem = specialjobagem;
    }

    public Integer getSpecialjobagemc() {
        return specialjobagemc;
    }

    public void setSpecialjobagemc(Integer specialjobagemc) {
        this.specialjobagemc = specialjobagemc;
    }

    public Integer getSpecialjobagef() {
        return specialjobagef;
    }

    public void setSpecialjobagef(Integer specialjobagef) {
        this.specialjobagef = specialjobagef;
    }

    public Integer getSpecialjobagefc() {
        return specialjobagefc;
    }

    public void setSpecialjobagefc(Integer specialjobagefc) {
        this.specialjobagefc = specialjobagefc;
    }

    public Integer getBankruptcyagem() {
        return bankruptcyagem;
    }

    public void setBankruptcyagem(Integer bankruptcyagem) {
        this.bankruptcyagem = bankruptcyagem;
    }

    public Integer getBankruptcyagemc() {
        return bankruptcyagemc;
    }

    public void setBankruptcyagemc(Integer bankruptcyagemc) {
        this.bankruptcyagemc = bankruptcyagemc;
    }

    public Integer getBankruptcyagef() {
        return bankruptcyagef;
    }

    public void setBankruptcyagef(Integer bankruptcyagef) {
        this.bankruptcyagef = bankruptcyagef;
    }

    public Integer getBankruptcyagefc() {
        return bankruptcyagefc;
    }

    public void setBankruptcyagefc(Integer bankruptcyagefc) {
        this.bankruptcyagefc = bankruptcyagefc;
    }

    public Integer getIllnessagem() {
        return illnessagem;
    }

    public void setIllnessagem(Integer illnessagem) {
        this.illnessagem = illnessagem;
    }

    public Integer getIllnessagemc() {
        return illnessagemc;
    }

    public void setIllnessagemc(Integer illnessagemc) {
        this.illnessagemc = illnessagemc;
    }

    public Integer getIllnessagef() {
        return illnessagef;
    }

    public void setIllnessagef(Integer illnessagef) {
        this.illnessagef = illnessagef;
    }

    public Integer getIllnessagefc() {
        return illnessagefc;
    }

    public void setIllnessagefc(Integer illnessagefc) {
        this.illnessagefc = illnessagefc;
    }

    public Integer getIndustrialaccidentagem() {
        return industrialaccidentagem;
    }

    public void setIndustrialaccidentagem(Integer industrialaccidentagem) {
        this.industrialaccidentagem = industrialaccidentagem;
    }

    public Integer getIndustrialaccidentagemc() {
        return industrialaccidentagemc;
    }

    public void setIndustrialaccidentagemc(Integer industrialaccidentagemc) {
        this.industrialaccidentagemc = industrialaccidentagemc;
    }

    public Integer getIndustrialaccidentagef() {
        return industrialaccidentagef;
    }

    public void setIndustrialaccidentagef(Integer industrialaccidentagef) {
        this.industrialaccidentagef = industrialaccidentagef;
    }

    public Integer getIndustrialaccidentagefc() {
        return industrialaccidentagefc;
    }

    public void setIndustrialaccidentagefc(Integer industrialaccidentagefc) {
        this.industrialaccidentagefc = industrialaccidentagefc;
    }

    @Override
    public String toString() {
        return "RetirePolicy{" +
                "rpid=" + rpid +
                ", rpname='" + rpname + '\'' +
                ", normalagem=" + normalagem +
                ", normalagemc=" + normalagemc +
                ", normalagef=" + normalagef +
                ", normalagefc=" + normalagefc +
                ", specialjobagem=" + specialjobagem +
                ", specialjobagemc=" + specialjobagemc +
                ", specialjobagef=" + specialjobagef +
                ", specialjobagefc=" + specialjobagefc +
                ", bankruptcyagem=" + bankruptcyagem +
                ", bankruptcyagemc=" + bankruptcyagemc +
                ", bankruptcyagef=" + bankruptcyagef +
                ", bankruptcyagefc=" + bankruptcyagefc +
                ", illnessagem=" + illnessagem +
                ", illnessagemc=" + illnessagemc +
                ", illnessagef=" + illnessagef +
                ", illnessagefc=" + illnessagefc +
                ", industrialaccidentagem=" + industrialaccidentagem +
                ", industrialaccidentagemc=" + industrialaccidentagemc +
                ", industrialaccidentagef=" + industrialaccidentagef +
                ", industrialaccidentagefc=" + industrialaccidentagefc +
                '}';
    }
}