package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 会员病史Example类
 */
public class MemberMedicalhistoryExample implements Serializable {

    private static final long serialVersionUID = 3230901779648783081L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberMedicalhistoryExample() {
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

        public Criteria andPreviousHistoryIsNull() {
            addCriterion("previous_history is null");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryIsNotNull() {
            addCriterion("previous_history is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryEqualTo(String value) {
            addCriterion("previous_history =", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryNotEqualTo(String value) {
            addCriterion("previous_history <>", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryGreaterThan(String value) {
            addCriterion("previous_history >", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("previous_history >=", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryLessThan(String value) {
            addCriterion("previous_history <", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryLessThanOrEqualTo(String value) {
            addCriterion("previous_history <=", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryLike(String value) {
            addCriterion("previous_history like", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryNotLike(String value) {
            addCriterion("previous_history not like", value, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryIn(List<String> values) {
            addCriterion("previous_history in", values, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryNotIn(List<String> values) {
            addCriterion("previous_history not in", values, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryBetween(String value1, String value2) {
            addCriterion("previous_history between", value1, value2, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andPreviousHistoryNotBetween(String value1, String value2) {
            addCriterion("previous_history not between", value1, value2, "previousHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryIsNull() {
            addCriterion("family_history is null");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryIsNotNull() {
            addCriterion("family_history is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryEqualTo(String value) {
            addCriterion("family_history =", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryNotEqualTo(String value) {
            addCriterion("family_history <>", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryGreaterThan(String value) {
            addCriterion("family_history >", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("family_history >=", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryLessThan(String value) {
            addCriterion("family_history <", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryLessThanOrEqualTo(String value) {
            addCriterion("family_history <=", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryLike(String value) {
            addCriterion("family_history like", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryNotLike(String value) {
            addCriterion("family_history not like", value, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryIn(List<String> values) {
            addCriterion("family_history in", values, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryNotIn(List<String> values) {
            addCriterion("family_history not in", values, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryBetween(String value1, String value2) {
            addCriterion("family_history between", value1, value2, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andFamilyHistoryNotBetween(String value1, String value2) {
            addCriterion("family_history not between", value1, value2, "familyHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNull() {
            addCriterion("allergic_history is null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNotNull() {
            addCriterion("allergic_history is not null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryEqualTo(String value) {
            addCriterion("allergic_history =", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotEqualTo(String value) {
            addCriterion("allergic_history <>", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThan(String value) {
            addCriterion("allergic_history >", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("allergic_history >=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThan(String value) {
            addCriterion("allergic_history <", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThanOrEqualTo(String value) {
            addCriterion("allergic_history <=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLike(String value) {
            addCriterion("allergic_history like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotLike(String value) {
            addCriterion("allergic_history not like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIn(List<String> values) {
            addCriterion("allergic_history in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotIn(List<String> values) {
            addCriterion("allergic_history not in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryBetween(String value1, String value2) {
            addCriterion("allergic_history between", value1, value2, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotBetween(String value1, String value2) {
            addCriterion("allergic_history not between", value1, value2, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNull() {
            addCriterion("medical_history is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNotNull() {
            addCriterion("medical_history is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryEqualTo(String value) {
            addCriterion("medical_history =", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotEqualTo(String value) {
            addCriterion("medical_history <>", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThan(String value) {
            addCriterion("medical_history >", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medical_history >=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThan(String value) {
            addCriterion("medical_history <", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("medical_history <=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLike(String value) {
            addCriterion("medical_history like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotLike(String value) {
            addCriterion("medical_history not like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIn(List<String> values) {
            addCriterion("medical_history in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotIn(List<String> values) {
            addCriterion("medical_history not in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryBetween(String value1, String value2) {
            addCriterion("medical_history between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("medical_history not between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseIsNull() {
            addCriterion("\"chronic disease\" is null");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseIsNotNull() {
            addCriterion("\"chronic disease\" is not null");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseEqualTo(String value) {
            addCriterion("\"chronic disease\" =", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseNotEqualTo(String value) {
            addCriterion("\"chronic disease\" <>", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseGreaterThan(String value) {
            addCriterion("\"chronic disease\" >", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("\"chronic disease\" >=", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseLessThan(String value) {
            addCriterion("\"chronic disease\" <", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseLessThanOrEqualTo(String value) {
            addCriterion("\"chronic disease\" <=", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseLike(String value) {
            addCriterion("\"chronic disease\" like", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseNotLike(String value) {
            addCriterion("\"chronic disease\" not like", value, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseIn(List<String> values) {
            addCriterion("\"chronic disease\" in", values, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseNotIn(List<String> values) {
            addCriterion("\"chronic disease\" not in", values, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseBetween(String value1, String value2) {
            addCriterion("\"chronic disease\" between", value1, value2, "chronicDisease");
            return (Criteria) this;
        }

        public Criteria andChronicDiseaseNotBetween(String value1, String value2) {
            addCriterion("\"chronic disease\" not between", value1, value2, "chronicDisease");
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