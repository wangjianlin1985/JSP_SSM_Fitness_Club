// 
// 
// 

package com.stern.pojo;

import java.util.ArrayList;
import java.util.List;

public class CoursefunctionExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public CoursefunctionExample() {
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
        
        public Criteria andFidIsNull() {
            this.addCriterion("fid is null");
            return (Criteria)this;
        }
        
        public Criteria andFidIsNotNull() {
            this.addCriterion("fid is not null");
            return (Criteria)this;
        }
        
        public Criteria andFidEqualTo(final Integer value) {
            this.addCriterion("fid =", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidNotEqualTo(final Integer value) {
            this.addCriterion("fid <>", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidGreaterThan(final Integer value) {
            this.addCriterion("fid >", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("fid >=", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidLessThan(final Integer value) {
            this.addCriterion("fid <", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("fid <=", value, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidIn(final List<Integer> values) {
            this.addCriterion("fid in", values, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidNotIn(final List<Integer> values) {
            this.addCriterion("fid not in", values, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("fid between", value1, value2, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("fid not between", value1, value2, "fid");
            return (Criteria)this;
        }
        
        public Criteria andFnameIsNull() {
            this.addCriterion("fname is null");
            return (Criteria)this;
        }
        
        public Criteria andFnameIsNotNull() {
            this.addCriterion("fname is not null");
            return (Criteria)this;
        }
        
        public Criteria andFnameEqualTo(final String value) {
            this.addCriterion("fname =", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameNotEqualTo(final String value) {
            this.addCriterion("fname <>", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameGreaterThan(final String value) {
            this.addCriterion("fname >", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("fname >=", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameLessThan(final String value) {
            this.addCriterion("fname <", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameLessThanOrEqualTo(final String value) {
            this.addCriterion("fname <=", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameLike(final String value) {
            this.addCriterion("fname like", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameNotLike(final String value) {
            this.addCriterion("fname not like", value, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameIn(final List<String> values) {
            this.addCriterion("fname in", values, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameNotIn(final List<String> values) {
            this.addCriterion("fname not in", values, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameBetween(final String value1, final String value2) {
            this.addCriterion("fname between", value1, value2, "fname");
            return (Criteria)this;
        }
        
        public Criteria andFnameNotBetween(final String value1, final String value2) {
            this.addCriterion("fname not between", value1, value2, "fname");
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
