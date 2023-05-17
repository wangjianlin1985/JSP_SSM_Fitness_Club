// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class MemberExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public MemberExample() {
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
        
        public Criteria andMidIsNull() {
            this.addCriterion("mid is null");
            return (Criteria)this;
        }
        
        public Criteria andMidIsNotNull() {
            this.addCriterion("mid is not null");
            return (Criteria)this;
        }
        
        public Criteria andMidEqualTo(final Integer value) {
            this.addCriterion("mid =", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidNotEqualTo(final Integer value) {
            this.addCriterion("mid <>", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidGreaterThan(final Integer value) {
            this.addCriterion("mid >", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("mid >=", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidLessThan(final Integer value) {
            this.addCriterion("mid <", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("mid <=", value, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidIn(final List<Integer> values) {
            this.addCriterion("mid in", values, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidNotIn(final List<Integer> values) {
            this.addCriterion("mid not in", values, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("mid between", value1, value2, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("mid not between", value1, value2, "mid");
            return (Criteria)this;
        }
        
        public Criteria andMnameIsNull() {
            this.addCriterion("mname is null");
            return (Criteria)this;
        }
        
        public Criteria andMnameIsNotNull() {
            this.addCriterion("mname is not null");
            return (Criteria)this;
        }
        
        public Criteria andMnameEqualTo(final String value) {
            this.addCriterion("mname =", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameNotEqualTo(final String value) {
            this.addCriterion("mname <>", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameGreaterThan(final String value) {
            this.addCriterion("mname >", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("mname >=", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameLessThan(final String value) {
            this.addCriterion("mname <", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameLessThanOrEqualTo(final String value) {
            this.addCriterion("mname <=", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameLike(final String value) {
            this.addCriterion("mname like", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameNotLike(final String value) {
            this.addCriterion("mname not like", value, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameIn(final List<String> values) {
            this.addCriterion("mname in", values, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameNotIn(final List<String> values) {
            this.addCriterion("mname not in", values, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameBetween(final String value1, final String value2) {
            this.addCriterion("mname between", value1, value2, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMnameNotBetween(final String value1, final String value2) {
            this.addCriterion("mname not between", value1, value2, "mname");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordIsNull() {
            this.addCriterion("mpassword is null");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordIsNotNull() {
            this.addCriterion("mpassword is not null");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordEqualTo(final String value) {
            this.addCriterion("mpassword =", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordNotEqualTo(final String value) {
            this.addCriterion("mpassword <>", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordGreaterThan(final String value) {
            this.addCriterion("mpassword >", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordGreaterThanOrEqualTo(final String value) {
            this.addCriterion("mpassword >=", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordLessThan(final String value) {
            this.addCriterion("mpassword <", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordLessThanOrEqualTo(final String value) {
            this.addCriterion("mpassword <=", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordLike(final String value) {
            this.addCriterion("mpassword like", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordNotLike(final String value) {
            this.addCriterion("mpassword not like", value, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordIn(final List<String> values) {
            this.addCriterion("mpassword in", values, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordNotIn(final List<String> values) {
            this.addCriterion("mpassword not in", values, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordBetween(final String value1, final String value2) {
            this.addCriterion("mpassword between", value1, value2, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMpasswordNotBetween(final String value1, final String value2) {
            this.addCriterion("mpassword not between", value1, value2, "mpassword");
            return (Criteria)this;
        }
        
        public Criteria andMgenderIsNull() {
            this.addCriterion("mgender is null");
            return (Criteria)this;
        }
        
        public Criteria andMgenderIsNotNull() {
            this.addCriterion("mgender is not null");
            return (Criteria)this;
        }
        
        public Criteria andMgenderEqualTo(final Byte value) {
            this.addCriterion("mgender =", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderNotEqualTo(final Byte value) {
            this.addCriterion("mgender <>", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderGreaterThan(final Byte value) {
            this.addCriterion("mgender >", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderGreaterThanOrEqualTo(final Byte value) {
            this.addCriterion("mgender >=", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderLessThan(final Byte value) {
            this.addCriterion("mgender <", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderLessThanOrEqualTo(final Byte value) {
            this.addCriterion("mgender <=", value, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderIn(final List<Byte> values) {
            this.addCriterion("mgender in", values, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderNotIn(final List<Byte> values) {
            this.addCriterion("mgender not in", values, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderBetween(final Byte value1, final Byte value2) {
            this.addCriterion("mgender between", value1, value2, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMgenderNotBetween(final Byte value1, final Byte value2) {
            this.addCriterion("mgender not between", value1, value2, "mgender");
            return (Criteria)this;
        }
        
        public Criteria andMidnoIsNull() {
            this.addCriterion("midno is null");
            return (Criteria)this;
        }
        
        public Criteria andMidnoIsNotNull() {
            this.addCriterion("midno is not null");
            return (Criteria)this;
        }
        
        public Criteria andMidnoEqualTo(final String value) {
            this.addCriterion("midno =", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoNotEqualTo(final String value) {
            this.addCriterion("midno <>", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoGreaterThan(final String value) {
            this.addCriterion("midno >", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoGreaterThanOrEqualTo(final String value) {
            this.addCriterion("midno >=", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoLessThan(final String value) {
            this.addCriterion("midno <", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoLessThanOrEqualTo(final String value) {
            this.addCriterion("midno <=", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoLike(final String value) {
            this.addCriterion("midno like", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoNotLike(final String value) {
            this.addCriterion("midno not like", value, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoIn(final List<String> values) {
            this.addCriterion("midno in", values, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoNotIn(final List<String> values) {
            this.addCriterion("midno not in", values, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoBetween(final String value1, final String value2) {
            this.addCriterion("midno between", value1, value2, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMidnoNotBetween(final String value1, final String value2) {
            this.addCriterion("midno not between", value1, value2, "midno");
            return (Criteria)this;
        }
        
        public Criteria andMphoneIsNull() {
            this.addCriterion("mphone is null");
            return (Criteria)this;
        }
        
        public Criteria andMphoneIsNotNull() {
            this.addCriterion("mphone is not null");
            return (Criteria)this;
        }
        
        public Criteria andMphoneEqualTo(final String value) {
            this.addCriterion("mphone =", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneNotEqualTo(final String value) {
            this.addCriterion("mphone <>", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneGreaterThan(final String value) {
            this.addCriterion("mphone >", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("mphone >=", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneLessThan(final String value) {
            this.addCriterion("mphone <", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneLessThanOrEqualTo(final String value) {
            this.addCriterion("mphone <=", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneLike(final String value) {
            this.addCriterion("mphone like", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneNotLike(final String value) {
            this.addCriterion("mphone not like", value, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneIn(final List<String> values) {
            this.addCriterion("mphone in", values, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneNotIn(final List<String> values) {
            this.addCriterion("mphone not in", values, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneBetween(final String value1, final String value2) {
            this.addCriterion("mphone between", value1, value2, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMphoneNotBetween(final String value1, final String value2) {
            this.addCriterion("mphone not between", value1, value2, "mphone");
            return (Criteria)this;
        }
        
        public Criteria andMemailIsNull() {
            this.addCriterion("memail is null");
            return (Criteria)this;
        }
        
        public Criteria andMemailIsNotNull() {
            this.addCriterion("memail is not null");
            return (Criteria)this;
        }
        
        public Criteria andMemailEqualTo(final String value) {
            this.addCriterion("memail =", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailNotEqualTo(final String value) {
            this.addCriterion("memail <>", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailGreaterThan(final String value) {
            this.addCriterion("memail >", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailGreaterThanOrEqualTo(final String value) {
            this.addCriterion("memail >=", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailLessThan(final String value) {
            this.addCriterion("memail <", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailLessThanOrEqualTo(final String value) {
            this.addCriterion("memail <=", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailLike(final String value) {
            this.addCriterion("memail like", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailNotLike(final String value) {
            this.addCriterion("memail not like", value, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailIn(final List<String> values) {
            this.addCriterion("memail in", values, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailNotIn(final List<String> values) {
            this.addCriterion("memail not in", values, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailBetween(final String value1, final String value2) {
            this.addCriterion("memail between", value1, value2, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMemailNotBetween(final String value1, final String value2) {
            this.addCriterion("memail not between", value1, value2, "memail");
            return (Criteria)this;
        }
        
        public Criteria andMdateIsNull() {
            this.addCriterion("mdate is null");
            return (Criteria)this;
        }
        
        public Criteria andMdateIsNotNull() {
            this.addCriterion("mdate is not null");
            return (Criteria)this;
        }
        
        public Criteria andMdateEqualTo(final Date value) {
            this.addCriterion("mdate =", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateNotEqualTo(final Date value) {
            this.addCriterion("mdate <>", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateGreaterThan(final Date value) {
            this.addCriterion("mdate >", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("mdate >=", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateLessThan(final Date value) {
            this.addCriterion("mdate <", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateLessThanOrEqualTo(final Date value) {
            this.addCriterion("mdate <=", value, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateIn(final List<Date> values) {
            this.addCriterion("mdate in", values, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateNotIn(final List<Date> values) {
            this.addCriterion("mdate not in", values, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateBetween(final Date value1, final Date value2) {
            this.addCriterion("mdate between", value1, value2, "mdate");
            return (Criteria)this;
        }
        
        public Criteria andMdateNotBetween(final Date value1, final Date value2) {
            this.addCriterion("mdate not between", value1, value2, "mdate");
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
