package priv.edward.graduationdesign.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PensionEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PensionEventExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPeidIsNull() {
            addCriterion("peId is null");
            return (Criteria) this;
        }

        public Criteria andPeidIsNotNull() {
            addCriterion("peId is not null");
            return (Criteria) this;
        }

        public Criteria andPeidEqualTo(Integer value) {
            addCriterion("peId =", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotEqualTo(Integer value) {
            addCriterion("peId <>", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThan(Integer value) {
            addCriterion("peId >", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("peId >=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThan(Integer value) {
            addCriterion("peId <", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThanOrEqualTo(Integer value) {
            addCriterion("peId <=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidIn(List<Integer> values) {
            addCriterion("peId in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotIn(List<Integer> values) {
            addCriterion("peId not in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidBetween(Integer value1, Integer value2) {
            addCriterion("peId between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotBetween(Integer value1, Integer value2) {
            addCriterion("peId not between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPecataIsNull() {
            addCriterion("peCata is null");
            return (Criteria) this;
        }

        public Criteria andPecataIsNotNull() {
            addCriterion("peCata is not null");
            return (Criteria) this;
        }

        public Criteria andPecataEqualTo(String value) {
            addCriterion("peCata =", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataNotEqualTo(String value) {
            addCriterion("peCata <>", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataGreaterThan(String value) {
            addCriterion("peCata >", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataGreaterThanOrEqualTo(String value) {
            addCriterion("peCata >=", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataLessThan(String value) {
            addCriterion("peCata <", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataLessThanOrEqualTo(String value) {
            addCriterion("peCata <=", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataLike(String value) {
            addCriterion("peCata like", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataNotLike(String value) {
            addCriterion("peCata not like", value, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataIn(List<String> values) {
            addCriterion("peCata in", values, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataNotIn(List<String> values) {
            addCriterion("peCata not in", values, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataBetween(String value1, String value2) {
            addCriterion("peCata between", value1, value2, "pecata");
            return (Criteria) this;
        }

        public Criteria andPecataNotBetween(String value1, String value2) {
            addCriterion("peCata not between", value1, value2, "pecata");
            return (Criteria) this;
        }

        public Criteria andPestartdateIsNull() {
            addCriterion("peStartDate is null");
            return (Criteria) this;
        }

        public Criteria andPestartdateIsNotNull() {
            addCriterion("peStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andPestartdateEqualTo(Date value) {
            addCriterionForJDBCDate("peStartDate =", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("peStartDate <>", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("peStartDate >", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peStartDate >=", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateLessThan(Date value) {
            addCriterionForJDBCDate("peStartDate <", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peStartDate <=", value, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateIn(List<Date> values) {
            addCriterionForJDBCDate("peStartDate in", values, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("peStartDate not in", values, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peStartDate between", value1, value2, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPestartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peStartDate not between", value1, value2, "pestartdate");
            return (Criteria) this;
        }

        public Criteria andPeenddateIsNull() {
            addCriterion("peEndDate is null");
            return (Criteria) this;
        }

        public Criteria andPeenddateIsNotNull() {
            addCriterion("peEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andPeenddateEqualTo(Date value) {
            addCriterionForJDBCDate("peEndDate =", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("peEndDate <>", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("peEndDate >", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peEndDate >=", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateLessThan(Date value) {
            addCriterionForJDBCDate("peEndDate <", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("peEndDate <=", value, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateIn(List<Date> values) {
            addCriterionForJDBCDate("peEndDate in", values, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("peEndDate not in", values, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peEndDate between", value1, value2, "peenddate");
            return (Criteria) this;
        }

        public Criteria andPeenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("peEndDate not between", value1, value2, "peenddate");
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