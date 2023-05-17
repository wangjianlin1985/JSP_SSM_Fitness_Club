// 
// 
// 

package com.stern.pojo;

import java.util.ArrayList;
import java.util.List;

public class SheetExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public SheetExample() {
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
        
        public Criteria andSidIsNull() {
            this.addCriterion("sid is null");
            return (Criteria)this;
        }
        
        public Criteria andSidIsNotNull() {
            this.addCriterion("sid is not null");
            return (Criteria)this;
        }
        
        public Criteria andSidEqualTo(final Integer value) {
            this.addCriterion("sid =", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidNotEqualTo(final Integer value) {
            this.addCriterion("sid <>", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidGreaterThan(final Integer value) {
            this.addCriterion("sid >", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("sid >=", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidLessThan(final Integer value) {
            this.addCriterion("sid <", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("sid <=", value, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidIn(final List<Integer> values) {
            this.addCriterion("sid in", values, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidNotIn(final List<Integer> values) {
            this.addCriterion("sid not in", values, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("sid between", value1, value2, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("sid not between", value1, value2, "sid");
            return (Criteria)this;
        }
        
        public Criteria andSsrcIsNull() {
            this.addCriterion("ssrc is null");
            return (Criteria)this;
        }
        
        public Criteria andSsrcIsNotNull() {
            this.addCriterion("ssrc is not null");
            return (Criteria)this;
        }
        
        public Criteria andSsrcEqualTo(final String value) {
            this.addCriterion("ssrc =", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcNotEqualTo(final String value) {
            this.addCriterion("ssrc <>", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcGreaterThan(final String value) {
            this.addCriterion("ssrc >", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcGreaterThanOrEqualTo(final String value) {
            this.addCriterion("ssrc >=", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcLessThan(final String value) {
            this.addCriterion("ssrc <", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcLessThanOrEqualTo(final String value) {
            this.addCriterion("ssrc <=", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcLike(final String value) {
            this.addCriterion("ssrc like", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcNotLike(final String value) {
            this.addCriterion("ssrc not like", value, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcIn(final List<String> values) {
            this.addCriterion("ssrc in", values, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcNotIn(final List<String> values) {
            this.addCriterion("ssrc not in", values, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcBetween(final String value1, final String value2) {
            this.addCriterion("ssrc between", value1, value2, "ssrc");
            return (Criteria)this;
        }
        
        public Criteria andSsrcNotBetween(final String value1, final String value2) {
            this.addCriterion("ssrc not between", value1, value2, "ssrc");
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
