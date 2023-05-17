// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class MessageExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public MessageExample() {
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
        
        public Criteria andMsgIdIsNull() {
            this.addCriterion("msg_id is null");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdIsNotNull() {
            this.addCriterion("msg_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdEqualTo(final Integer value) {
            this.addCriterion("msg_id =", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdNotEqualTo(final Integer value) {
            this.addCriterion("msg_id <>", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdGreaterThan(final Integer value) {
            this.addCriterion("msg_id >", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_id >=", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdLessThan(final Integer value) {
            this.addCriterion("msg_id <", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_id <=", value, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdIn(final List<Integer> values) {
            this.addCriterion("msg_id in", values, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdNotIn(final List<Integer> values) {
            this.addCriterion("msg_id not in", values, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidIsNull() {
            this.addCriterion("msg_mid is null");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidIsNotNull() {
            this.addCriterion("msg_mid is not null");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidEqualTo(final Integer value) {
            this.addCriterion("msg_mid =", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidNotEqualTo(final Integer value) {
            this.addCriterion("msg_mid <>", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidGreaterThan(final Integer value) {
            this.addCriterion("msg_mid >", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_mid >=", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidLessThan(final Integer value) {
            this.addCriterion("msg_mid <", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_mid <=", value, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidIn(final List<Integer> values) {
            this.addCriterion("msg_mid in", values, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidNotIn(final List<Integer> values) {
            this.addCriterion("msg_mid not in", values, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_mid between", value1, value2, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgMidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_mid not between", value1, value2, "msgMid");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentIsNull() {
            this.addCriterion("msg_content is null");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentIsNotNull() {
            this.addCriterion("msg_content is not null");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentEqualTo(final String value) {
            this.addCriterion("msg_content =", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentNotEqualTo(final String value) {
            this.addCriterion("msg_content <>", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentGreaterThan(final String value) {
            this.addCriterion("msg_content >", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentGreaterThanOrEqualTo(final String value) {
            this.addCriterion("msg_content >=", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentLessThan(final String value) {
            this.addCriterion("msg_content <", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentLessThanOrEqualTo(final String value) {
            this.addCriterion("msg_content <=", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentLike(final String value) {
            this.addCriterion("msg_content like", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentNotLike(final String value) {
            this.addCriterion("msg_content not like", value, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentIn(final List<String> values) {
            this.addCriterion("msg_content in", values, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentNotIn(final List<String> values) {
            this.addCriterion("msg_content not in", values, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentBetween(final String value1, final String value2) {
            this.addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgContentNotBetween(final String value1, final String value2) {
            this.addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidIsNull() {
            this.addCriterion("msg_rid is null");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidIsNotNull() {
            this.addCriterion("msg_rid is not null");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidEqualTo(final Integer value) {
            this.addCriterion("msg_rid =", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidNotEqualTo(final Integer value) {
            this.addCriterion("msg_rid <>", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidGreaterThan(final Integer value) {
            this.addCriterion("msg_rid >", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_rid >=", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidLessThan(final Integer value) {
            this.addCriterion("msg_rid <", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("msg_rid <=", value, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidIn(final List<Integer> values) {
            this.addCriterion("msg_rid in", values, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidNotIn(final List<Integer> values) {
            this.addCriterion("msg_rid not in", values, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_rid between", value1, value2, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgRidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("msg_rid not between", value1, value2, "msgRid");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateIsNull() {
            this.addCriterion("msg_date is null");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateIsNotNull() {
            this.addCriterion("msg_date is not null");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateEqualTo(final Date value) {
            this.addCriterion("msg_date =", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateNotEqualTo(final Date value) {
            this.addCriterion("msg_date <>", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateGreaterThan(final Date value) {
            this.addCriterion("msg_date >", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("msg_date >=", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateLessThan(final Date value) {
            this.addCriterion("msg_date <", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateLessThanOrEqualTo(final Date value) {
            this.addCriterion("msg_date <=", value, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateIn(final List<Date> values) {
            this.addCriterion("msg_date in", values, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateNotIn(final List<Date> values) {
            this.addCriterion("msg_date not in", values, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateBetween(final Date value1, final Date value2) {
            this.addCriterion("msg_date between", value1, value2, "msgDate");
            return (Criteria)this;
        }
        
        public Criteria andMsgDateNotBetween(final Date value1, final Date value2) {
            this.addCriterion("msg_date not between", value1, value2, "msgDate");
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
