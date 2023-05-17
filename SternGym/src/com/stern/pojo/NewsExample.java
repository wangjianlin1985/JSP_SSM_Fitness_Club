// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class NewsExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public NewsExample() {
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
        
        public Criteria andNidIsNull() {
            this.addCriterion("nid is null");
            return (Criteria)this;
        }
        
        public Criteria andNidIsNotNull() {
            this.addCriterion("nid is not null");
            return (Criteria)this;
        }
        
        public Criteria andNidEqualTo(final Integer value) {
            this.addCriterion("nid =", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidNotEqualTo(final Integer value) {
            this.addCriterion("nid <>", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidGreaterThan(final Integer value) {
            this.addCriterion("nid >", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("nid >=", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidLessThan(final Integer value) {
            this.addCriterion("nid <", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("nid <=", value, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidIn(final List<Integer> values) {
            this.addCriterion("nid in", values, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidNotIn(final List<Integer> values) {
            this.addCriterion("nid not in", values, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nid between", value1, value2, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nid not between", value1, value2, "nid");
            return (Criteria)this;
        }
        
        public Criteria andNtitleIsNull() {
            this.addCriterion("ntitle is null");
            return (Criteria)this;
        }
        
        public Criteria andNtitleIsNotNull() {
            this.addCriterion("ntitle is not null");
            return (Criteria)this;
        }
        
        public Criteria andNtitleEqualTo(final String value) {
            this.addCriterion("ntitle =", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleNotEqualTo(final String value) {
            this.addCriterion("ntitle <>", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleGreaterThan(final String value) {
            this.addCriterion("ntitle >", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleGreaterThanOrEqualTo(final String value) {
            this.addCriterion("ntitle >=", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleLessThan(final String value) {
            this.addCriterion("ntitle <", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleLessThanOrEqualTo(final String value) {
            this.addCriterion("ntitle <=", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleLike(final String value) {
            this.addCriterion("ntitle like", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleNotLike(final String value) {
            this.addCriterion("ntitle not like", value, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleIn(final List<String> values) {
            this.addCriterion("ntitle in", values, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleNotIn(final List<String> values) {
            this.addCriterion("ntitle not in", values, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleBetween(final String value1, final String value2) {
            this.addCriterion("ntitle between", value1, value2, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNtitleNotBetween(final String value1, final String value2) {
            this.addCriterion("ntitle not between", value1, value2, "ntitle");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeIsNull() {
            this.addCriterion("ncreatetime is null");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeIsNotNull() {
            this.addCriterion("ncreatetime is not null");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeEqualTo(final Date value) {
            this.addCriterion("ncreatetime =", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeNotEqualTo(final Date value) {
            this.addCriterion("ncreatetime <>", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeGreaterThan(final Date value) {
            this.addCriterion("ncreatetime >", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("ncreatetime >=", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeLessThan(final Date value) {
            this.addCriterion("ncreatetime <", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeLessThanOrEqualTo(final Date value) {
            this.addCriterion("ncreatetime <=", value, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeIn(final List<Date> values) {
            this.addCriterion("ncreatetime in", values, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeNotIn(final List<Date> values) {
            this.addCriterion("ncreatetime not in", values, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeBetween(final Date value1, final Date value2) {
            this.addCriterion("ncreatetime between", value1, value2, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNcreatetimeNotBetween(final Date value1, final Date value2) {
            this.addCriterion("ncreatetime not between", value1, value2, "ncreatetime");
            return (Criteria)this;
        }
        
        public Criteria andNkIdIsNull() {
            this.addCriterion("nk_id is null");
            return (Criteria)this;
        }
        
        public Criteria andNkIdIsNotNull() {
            this.addCriterion("nk_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andNkIdEqualTo(final Integer value) {
            this.addCriterion("nk_id =", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdNotEqualTo(final Integer value) {
            this.addCriterion("nk_id <>", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdGreaterThan(final Integer value) {
            this.addCriterion("nk_id >", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("nk_id >=", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdLessThan(final Integer value) {
            this.addCriterion("nk_id <", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("nk_id <=", value, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdIn(final List<Integer> values) {
            this.addCriterion("nk_id in", values, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdNotIn(final List<Integer> values) {
            this.addCriterion("nk_id not in", values, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nk_id between", value1, value2, "nkId");
            return (Criteria)this;
        }
        
        public Criteria andNkIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("nk_id not between", value1, value2, "nkId");
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
