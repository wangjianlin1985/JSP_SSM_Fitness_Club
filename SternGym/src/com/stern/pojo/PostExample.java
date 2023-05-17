// 
// 
// 

package com.stern.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PostExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public PostExample() {
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
        
        public Criteria andPidIsNull() {
            this.addCriterion("pid is null");
            return (Criteria)this;
        }
        
        public Criteria andPidIsNotNull() {
            this.addCriterion("pid is not null");
            return (Criteria)this;
        }
        
        public Criteria andPidEqualTo(final Integer value) {
            this.addCriterion("pid =", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotEqualTo(final Integer value) {
            this.addCriterion("pid <>", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidGreaterThan(final Integer value) {
            this.addCriterion("pid >", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("pid >=", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidLessThan(final Integer value) {
            this.addCriterion("pid <", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("pid <=", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidIn(final List<Integer> values) {
            this.addCriterion("pid in", values, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotIn(final List<Integer> values) {
            this.addCriterion("pid not in", values, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pid between", value1, value2, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pid not between", value1, value2, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPnameIsNull() {
            this.addCriterion("pname is null");
            return (Criteria)this;
        }
        
        public Criteria andPnameIsNotNull() {
            this.addCriterion("pname is not null");
            return (Criteria)this;
        }
        
        public Criteria andPnameEqualTo(final String value) {
            this.addCriterion("pname =", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotEqualTo(final String value) {
            this.addCriterion("pname <>", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameGreaterThan(final String value) {
            this.addCriterion("pname >", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("pname >=", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLessThan(final String value) {
            this.addCriterion("pname <", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLessThanOrEqualTo(final String value) {
            this.addCriterion("pname <=", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLike(final String value) {
            this.addCriterion("pname like", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotLike(final String value) {
            this.addCriterion("pname not like", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameIn(final List<String> values) {
            this.addCriterion("pname in", values, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotIn(final List<String> values) {
            this.addCriterion("pname not in", values, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameBetween(final String value1, final String value2) {
            this.addCriterion("pname between", value1, value2, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotBetween(final String value1, final String value2) {
            this.addCriterion("pname not between", value1, value2, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryIsNull() {
            this.addCriterion("psalary is null");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryIsNotNull() {
            this.addCriterion("psalary is not null");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryEqualTo(final BigDecimal value) {
            this.addCriterion("psalary =", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryNotEqualTo(final BigDecimal value) {
            this.addCriterion("psalary <>", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryGreaterThan(final BigDecimal value) {
            this.addCriterion("psalary >", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryGreaterThanOrEqualTo(final BigDecimal value) {
            this.addCriterion("psalary >=", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryLessThan(final BigDecimal value) {
            this.addCriterion("psalary <", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryLessThanOrEqualTo(final BigDecimal value) {
            this.addCriterion("psalary <=", value, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryIn(final List<BigDecimal> values) {
            this.addCriterion("psalary in", values, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryNotIn(final List<BigDecimal> values) {
            this.addCriterion("psalary not in", values, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryBetween(final BigDecimal value1, final BigDecimal value2) {
            this.addCriterion("psalary between", value1, value2, "psalary");
            return (Criteria)this;
        }
        
        public Criteria andPsalaryNotBetween(final BigDecimal value1, final BigDecimal value2) {
            this.addCriterion("psalary not between", value1, value2, "psalary");
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
