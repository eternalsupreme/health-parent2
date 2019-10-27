package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员体检Example类
 */
public class MemberExaminationExample implements Serializable {

    private static final long serialVersionUID = 8516244415949079646L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExaminationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("exam_date is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(Date value) {
            addCriterion("exam_date =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(Date value) {
            addCriterion("exam_date <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(Date value) {
            addCriterion("exam_date >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_date >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(Date value) {
            addCriterion("exam_date <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(Date value) {
            addCriterion("exam_date <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<Date> values) {
            addCriterion("exam_date in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<Date> values) {
            addCriterion("exam_date not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(Date value1, Date value2) {
            addCriterion("exam_date between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(Date value1, Date value2) {
            addCriterion("exam_date not between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIsNull() {
            addCriterion("setmeal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIsNotNull() {
            addCriterion("setmeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetmealIdEqualTo(Integer value) {
            addCriterion("setmeal_id =", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotEqualTo(Integer value) {
            addCriterion("setmeal_id <>", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThan(Integer value) {
            addCriterion("setmeal_id >", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id >=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThan(Integer value) {
            addCriterion("setmeal_id <", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id <=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIn(List<Integer> values) {
            addCriterion("setmeal_id in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotIn(List<Integer> values) {
            addCriterion("setmeal_id not in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id between", value1, value2, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id not between", value1, value2, "setmealId");
            return (Criteria) this;
        }

        public Criteria andReportStateIsNull() {
            addCriterion("report_state is null");
            return (Criteria) this;
        }

        public Criteria andReportStateIsNotNull() {
            addCriterion("report_state is not null");
            return (Criteria) this;
        }

        public Criteria andReportStateEqualTo(Integer value) {
            addCriterion("report_state =", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotEqualTo(Integer value) {
            addCriterion("report_state <>", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateGreaterThan(Integer value) {
            addCriterion("report_state >", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_state >=", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateLessThan(Integer value) {
            addCriterion("report_state <", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateLessThanOrEqualTo(Integer value) {
            addCriterion("report_state <=", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateIn(List<Integer> values) {
            addCriterion("report_state in", values, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotIn(List<Integer> values) {
            addCriterion("report_state not in", values, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateBetween(Integer value1, Integer value2) {
            addCriterion("report_state between", value1, value2, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotBetween(Integer value1, Integer value2) {
            addCriterion("report_state not between", value1, value2, "reportState");
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