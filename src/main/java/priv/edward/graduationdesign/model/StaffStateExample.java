package priv.edward.graduationdesign.model;

import java.util.ArrayList;
import java.util.List;

public class StaffStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffStateExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("ssId is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("ssId is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(Integer value) {
            addCriterion("ssId =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(Integer value) {
            addCriterion("ssId <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(Integer value) {
            addCriterion("ssId >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssId >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(Integer value) {
            addCriterion("ssId <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(Integer value) {
            addCriterion("ssId <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<Integer> values) {
            addCriterion("ssId in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<Integer> values) {
            addCriterion("ssId not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(Integer value1, Integer value2) {
            addCriterion("ssId between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ssId not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNull() {
            addCriterion("ssName is null");
            return (Criteria) this;
        }

        public Criteria andSsnameIsNotNull() {
            addCriterion("ssName is not null");
            return (Criteria) this;
        }

        public Criteria andSsnameEqualTo(String value) {
            addCriterion("ssName =", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotEqualTo(String value) {
            addCriterion("ssName <>", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThan(String value) {
            addCriterion("ssName >", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ssName >=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThan(String value) {
            addCriterion("ssName <", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLessThanOrEqualTo(String value) {
            addCriterion("ssName <=", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameLike(String value) {
            addCriterion("ssName like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotLike(String value) {
            addCriterion("ssName not like", value, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameIn(List<String> values) {
            addCriterion("ssName in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotIn(List<String> values) {
            addCriterion("ssName not in", values, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameBetween(String value1, String value2) {
            addCriterion("ssName between", value1, value2, "ssname");
            return (Criteria) this;
        }

        public Criteria andSsnameNotBetween(String value1, String value2) {
            addCriterion("ssName not between", value1, value2, "ssname");
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