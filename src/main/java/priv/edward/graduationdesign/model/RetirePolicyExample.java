package priv.edward.graduationdesign.model;

import java.util.ArrayList;
import java.util.List;

public class RetirePolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RetirePolicyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRpidIsNull() {
            addCriterion("rpId is null");
            return (Criteria) this;
        }

        public Criteria andRpidIsNotNull() {
            addCriterion("rpId is not null");
            return (Criteria) this;
        }

        public Criteria andRpidEqualTo(Integer value) {
            addCriterion("rpId =", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotEqualTo(Integer value) {
            addCriterion("rpId <>", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThan(Integer value) {
            addCriterion("rpId >", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpId >=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThan(Integer value) {
            addCriterion("rpId <", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidLessThanOrEqualTo(Integer value) {
            addCriterion("rpId <=", value, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidIn(List<Integer> values) {
            addCriterion("rpId in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotIn(List<Integer> values) {
            addCriterion("rpId not in", values, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidBetween(Integer value1, Integer value2) {
            addCriterion("rpId between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpidNotBetween(Integer value1, Integer value2) {
            addCriterion("rpId not between", value1, value2, "rpid");
            return (Criteria) this;
        }

        public Criteria andRpregionIsNull() {
            addCriterion("rpRegion is null");
            return (Criteria) this;
        }

        public Criteria andRpregionIsNotNull() {
            addCriterion("rpRegion is not null");
            return (Criteria) this;
        }

        public Criteria andRpregionEqualTo(String value) {
            addCriterion("rpRegion =", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionNotEqualTo(String value) {
            addCriterion("rpRegion <>", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionGreaterThan(String value) {
            addCriterion("rpRegion >", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionGreaterThanOrEqualTo(String value) {
            addCriterion("rpRegion >=", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionLessThan(String value) {
            addCriterion("rpRegion <", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionLessThanOrEqualTo(String value) {
            addCriterion("rpRegion <=", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionLike(String value) {
            addCriterion("rpRegion like", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionNotLike(String value) {
            addCriterion("rpRegion not like", value, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionIn(List<String> values) {
            addCriterion("rpRegion in", values, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionNotIn(List<String> values) {
            addCriterion("rpRegion not in", values, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionBetween(String value1, String value2) {
            addCriterion("rpRegion between", value1, value2, "rpregion");
            return (Criteria) this;
        }

        public Criteria andRpregionNotBetween(String value1, String value2) {
            addCriterion("rpRegion not between", value1, value2, "rpregion");
            return (Criteria) this;
        }

        public Criteria andNormalagemIsNull() {
            addCriterion("normalAgeM is null");
            return (Criteria) this;
        }

        public Criteria andNormalagemIsNotNull() {
            addCriterion("normalAgeM is not null");
            return (Criteria) this;
        }

        public Criteria andNormalagemEqualTo(Integer value) {
            addCriterion("normalAgeM =", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemNotEqualTo(Integer value) {
            addCriterion("normalAgeM <>", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemGreaterThan(Integer value) {
            addCriterion("normalAgeM >", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemGreaterThanOrEqualTo(Integer value) {
            addCriterion("normalAgeM >=", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemLessThan(Integer value) {
            addCriterion("normalAgeM <", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemLessThanOrEqualTo(Integer value) {
            addCriterion("normalAgeM <=", value, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemIn(List<Integer> values) {
            addCriterion("normalAgeM in", values, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemNotIn(List<Integer> values) {
            addCriterion("normalAgeM not in", values, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemBetween(Integer value1, Integer value2) {
            addCriterion("normalAgeM between", value1, value2, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagemNotBetween(Integer value1, Integer value2) {
            addCriterion("normalAgeM not between", value1, value2, "normalagem");
            return (Criteria) this;
        }

        public Criteria andNormalagefIsNull() {
            addCriterion("normalAgeF is null");
            return (Criteria) this;
        }

        public Criteria andNormalagefIsNotNull() {
            addCriterion("normalAgeF is not null");
            return (Criteria) this;
        }

        public Criteria andNormalagefEqualTo(Integer value) {
            addCriterion("normalAgeF =", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefNotEqualTo(Integer value) {
            addCriterion("normalAgeF <>", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefGreaterThan(Integer value) {
            addCriterion("normalAgeF >", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefGreaterThanOrEqualTo(Integer value) {
            addCriterion("normalAgeF >=", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefLessThan(Integer value) {
            addCriterion("normalAgeF <", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefLessThanOrEqualTo(Integer value) {
            addCriterion("normalAgeF <=", value, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefIn(List<Integer> values) {
            addCriterion("normalAgeF in", values, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefNotIn(List<Integer> values) {
            addCriterion("normalAgeF not in", values, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefBetween(Integer value1, Integer value2) {
            addCriterion("normalAgeF between", value1, value2, "normalagef");
            return (Criteria) this;
        }

        public Criteria andNormalagefNotBetween(Integer value1, Integer value2) {
            addCriterion("normalAgeF not between", value1, value2, "normalagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemIsNull() {
            addCriterion("specialJobAgeM is null");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemIsNotNull() {
            addCriterion("specialJobAgeM is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemEqualTo(Integer value) {
            addCriterion("specialJobAgeM =", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemNotEqualTo(Integer value) {
            addCriterion("specialJobAgeM <>", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemGreaterThan(Integer value) {
            addCriterion("specialJobAgeM >", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialJobAgeM >=", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemLessThan(Integer value) {
            addCriterion("specialJobAgeM <", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemLessThanOrEqualTo(Integer value) {
            addCriterion("specialJobAgeM <=", value, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemIn(List<Integer> values) {
            addCriterion("specialJobAgeM in", values, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemNotIn(List<Integer> values) {
            addCriterion("specialJobAgeM not in", values, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemBetween(Integer value1, Integer value2) {
            addCriterion("specialJobAgeM between", value1, value2, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagemNotBetween(Integer value1, Integer value2) {
            addCriterion("specialJobAgeM not between", value1, value2, "specialjobagem");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefIsNull() {
            addCriterion("specialJobAgeF is null");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefIsNotNull() {
            addCriterion("specialJobAgeF is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefEqualTo(Integer value) {
            addCriterion("specialJobAgeF =", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefNotEqualTo(Integer value) {
            addCriterion("specialJobAgeF <>", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefGreaterThan(Integer value) {
            addCriterion("specialJobAgeF >", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialJobAgeF >=", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefLessThan(Integer value) {
            addCriterion("specialJobAgeF <", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefLessThanOrEqualTo(Integer value) {
            addCriterion("specialJobAgeF <=", value, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefIn(List<Integer> values) {
            addCriterion("specialJobAgeF in", values, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefNotIn(List<Integer> values) {
            addCriterion("specialJobAgeF not in", values, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefBetween(Integer value1, Integer value2) {
            addCriterion("specialJobAgeF between", value1, value2, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andSpecialjobagefNotBetween(Integer value1, Integer value2) {
            addCriterion("specialJobAgeF not between", value1, value2, "specialjobagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemIsNull() {
            addCriterion("bankruptcyAgeM is null");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemIsNotNull() {
            addCriterion("bankruptcyAgeM is not null");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemEqualTo(Integer value) {
            addCriterion("bankruptcyAgeM =", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemNotEqualTo(Integer value) {
            addCriterion("bankruptcyAgeM <>", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemGreaterThan(Integer value) {
            addCriterion("bankruptcyAgeM >", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankruptcyAgeM >=", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemLessThan(Integer value) {
            addCriterion("bankruptcyAgeM <", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemLessThanOrEqualTo(Integer value) {
            addCriterion("bankruptcyAgeM <=", value, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemIn(List<Integer> values) {
            addCriterion("bankruptcyAgeM in", values, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemNotIn(List<Integer> values) {
            addCriterion("bankruptcyAgeM not in", values, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemBetween(Integer value1, Integer value2) {
            addCriterion("bankruptcyAgeM between", value1, value2, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagemNotBetween(Integer value1, Integer value2) {
            addCriterion("bankruptcyAgeM not between", value1, value2, "bankruptcyagem");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefIsNull() {
            addCriterion("bankruptcyAgeF is null");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefIsNotNull() {
            addCriterion("bankruptcyAgeF is not null");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefEqualTo(Integer value) {
            addCriterion("bankruptcyAgeF =", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefNotEqualTo(Integer value) {
            addCriterion("bankruptcyAgeF <>", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefGreaterThan(Integer value) {
            addCriterion("bankruptcyAgeF >", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankruptcyAgeF >=", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefLessThan(Integer value) {
            addCriterion("bankruptcyAgeF <", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefLessThanOrEqualTo(Integer value) {
            addCriterion("bankruptcyAgeF <=", value, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefIn(List<Integer> values) {
            addCriterion("bankruptcyAgeF in", values, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefNotIn(List<Integer> values) {
            addCriterion("bankruptcyAgeF not in", values, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefBetween(Integer value1, Integer value2) {
            addCriterion("bankruptcyAgeF between", value1, value2, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andBankruptcyagefNotBetween(Integer value1, Integer value2) {
            addCriterion("bankruptcyAgeF not between", value1, value2, "bankruptcyagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagemIsNull() {
            addCriterion("illnessAgeM is null");
            return (Criteria) this;
        }

        public Criteria andIllnessagemIsNotNull() {
            addCriterion("illnessAgeM is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessagemEqualTo(Integer value) {
            addCriterion("illnessAgeM =", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemNotEqualTo(Integer value) {
            addCriterion("illnessAgeM <>", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemGreaterThan(Integer value) {
            addCriterion("illnessAgeM >", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemGreaterThanOrEqualTo(Integer value) {
            addCriterion("illnessAgeM >=", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemLessThan(Integer value) {
            addCriterion("illnessAgeM <", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemLessThanOrEqualTo(Integer value) {
            addCriterion("illnessAgeM <=", value, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemIn(List<Integer> values) {
            addCriterion("illnessAgeM in", values, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemNotIn(List<Integer> values) {
            addCriterion("illnessAgeM not in", values, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemBetween(Integer value1, Integer value2) {
            addCriterion("illnessAgeM between", value1, value2, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagemNotBetween(Integer value1, Integer value2) {
            addCriterion("illnessAgeM not between", value1, value2, "illnessagem");
            return (Criteria) this;
        }

        public Criteria andIllnessagefIsNull() {
            addCriterion("illnessAgeF is null");
            return (Criteria) this;
        }

        public Criteria andIllnessagefIsNotNull() {
            addCriterion("illnessAgeF is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessagefEqualTo(Integer value) {
            addCriterion("illnessAgeF =", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefNotEqualTo(Integer value) {
            addCriterion("illnessAgeF <>", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefGreaterThan(Integer value) {
            addCriterion("illnessAgeF >", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefGreaterThanOrEqualTo(Integer value) {
            addCriterion("illnessAgeF >=", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefLessThan(Integer value) {
            addCriterion("illnessAgeF <", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefLessThanOrEqualTo(Integer value) {
            addCriterion("illnessAgeF <=", value, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefIn(List<Integer> values) {
            addCriterion("illnessAgeF in", values, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefNotIn(List<Integer> values) {
            addCriterion("illnessAgeF not in", values, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefBetween(Integer value1, Integer value2) {
            addCriterion("illnessAgeF between", value1, value2, "illnessagef");
            return (Criteria) this;
        }

        public Criteria andIllnessagefNotBetween(Integer value1, Integer value2) {
            addCriterion("illnessAgeF not between", value1, value2, "illnessagef");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}