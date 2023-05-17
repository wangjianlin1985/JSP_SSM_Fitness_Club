// 
// 
// 

package com.stern.pojo;

import java.util.ArrayList;
import java.util.List;

public class CoursecategoryExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public CoursecategoryExample() {
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
        
        public Criteria andCateIdIsNull() {
            this.addCriterion("cate_id is null");
            return (Criteria)this;
        }
        
        public Criteria andCateIdIsNotNull() {
            this.addCriterion("cate_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andCateIdEqualTo(final Integer value) {
            this.addCriterion("cate_id =", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdNotEqualTo(final Integer value) {
            this.addCriterion("cate_id <>", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdGreaterThan(final Integer value) {
            this.addCriterion("cate_id >", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("cate_id >=", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdLessThan(final Integer value) {
            this.addCriterion("cate_id <", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("cate_id <=", value, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdIn(final List<Integer> values) {
            this.addCriterion("cate_id in", values, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdNotIn(final List<Integer> values) {
            this.addCriterion("cate_id not in", values, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria)this;
        }
        
        public Criteria andCateNameIsNull() {
            this.addCriterion("cate_name is null");
            return (Criteria)this;
        }
        
        public Criteria andCateNameIsNotNull() {
            this.addCriterion("cate_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andCateNameEqualTo(final String value) {
            this.addCriterion("cate_name =", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameNotEqualTo(final String value) {
            this.addCriterion("cate_name <>", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameGreaterThan(final String value) {
            this.addCriterion("cate_name >", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("cate_name >=", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameLessThan(final String value) {
            this.addCriterion("cate_name <", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameLessThanOrEqualTo(final String value) {
            this.addCriterion("cate_name <=", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameLike(final String value) {
            this.addCriterion("cate_name like", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameNotLike(final String value) {
            this.addCriterion("cate_name not like", value, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameIn(final List<String> values) {
            this.addCriterion("cate_name in", values, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameNotIn(final List<String> values) {
            this.addCriterion("cate_name not in", values, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameBetween(final String value1, final String value2) {
            this.addCriterion("cate_name between", value1, value2, "cateName");
            return (Criteria)this;
        }
        
        public Criteria andCateNameNotBetween(final String value1, final String value2) {
            this.addCriterion("cate_name not between", value1, value2, "cateName");
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
