// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public EmployeeExample() {
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
        
        public Criteria andEidIsNull() {
            this.addCriterion("eid is null");
            return (Criteria)this;
        }
        
        public Criteria andEidIsNotNull() {
            this.addCriterion("eid is not null");
            return (Criteria)this;
        }
        
        public Criteria andEidEqualTo(final Integer value) {
            this.addCriterion("eid =", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidNotEqualTo(final Integer value) {
            this.addCriterion("eid <>", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidGreaterThan(final Integer value) {
            this.addCriterion("eid >", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("eid >=", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidLessThan(final Integer value) {
            this.addCriterion("eid <", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("eid <=", value, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidIn(final List<Integer> values) {
            this.addCriterion("eid in", values, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidNotIn(final List<Integer> values) {
            this.addCriterion("eid not in", values, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("eid between", value1, value2, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("eid not between", value1, value2, "eid");
            return (Criteria)this;
        }
        
        public Criteria andEnameIsNull() {
            this.addCriterion("ename is null");
            return (Criteria)this;
        }
        
        public Criteria andEnameIsNotNull() {
            this.addCriterion("ename is not null");
            return (Criteria)this;
        }
        
        public Criteria andEnameEqualTo(final String value) {
            this.addCriterion("ename =", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameNotEqualTo(final String value) {
            this.addCriterion("ename <>", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameGreaterThan(final String value) {
            this.addCriterion("ename >", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("ename >=", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameLessThan(final String value) {
            this.addCriterion("ename <", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameLessThanOrEqualTo(final String value) {
            this.addCriterion("ename <=", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameLike(final String value) {
            this.addCriterion("ename like", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameNotLike(final String value) {
            this.addCriterion("ename not like", value, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameIn(final List<String> values) {
            this.addCriterion("ename in", values, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameNotIn(final List<String> values) {
            this.addCriterion("ename not in", values, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameBetween(final String value1, final String value2) {
            this.addCriterion("ename between", value1, value2, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEnameNotBetween(final String value1, final String value2) {
            this.addCriterion("ename not between", value1, value2, "ename");
            return (Criteria)this;
        }
        
        public Criteria andEgenderIsNull() {
            this.addCriterion("egender is null");
            return (Criteria)this;
        }
        
        public Criteria andEgenderIsNotNull() {
            this.addCriterion("egender is not null");
            return (Criteria)this;
        }
        
        public Criteria andEgenderEqualTo(final Byte value) {
            this.addCriterion("egender =", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderNotEqualTo(final Byte value) {
            this.addCriterion("egender <>", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderGreaterThan(final Byte value) {
            this.addCriterion("egender >", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderGreaterThanOrEqualTo(final Byte value) {
            this.addCriterion("egender >=", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderLessThan(final Byte value) {
            this.addCriterion("egender <", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderLessThanOrEqualTo(final Byte value) {
            this.addCriterion("egender <=", value, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderIn(final List<Byte> values) {
            this.addCriterion("egender in", values, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderNotIn(final List<Byte> values) {
            this.addCriterion("egender not in", values, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderBetween(final Byte value1, final Byte value2) {
            this.addCriterion("egender between", value1, value2, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEgenderNotBetween(final Byte value1, final Byte value2) {
            this.addCriterion("egender not between", value1, value2, "egender");
            return (Criteria)this;
        }
        
        public Criteria andEphoneIsNull() {
            this.addCriterion("ephone is null");
            return (Criteria)this;
        }
        
        public Criteria andEphoneIsNotNull() {
            this.addCriterion("ephone is not null");
            return (Criteria)this;
        }
        
        public Criteria andEphoneEqualTo(final String value) {
            this.addCriterion("ephone =", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneNotEqualTo(final String value) {
            this.addCriterion("ephone <>", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneGreaterThan(final String value) {
            this.addCriterion("ephone >", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("ephone >=", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneLessThan(final String value) {
            this.addCriterion("ephone <", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneLessThanOrEqualTo(final String value) {
            this.addCriterion("ephone <=", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneLike(final String value) {
            this.addCriterion("ephone like", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneNotLike(final String value) {
            this.addCriterion("ephone not like", value, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneIn(final List<String> values) {
            this.addCriterion("ephone in", values, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneNotIn(final List<String> values) {
            this.addCriterion("ephone not in", values, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneBetween(final String value1, final String value2) {
            this.addCriterion("ephone between", value1, value2, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEphoneNotBetween(final String value1, final String value2) {
            this.addCriterion("ephone not between", value1, value2, "ephone");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdIsNull() {
            this.addCriterion("epost_id is null");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdIsNotNull() {
            this.addCriterion("epost_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdEqualTo(final Integer value) {
            this.addCriterion("epost_id =", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdNotEqualTo(final Integer value) {
            this.addCriterion("epost_id <>", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdGreaterThan(final Integer value) {
            this.addCriterion("epost_id >", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("epost_id >=", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdLessThan(final Integer value) {
            this.addCriterion("epost_id <", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdLessThanOrEqualTo(final Integer value) {
            this.addCriterion("epost_id <=", value, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdIn(final List<Integer> values) {
            this.addCriterion("epost_id in", values, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdNotIn(final List<Integer> values) {
            this.addCriterion("epost_id not in", values, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdBetween(final Integer value1, final Integer value2) {
            this.addCriterion("epost_id between", value1, value2, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEpostIdNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("epost_id not between", value1, value2, "epostId");
            return (Criteria)this;
        }
        
        public Criteria andEaddIsNull() {
            this.addCriterion("eadd is null");
            return (Criteria)this;
        }
        
        public Criteria andEaddIsNotNull() {
            this.addCriterion("eadd is not null");
            return (Criteria)this;
        }
        
        public Criteria andEaddEqualTo(final String value) {
            this.addCriterion("eadd =", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddNotEqualTo(final String value) {
            this.addCriterion("eadd <>", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddGreaterThan(final String value) {
            this.addCriterion("eadd >", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddGreaterThanOrEqualTo(final String value) {
            this.addCriterion("eadd >=", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddLessThan(final String value) {
            this.addCriterion("eadd <", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddLessThanOrEqualTo(final String value) {
            this.addCriterion("eadd <=", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddLike(final String value) {
            this.addCriterion("eadd like", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddNotLike(final String value) {
            this.addCriterion("eadd not like", value, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddIn(final List<String> values) {
            this.addCriterion("eadd in", values, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddNotIn(final List<String> values) {
            this.addCriterion("eadd not in", values, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddBetween(final String value1, final String value2) {
            this.addCriterion("eadd between", value1, value2, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEaddNotBetween(final String value1, final String value2) {
            this.addCriterion("eadd not between", value1, value2, "eadd");
            return (Criteria)this;
        }
        
        public Criteria andEhireIsNull() {
            this.addCriterion("ehire is null");
            return (Criteria)this;
        }
        
        public Criteria andEhireIsNotNull() {
            this.addCriterion("ehire is not null");
            return (Criteria)this;
        }
        
        public Criteria andEhireEqualTo(final Date value) {
            this.addCriterion("ehire =", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireNotEqualTo(final Date value) {
            this.addCriterion("ehire <>", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireGreaterThan(final Date value) {
            this.addCriterion("ehire >", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("ehire >=", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireLessThan(final Date value) {
            this.addCriterion("ehire <", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireLessThanOrEqualTo(final Date value) {
            this.addCriterion("ehire <=", value, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireIn(final List<Date> values) {
            this.addCriterion("ehire in", values, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireNotIn(final List<Date> values) {
            this.addCriterion("ehire not in", values, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireBetween(final Date value1, final Date value2) {
            this.addCriterion("ehire between", value1, value2, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEhireNotBetween(final Date value1, final Date value2) {
            this.addCriterion("ehire not between", value1, value2, "ehire");
            return (Criteria)this;
        }
        
        public Criteria andEstateIsNull() {
            this.addCriterion("estate is null");
            return (Criteria)this;
        }
        
        public Criteria andEstateIsNotNull() {
            this.addCriterion("estate is not null");
            return (Criteria)this;
        }
        
        public Criteria andEstateEqualTo(final Integer value) {
            this.addCriterion("estate =", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateNotEqualTo(final Integer value) {
            this.addCriterion("estate <>", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateGreaterThan(final Integer value) {
            this.addCriterion("estate >", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("estate >=", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateLessThan(final Integer value) {
            this.addCriterion("estate <", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateLessThanOrEqualTo(final Integer value) {
            this.addCriterion("estate <=", value, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateIn(final List<Integer> values) {
            this.addCriterion("estate in", values, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateNotIn(final List<Integer> values) {
            this.addCriterion("estate not in", values, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateBetween(final Integer value1, final Integer value2) {
            this.addCriterion("estate between", value1, value2, "estate");
            return (Criteria)this;
        }
        
        public Criteria andEstateNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("estate not between", value1, value2, "estate");
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
