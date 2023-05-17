// 
// 
// 

package com.stern.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public ClassExample() {
        this.oredCriteria = new ArrayList<Criteria>();
    }
    
    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }
    
    public String getOrderByClause() {
        return this.orderByClause;
    }
    
    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }
    
    public boolean isDistinct() {
        return this.distinct;
    }
    
    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }
    
    public void or(final Criteria criteria) {
        this.oredCriteria.add(criteria);
    }
    
    public Criteria or() {
        final Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }
    
    public Criteria createCriteria() {
        final Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }
    
    protected Criteria createCriteriaInternal() {
        final Criteria criteria = new Criteria();
        return criteria;
    }
    
    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }
    
    public static class Criteria extends GeneratedCriteria
    {
    }
    
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria() {
            this.criteria = new ArrayList<Criterion>();
        }
        
        public boolean isValid() {
            return this.criteria.size() > 0;
        }
        
        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }
        
        public List<Criterion> getCriteria() {
            return this.criteria;
        }
        
        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new Criterion(condition));
        }
        
        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value));
        }
        
        protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andClassidIsNull() {
            this.addCriterion("classid is null");
            return (Criteria)this;
        }
        
        public Criteria andClassidIsNotNull() {
            this.addCriterion("classid is not null");
            return (Criteria)this;
        }
        
        public Criteria andClassidEqualTo(final Integer value) {
            this.addCriterion("classid =", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidNotEqualTo(final Integer value) {
            this.addCriterion("classid <>", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidGreaterThan(final Integer value) {
            this.addCriterion("classid >", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("classid >=", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidLessThan(final Integer value) {
            this.addCriterion("classid <", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("classid <=", value, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidIn(final List<Integer> values) {
            this.addCriterion("classid in", values, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidNotIn(final List<Integer> values) {
            this.addCriterion("classid not in", values, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("classid between", value1, value2, "classid");
            return (Criteria)this;
        }
        
        public Criteria andClassidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("classid not between", value1, value2, "classid");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdIsNull() {
            this.addCriterion("course_id is null");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdIsNotNull() {
            this.addCriterion("course_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdEqualTo(final Integer value) {
            this.addCriterion("course_id =", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdNotEqualTo(final Integer value) {
            this.addCriterion("course_id <>", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdGreaterThan(final Integer value) {
            this.addCriterion("course_id >", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("course_id >=", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdLessThan(final Integer value) {
            this.addCriterion("course_id <", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("course_id <=", value, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdIn(final List<Integer> values) {
            this.addCriterion("course_id in", values, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdNotIn(final List<Integer> values) {
            this.addCriterion("course_id not in", values, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andCourseIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeIsNull() {
            this.addCriterion("classtime is null");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeIsNotNull() {
            this.addCriterion("classtime is not null");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeEqualTo(final String value) {
            this.addCriterion("classtime =", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeNotEqualTo(final String value) {
            this.addCriterion("classtime <>", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeGreaterThan(final String value) {
            this.addCriterion("classtime >", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeGreaterThanOrEqualTo(final String value) {
            this.addCriterion("classtime >=", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeLessThan(final String value) {
            this.addCriterion("classtime <", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeLessThanOrEqualTo(final String value) {
            this.addCriterion("classtime <=", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeLike(final String value) {
            this.addCriterion("classtime like", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeNotLike(final String value) {
            this.addCriterion("classtime not like", value, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeIn(final List<String> values) {
            this.addCriterion("classtime in", values, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeNotIn(final List<String> values) {
            this.addCriterion("classtime not in", values, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeBetween(final String value1, final String value2) {
            this.addCriterion("classtime between", value1, value2, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andClasstimeNotBetween(final String value1, final String value2) {
            this.addCriterion("classtime not between", value1, value2, "classtime");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdIsNull() {
            this.addCriterion("empl_id is null");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdIsNotNull() {
            this.addCriterion("empl_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdEqualTo(final Integer value) {
            this.addCriterion("empl_id =", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdNotEqualTo(final Integer value) {
            this.addCriterion("empl_id <>", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdGreaterThan(final Integer value) {
            this.addCriterion("empl_id >", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("empl_id >=", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdLessThan(final Integer value) {
            this.addCriterion("empl_id <", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("empl_id <=", value, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdIn(final List<Integer> values) {
            this.addCriterion("empl_id in", values, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdNotIn(final List<Integer> values) {
            this.addCriterion("empl_id not in", values, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("empl_id between", value1, value2, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andEmplIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("empl_id not between", value1, value2, "emplId");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeIsNull() {
            this.addCriterion("classvolume is null");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeIsNotNull() {
            this.addCriterion("classvolume is not null");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeEqualTo(final Integer value) {
            this.addCriterion("classvolume =", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeNotEqualTo(final Integer value) {
            this.addCriterion("classvolume <>", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeGreaterThan(final Integer value) {
            this.addCriterion("classvolume >", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("classvolume >=", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeLessThan(final Integer value) {
            this.addCriterion("classvolume <", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeLessThanOrEqualTo(final Integer value) {
            this.addCriterion("classvolume <=", value, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeIn(final List<Integer> values) {
            this.addCriterion("classvolume in", values, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeNotIn(final List<Integer> values) {
            this.addCriterion("classvolume not in", values, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeBetween(final Integer value1, final Integer value2) {
            this.addCriterion("classvolume between", value1, value2, "classvolume");
            return (Criteria)this;
        }
        
        public Criteria andClassvolumeNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("classvolume not between", value1, value2, "classvolume");
            return (Criteria)this;
        }
    }
    
    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        
        public String getCondition() {
            return this.condition;
        }
        
        public Object getValue() {
            return this.value;
        }
        
        public Object getSecondValue() {
            return this.secondValue;
        }
        
        public boolean isNoValue() {
            return this.noValue;
        }
        
        public boolean isSingleValue() {
            return this.singleValue;
        }
        
        public boolean isBetweenValue() {
            return this.betweenValue;
        }
        
        public boolean isListValue() {
            return this.listValue;
        }
        
        public String getTypeHandler() {
            return this.typeHandler;
        }
        
        protected Criterion(final String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            }
            else {
                this.singleValue = true;
            }
        }
        
        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
