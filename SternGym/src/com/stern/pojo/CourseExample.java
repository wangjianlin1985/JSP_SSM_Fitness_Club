// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public CourseExample() {
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
        
        public Criteria andCidIsNull() {
            this.addCriterion("cid is null");
            return (Criteria)this;
        }
        
        public Criteria andCidIsNotNull() {
            this.addCriterion("cid is not null");
            return (Criteria)this;
        }
        
        public Criteria andCidEqualTo(final Integer value) {
            this.addCriterion("cid =", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotEqualTo(final Integer value) {
            this.addCriterion("cid <>", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidGreaterThan(final Integer value) {
            this.addCriterion("cid >", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("cid >=", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidLessThan(final Integer value) {
            this.addCriterion("cid <", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("cid <=", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidIn(final List<Integer> values) {
            this.addCriterion("cid in", values, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotIn(final List<Integer> values) {
            this.addCriterion("cid not in", values, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cid between", value1, value2, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cid not between", value1, value2, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCnameIsNull() {
            this.addCriterion("cname is null");
            return (Criteria)this;
        }
        
        public Criteria andCnameIsNotNull() {
            this.addCriterion("cname is not null");
            return (Criteria)this;
        }
        
        public Criteria andCnameEqualTo(final String value) {
            this.addCriterion("cname =", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameNotEqualTo(final String value) {
            this.addCriterion("cname <>", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameGreaterThan(final String value) {
            this.addCriterion("cname >", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("cname >=", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameLessThan(final String value) {
            this.addCriterion("cname <", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameLessThanOrEqualTo(final String value) {
            this.addCriterion("cname <=", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameLike(final String value) {
            this.addCriterion("cname like", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameNotLike(final String value) {
            this.addCriterion("cname not like", value, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameIn(final List<String> values) {
            this.addCriterion("cname in", values, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameNotIn(final List<String> values) {
            this.addCriterion("cname not in", values, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameBetween(final String value1, final String value2) {
            this.addCriterion("cname between", value1, value2, "cname");
            return (Criteria)this;
        }
        
        public Criteria andCnameNotBetween(final String value1, final String value2) {
            this.addCriterion("cname not between", value1, value2, "cname");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdIsNull() {
            this.addCriterion("trainer_id is null");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdIsNotNull() {
            this.addCriterion("trainer_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdEqualTo(final Integer value) {
            this.addCriterion("trainer_id =", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdNotEqualTo(final Integer value) {
            this.addCriterion("trainer_id <>", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdGreaterThan(final Integer value) {
            this.addCriterion("trainer_id >", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("trainer_id >=", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdLessThan(final Integer value) {
            this.addCriterion("trainer_id <", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("trainer_id <=", value, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdIn(final List<Integer> values) {
            this.addCriterion("trainer_id in", values, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdNotIn(final List<Integer> values) {
            this.addCriterion("trainer_id not in", values, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("trainer_id between", value1, value2, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andTrainerIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("trainer_id not between", value1, value2, "trainerId");
            return (Criteria)this;
        }
        
        public Criteria andCtimeIsNull() {
            this.addCriterion("ctime is null");
            return (Criteria)this;
        }
        
        public Criteria andCtimeIsNotNull() {
            this.addCriterion("ctime is not null");
            return (Criteria)this;
        }
        
        public Criteria andCtimeEqualTo(final Integer value) {
            this.addCriterion("ctime =", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeNotEqualTo(final Integer value) {
            this.addCriterion("ctime <>", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeGreaterThan(final Integer value) {
            this.addCriterion("ctime >", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("ctime >=", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeLessThan(final Integer value) {
            this.addCriterion("ctime <", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeLessThanOrEqualTo(final Integer value) {
            this.addCriterion("ctime <=", value, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeIn(final List<Integer> values) {
            this.addCriterion("ctime in", values, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeNotIn(final List<Integer> values) {
            this.addCriterion("ctime not in", values, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCtimeNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdIsNull() {
            this.addCriterion("cfunction_id is null");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdIsNotNull() {
            this.addCriterion("cfunction_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdEqualTo(final Integer value) {
            this.addCriterion("cfunction_id =", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdNotEqualTo(final Integer value) {
            this.addCriterion("cfunction_id <>", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdGreaterThan(final Integer value) {
            this.addCriterion("cfunction_id >", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("cfunction_id >=", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdLessThan(final Integer value) {
            this.addCriterion("cfunction_id <", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("cfunction_id <=", value, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdIn(final List<Integer> values) {
            this.addCriterion("cfunction_id in", values, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdNotIn(final List<Integer> values) {
            this.addCriterion("cfunction_id not in", values, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cfunction_id between", value1, value2, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCfunctionIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cfunction_id not between", value1, value2, "cfunctionId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdIsNull() {
            this.addCriterion("ccate_id is null");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdIsNotNull() {
            this.addCriterion("ccate_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdEqualTo(final Integer value) {
            this.addCriterion("ccate_id =", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdNotEqualTo(final Integer value) {
            this.addCriterion("ccate_id <>", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdGreaterThan(final Integer value) {
            this.addCriterion("ccate_id >", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("ccate_id >=", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdLessThan(final Integer value) {
            this.addCriterion("ccate_id <", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("ccate_id <=", value, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdIn(final List<Integer> values) {
            this.addCriterion("ccate_id in", values, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdNotIn(final List<Integer> values) {
            this.addCriterion("ccate_id not in", values, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ccate_id between", value1, value2, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCcateIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("ccate_id not between", value1, value2, "ccateId");
            return (Criteria)this;
        }
        
        public Criteria andCpicIsNull() {
            this.addCriterion("cpic is null");
            return (Criteria)this;
        }
        
        public Criteria andCpicIsNotNull() {
            this.addCriterion("cpic is not null");
            return (Criteria)this;
        }
        
        public Criteria andCpicEqualTo(final String value) {
            this.addCriterion("cpic =", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicNotEqualTo(final String value) {
            this.addCriterion("cpic <>", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicGreaterThan(final String value) {
            this.addCriterion("cpic >", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicGreaterThanOrEqualTo(final String value) {
            this.addCriterion("cpic >=", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicLessThan(final String value) {
            this.addCriterion("cpic <", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicLessThanOrEqualTo(final String value) {
            this.addCriterion("cpic <=", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicLike(final String value) {
            this.addCriterion("cpic like", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicNotLike(final String value) {
            this.addCriterion("cpic not like", value, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicIn(final List<String> values) {
            this.addCriterion("cpic in", values, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicNotIn(final List<String> values) {
            this.addCriterion("cpic not in", values, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicBetween(final String value1, final String value2) {
            this.addCriterion("cpic between", value1, value2, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCpicNotBetween(final String value1, final String value2) {
            this.addCriterion("cpic not between", value1, value2, "cpic");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeIsNull() {
            this.addCriterion("ccreatetime is null");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeIsNotNull() {
            this.addCriterion("ccreatetime is not null");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeEqualTo(final Date value) {
            this.addCriterion("ccreatetime =", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeNotEqualTo(final Date value) {
            this.addCriterion("ccreatetime <>", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeGreaterThan(final Date value) {
            this.addCriterion("ccreatetime >", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("ccreatetime >=", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeLessThan(final Date value) {
            this.addCriterion("ccreatetime <", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeLessThanOrEqualTo(final Date value) {
            this.addCriterion("ccreatetime <=", value, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeIn(final List<Date> values) {
            this.addCriterion("ccreatetime in", values, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeNotIn(final List<Date> values) {
            this.addCriterion("ccreatetime not in", values, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeBetween(final Date value1, final Date value2) {
            this.addCriterion("ccreatetime between", value1, value2, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCcreatetimeNotBetween(final Date value1, final Date value2) {
            this.addCriterion("ccreatetime not between", value1, value2, "ccreatetime");
            return (Criteria)this;
        }
        
        public Criteria andCpriceIsNull() {
            this.addCriterion("cprice is null");
            return (Criteria)this;
        }
        
        public Criteria andCpriceIsNotNull() {
            this.addCriterion("cprice is not null");
            return (Criteria)this;
        }
        
        public Criteria andCpriceEqualTo(final BigDecimal value) {
            this.addCriterion("cprice =", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceNotEqualTo(final BigDecimal value) {
            this.addCriterion("cprice <>", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceGreaterThan(final BigDecimal value) {
            this.addCriterion("cprice >", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceGreaterThanOrEqualTo(final BigDecimal value) {
            this.addCriterion("cprice >=", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceLessThan(final BigDecimal value) {
            this.addCriterion("cprice <", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceLessThanOrEqualTo(final BigDecimal value) {
            this.addCriterion("cprice <=", value, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceIn(final List<BigDecimal> values) {
            this.addCriterion("cprice in", values, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceNotIn(final List<BigDecimal> values) {
            this.addCriterion("cprice not in", values, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceBetween(final BigDecimal value1, final BigDecimal value2) {
            this.addCriterion("cprice between", value1, value2, "cprice");
            return (Criteria)this;
        }
        
        public Criteria andCpriceNotBetween(final BigDecimal value1, final BigDecimal value2) {
            this.addCriterion("cprice not between", value1, value2, "cprice");
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
