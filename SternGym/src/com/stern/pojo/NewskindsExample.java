// 
// 
// 

package com.stern.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewskindsExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public NewskindsExample() {
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
        
        public Criteria andNkidIsNull() {
            this.addCriterion("nkid is null");
            return (Criteria)this;
        }
        
        public Criteria andNkidIsNotNull() {
            this.addCriterion("nkid is not null");
            return (Criteria)this;
        }
        
        public Criteria andNkidEqualTo(final Integer value) {
            this.addCriterion("nkid =", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidNotEqualTo(final Integer value) {
            this.addCriterion("nkid <>", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidGreaterThan(final Integer value) {
            this.addCriterion("nkid >", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("nkid >=", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidLessThan(final Integer value) {
            this.addCriterion("nkid <", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("nkid <=", value, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidIn(final List<Integer> values) {
            this.addCriterion("nkid in", values, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidNotIn(final List<Integer> values) {
            this.addCriterion("nkid not in", values, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nkid between", value1, value2, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNkidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nkid not between", value1, value2, "nkid");
            return (Criteria)this;
        }
        
        public Criteria andNknameIsNull() {
            this.addCriterion("nkname is null");
            return (Criteria)this;
        }
        
        public Criteria andNknameIsNotNull() {
            this.addCriterion("nkname is not null");
            return (Criteria)this;
        }
        
        public Criteria andNknameEqualTo(final String value) {
            this.addCriterion("nkname =", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameNotEqualTo(final String value) {
            this.addCriterion("nkname <>", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameGreaterThan(final String value) {
            this.addCriterion("nkname >", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("nkname >=", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameLessThan(final String value) {
            this.addCriterion("nkname <", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameLessThanOrEqualTo(final String value) {
            this.addCriterion("nkname <=", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameLike(final String value) {
            this.addCriterion("nkname like", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameNotLike(final String value) {
            this.addCriterion("nkname not like", value, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameIn(final List<String> values) {
            this.addCriterion("nkname in", values, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameNotIn(final List<String> values) {
            this.addCriterion("nkname not in", values, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameBetween(final String value1, final String value2) {
            this.addCriterion("nkname between", value1, value2, "nkname");
            return (Criteria)this;
        }
        
        public Criteria andNknameNotBetween(final String value1, final String value2) {
            this.addCriterion("nkname not between", value1, value2, "nkname");
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
