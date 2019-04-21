package priv.edward.graduationdesign.model;

public class RetirePolicy {
    private Integer rpid;

    private String rpregion;

    private Integer normalagem;

    private Integer normalagef;

    private Integer specialjobagem;

    private Integer specialjobagef;

    private Integer bankruptcyagem;

    private Integer bankruptcyagef;

    private Integer illnessagem;

    private Integer illnessagef;

    public RetirePolicy(Integer rpid, String rpregion, Integer normalagem, Integer normalagef, Integer specialjobagem, Integer specialjobagef, Integer bankruptcyagem, Integer bankruptcyagef, Integer illnessagem, Integer illnessagef) {
        this.rpid = rpid;
        this.rpregion = rpregion;
        this.normalagem = normalagem;
        this.normalagef = normalagef;
        this.specialjobagem = specialjobagem;
        this.specialjobagef = specialjobagef;
        this.bankruptcyagem = bankruptcyagem;
        this.bankruptcyagef = bankruptcyagef;
        this.illnessagem = illnessagem;
        this.illnessagef = illnessagef;
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

    public String getRpregion() {
        return rpregion;
    }

    public void setRpregion(String rpregion) {
        this.rpregion = rpregion == null ? null : rpregion.trim();
    }

    public Integer getNormalagem() {
        return normalagem;
    }

    public void setNormalagem(Integer normalagem) {
        this.normalagem = normalagem;
    }

    public Integer getNormalagef() {
        return normalagef;
    }

    public void setNormalagef(Integer normalagef) {
        this.normalagef = normalagef;
    }

    public Integer getSpecialjobagem() {
        return specialjobagem;
    }

    public void setSpecialjobagem(Integer specialjobagem) {
        this.specialjobagem = specialjobagem;
    }

    public Integer getSpecialjobagef() {
        return specialjobagef;
    }

    public void setSpecialjobagef(Integer specialjobagef) {
        this.specialjobagef = specialjobagef;
    }

    public Integer getBankruptcyagem() {
        return bankruptcyagem;
    }

    public void setBankruptcyagem(Integer bankruptcyagem) {
        this.bankruptcyagem = bankruptcyagem;
    }

    public Integer getBankruptcyagef() {
        return bankruptcyagef;
    }

    public void setBankruptcyagef(Integer bankruptcyagef) {
        this.bankruptcyagef = bankruptcyagef;
    }

    public Integer getIllnessagem() {
        return illnessagem;
    }

    public void setIllnessagem(Integer illnessagem) {
        this.illnessagem = illnessagem;
    }

    public Integer getIllnessagef() {
        return illnessagef;
    }

    public void setIllnessagef(Integer illnessagef) {
        this.illnessagef = illnessagef;
    }
}