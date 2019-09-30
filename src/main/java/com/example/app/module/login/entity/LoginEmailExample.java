package com.example.app.module.login.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LoginEmailExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andReCodeIsNull() {
            addCriterion("re_code is null");
            return (Criteria) this;
        }

        public Criteria andReCodeIsNotNull() {
            addCriterion("re_code is not null");
            return (Criteria) this;
        }

        public Criteria andReCodeEqualTo(Integer value) {
            addCriterion("re_code =", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeNotEqualTo(Integer value) {
            addCriterion("re_code <>", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeGreaterThan(Integer value) {
            addCriterion("re_code >", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_code >=", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeLessThan(Integer value) {
            addCriterion("re_code <", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeLessThanOrEqualTo(Integer value) {
            addCriterion("re_code <=", value, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeIn(List<Integer> values) {
            addCriterion("re_code in", values, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeNotIn(List<Integer> values) {
            addCriterion("re_code not in", values, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeBetween(Integer value1, Integer value2) {
            addCriterion("re_code between", value1, value2, "reCode");
            return (Criteria) this;
        }

        public Criteria andReCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("re_code not between", value1, value2, "reCode");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andVfcCodeIsNull() {
            addCriterion("vfc_code is null");
            return (Criteria) this;
        }

        public Criteria andVfcCodeIsNotNull() {
            addCriterion("vfc_code is not null");
            return (Criteria) this;
        }

        public Criteria andVfcCodeEqualTo(String value) {
            addCriterion("vfc_code =", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeNotEqualTo(String value) {
            addCriterion("vfc_code <>", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeGreaterThan(String value) {
            addCriterion("vfc_code >", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vfc_code >=", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeLessThan(String value) {
            addCriterion("vfc_code <", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeLessThanOrEqualTo(String value) {
            addCriterion("vfc_code <=", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeLike(String value) {
            addCriterion("vfc_code like", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeNotLike(String value) {
            addCriterion("vfc_code not like", value, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeIn(List<String> values) {
            addCriterion("vfc_code in", values, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeNotIn(List<String> values) {
            addCriterion("vfc_code not in", values, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeBetween(String value1, String value2) {
            addCriterion("vfc_code between", value1, value2, "vfcCode");
            return (Criteria) this;
        }

        public Criteria andVfcCodeNotBetween(String value1, String value2) {
            addCriterion("vfc_code not between", value1, value2, "vfcCode");
            return (Criteria) this;
        }
    }

    /**
     */
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