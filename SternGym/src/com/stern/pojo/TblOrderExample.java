// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TblOrderExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public TblOrderExample() {
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
        
        public Criteria andOidIsNull() {
            this.addCriterion("oid is null");
            return (Criteria)this;
        }
        
        public Criteria andOidIsNotNull() {
            this.addCriterion("oid is not null");
            return (Criteria)this;
        }
        
        public Criteria andOidEqualTo(final Integer value) {
            this.addCriterion("oid =", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotEqualTo(final Integer value) {
            this.addCriterion("oid <>", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidGreaterThan(final Integer value) {
            this.addCriterion("oid >", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("oid >=", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidLessThan(final Integer value) {
            this.addCriterion("oid <", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("oid <=", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidIn(final List<Integer> values) {
            this.addCriterion("oid in", values, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotIn(final List<Integer> values) {
            this.addCriterion("oid not in", values, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oid between", value1, value2, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oid not between", value1, value2, "oid");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdIsNull() {
            this.addCriterion("member_id is null");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdIsNotNull() {
            this.addCriterion("member_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdEqualTo(final Integer value) {
            this.addCriterion("member_id =", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdNotEqualTo(final Integer value) {
            this.addCriterion("member_id <>", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdGreaterThan(final Integer value) {
            this.addCriterion("member_id >", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("member_id >=", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdLessThan(final Integer value) {
            this.addCriterion("member_id <", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("member_id <=", value, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdIn(final List<Integer> values) {
            this.addCriterion("member_id in", values, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdNotIn(final List<Integer> values) {
            this.addCriterion("member_id not in", values, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andMemberIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeIsNull() {
            this.addCriterion("ocreatetime is null");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeIsNotNull() {
            this.addCriterion("ocreatetime is not null");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeEqualTo(final Date value) {
            this.addCriterion("ocreatetime =", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeNotEqualTo(final Date value) {
            this.addCriterion("ocreatetime <>", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeGreaterThan(final Date value) {
            this.addCriterion("ocreatetime >", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("ocreatetime >=", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeLessThan(final Date value) {
            this.addCriterion("ocreatetime <", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeLessThanOrEqualTo(final Date value) {
            this.addCriterion("ocreatetime <=", value, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeIn(final List<Date> values) {
            this.addCriterion("ocreatetime in", values, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeNotIn(final List<Date> values) {
            this.addCriterion("ocreatetime not in", values, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeBetween(final Date value1, final Date value2) {
            this.addCriterion("ocreatetime between", value1, value2, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andOcreatetimeNotBetween(final Date value1, final Date value2) {
            this.addCriterion("ocreatetime not between", value1, value2, "ocreatetime");
            return (Criteria)this;
        }
        
        public Criteria andClassIdIsNull() {
            this.addCriterion("class_id is null");
            return (Criteria)this;
        }
        
        public Criteria andClassIdIsNotNull() {
            this.addCriterion("class_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andClassIdEqualTo(final Integer value) {
            this.addCriterion("class_id =", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdNotEqualTo(final Integer value) {
            this.addCriterion("class_id <>", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdGreaterThan(final Integer value) {
            this.addCriterion("class_id >", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("class_id >=", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdLessThan(final Integer value) {
            this.addCriterion("class_id <", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("class_id <=", value, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdIn(final List<Integer> values) {
            this.addCriterion("class_id in", values, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdNotIn(final List<Integer> values) {
            this.addCriterion("class_id not in", values, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("class_id between", value1, value2, "classId");
            return (Criteria)this;
        }
        
        public Criteria andClassIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria)this;
        }
        
        public Criteria andOstatusIsNull() {
            this.addCriterion("ostatus is null");
            return (Criteria)this;
        }
        
        public Criteria andOstatusIsNotNull() {
            this.addCriterion("ostatus is not null");
            return (Criteria)this;
        }
        
        public Criteria andOstatusEqualTo(final Integer value) {
            this.addCriterion("ostatus =", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusNotEqualTo(final Integer value) {
            this.addCriterion("ostatus <>", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusGreaterThan(final Integer value) {
            this.addCriterion("ostatus >", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("ostatus >=", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusLessThan(final Integer value) {
            this.addCriterion("ostatus <", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusLessThanOrEqualTo(final Integer value) {
            this.addCriterion("ostatus <=", value, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusIn(final List<Integer> values) {
            this.addCriterion("ostatus in", values, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusNotIn(final List<Integer> values) {
            this.addCriterion("ostatus not in", values, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria)this;
        }
        
        public Criteria andOstatusNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ostatus not between", value1, value2, "ostatus");
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
