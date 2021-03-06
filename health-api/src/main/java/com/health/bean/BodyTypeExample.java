package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BodyTypeExample implements Serializable {

    private static final long serialVersionUID = 510055985695043824L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BodyTypeExample() {
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

        public Criteria andTMemberIdIsNull() {
            addCriterion("t_member_id is null");
            return (Criteria) this;
        }

        public Criteria andTMemberIdIsNotNull() {
            addCriterion("t_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andTMemberIdEqualTo(Integer value) {
            addCriterion("t_member_id =", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotEqualTo(Integer value) {
            addCriterion("t_member_id <>", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdGreaterThan(Integer value) {
            addCriterion("t_member_id >", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_member_id >=", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdLessThan(Integer value) {
            addCriterion("t_member_id <", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_member_id <=", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdIn(List<Integer> values) {
            addCriterion("t_member_id in", values, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotIn(List<Integer> values) {
            addCriterion("t_member_id not in", values, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("t_member_id between", value1, value2, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_member_id not between", value1, value2, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaIsNull() {
            addCriterion("t_qi_asthenia is null");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaIsNotNull() {
            addCriterion("t_qi_asthenia is not null");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaEqualTo(Integer value) {
            addCriterion("t_qi_asthenia =", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaNotEqualTo(Integer value) {
            addCriterion("t_qi_asthenia <>", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaGreaterThan(Integer value) {
            addCriterion("t_qi_asthenia >", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_qi_asthenia >=", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaLessThan(Integer value) {
            addCriterion("t_qi_asthenia <", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaLessThanOrEqualTo(Integer value) {
            addCriterion("t_qi_asthenia <=", value, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaIn(List<Integer> values) {
            addCriterion("t_qi_asthenia in", values, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaNotIn(List<Integer> values) {
            addCriterion("t_qi_asthenia not in", values, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaBetween(Integer value1, Integer value2) {
            addCriterion("t_qi_asthenia between", value1, value2, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTQiAstheniaNotBetween(Integer value1, Integer value2) {
            addCriterion("t_qi_asthenia not between", value1, value2, "tQiAsthenia");
            return (Criteria) this;
        }

        public Criteria andTYangQualityIsNull() {
            addCriterion("t_yang_quality is null");
            return (Criteria) this;
        }

        public Criteria andTYangQualityIsNotNull() {
            addCriterion("t_yang_quality is not null");
            return (Criteria) this;
        }

        public Criteria andTYangQualityEqualTo(Integer value) {
            addCriterion("t_yang_quality =", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityNotEqualTo(Integer value) {
            addCriterion("t_yang_quality <>", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityGreaterThan(Integer value) {
            addCriterion("t_yang_quality >", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_yang_quality >=", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityLessThan(Integer value) {
            addCriterion("t_yang_quality <", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityLessThanOrEqualTo(Integer value) {
            addCriterion("t_yang_quality <=", value, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityIn(List<Integer> values) {
            addCriterion("t_yang_quality in", values, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityNotIn(List<Integer> values) {
            addCriterion("t_yang_quality not in", values, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityBetween(Integer value1, Integer value2) {
            addCriterion("t_yang_quality between", value1, value2, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYangQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("t_yang_quality not between", value1, value2, "tYangQuality");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyIsNull() {
            addCriterion("t_yin_deficiency is null");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyIsNotNull() {
            addCriterion("t_yin_deficiency is not null");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyEqualTo(Integer value) {
            addCriterion("t_yin_deficiency =", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyNotEqualTo(Integer value) {
            addCriterion("t_yin_deficiency <>", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyGreaterThan(Integer value) {
            addCriterion("t_yin_deficiency >", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_yin_deficiency >=", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyLessThan(Integer value) {
            addCriterion("t_yin_deficiency <", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyLessThanOrEqualTo(Integer value) {
            addCriterion("t_yin_deficiency <=", value, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyIn(List<Integer> values) {
            addCriterion("t_yin_deficiency in", values, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyNotIn(List<Integer> values) {
            addCriterion("t_yin_deficiency not in", values, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyBetween(Integer value1, Integer value2) {
            addCriterion("t_yin_deficiency between", value1, value2, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andTYinDeficiencyNotBetween(Integer value1, Integer value2) {
            addCriterion("t_yin_deficiency not between", value1, value2, "tYinDeficiency");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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