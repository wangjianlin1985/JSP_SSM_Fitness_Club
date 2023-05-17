// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ReplyExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public ReplyExample() {
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
        
        public Criteria andRidIsNull() {
            this.addCriterion("rid is null");
            return (Criteria)this;
        }
        
        public Criteria andRidIsNotNull() {
            this.addCriterion("rid is not null");
            return (Criteria)this;
        }
        
        public Criteria andRidEqualTo(final Integer value) {
            this.addCriterion("rid =", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidNotEqualTo(final Integer value) {
            this.addCriterion("rid <>", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidGreaterThan(final Integer value) {
            this.addCriterion("rid >", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("rid >=", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidLessThan(final Integer value) {
            this.addCriterion("rid <", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("rid <=", value, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidIn(final List<Integer> values) {
            this.addCriterion("rid in", values, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidNotIn(final List<Integer> values) {
            this.addCriterion("rid not in", values, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("rid between", value1, value2, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("rid not between", value1, value2, "rid");
            return (Criteria)this;
        }
        
        public Criteria andRcontentIsNull() {
            this.addCriterion("rcontent is null");
            return (Criteria)this;
        }
        
        public Criteria andRcontentIsNotNull() {
            this.addCriterion("rcontent is not null");
            return (Criteria)this;
        }
        
        public Criteria andRcontentEqualTo(final String value) {
            this.addCriterion("rcontent =", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentNotEqualTo(final String value) {
            this.addCriterion("rcontent <>", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentGreaterThan(final String value) {
            this.addCriterion("rcontent >", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentGreaterThanOrEqualTo(final String value) {
            this.addCriterion("rcontent >=", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentLessThan(final String value) {
            this.addCriterion("rcontent <", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentLessThanOrEqualTo(final String value) {
            this.addCriterion("rcontent <=", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentLike(final String value) {
            this.addCriterion("rcontent like", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentNotLike(final String value) {
            this.addCriterion("rcontent not like", value, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentIn(final List<String> values) {
            this.addCriterion("rcontent in", values, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentNotIn(final List<String> values) {
            this.addCriterion("rcontent not in", values, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentBetween(final String value1, final String value2) {
            this.addCriterion("rcontent between", value1, value2, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRcontentNotBetween(final String value1, final String value2) {
            this.addCriterion("rcontent not between", value1, value2, "rcontent");
            return (Criteria)this;
        }
        
        public Criteria andRdateIsNull() {
            this.addCriterion("rdate is null");
            return (Criteria)this;
        }
        
        public Criteria andRdateIsNotNull() {
            this.addCriterion("rdate is not null");
            return (Criteria)this;
        }
        
        public Criteria andRdateEqualTo(final Date value) {
            this.addCriterion("rdate =", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateNotEqualTo(final Date value) {
            this.addCriterion("rdate <>", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateGreaterThan(final Date value) {
            this.addCriterion("rdate >", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("rdate >=", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateLessThan(final Date value) {
            this.addCriterion("rdate <", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateLessThanOrEqualTo(final Date value) {
            this.addCriterion("rdate <=", value, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateIn(final List<Date> values) {
            this.addCriterion("rdate in", values, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateNotIn(final List<Date> values) {
            this.addCriterion("rdate not in", values, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateBetween(final Date value1, final Date value2) {
            this.addCriterion("rdate between", value1, value2, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRdateNotBetween(final Date value1, final Date value2) {
            this.addCriterion("rdate not between", value1, value2, "rdate");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdIsNull() {
            this.addCriterion("r_msg_id is null");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdIsNotNull() {
            this.addCriterion("r_msg_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdEqualTo(final Integer value) {
            this.addCriterion("r_msg_id =", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdNotEqualTo(final Integer value) {
            this.addCriterion("r_msg_id <>", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdGreaterThan(final Integer value) {
            this.addCriterion("r_msg_id >", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("r_msg_id >=", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdLessThan(final Integer value) {
            this.addCriterion("r_msg_id <", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("r_msg_id <=", value, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdIn(final List<Integer> values) {
            this.addCriterion("r_msg_id in", values, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdNotIn(final List<Integer> values) {
            this.addCriterion("r_msg_id not in", values, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("r_msg_id between", value1, value2, "rMsgId");
            return (Criteria)this;
        }
        
        public Criteria andRMsgIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("r_msg_id not between", value1, value2, "rMsgId");
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
