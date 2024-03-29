package com.doerit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public DocumentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIsNull() {
            addCriterion("DOCUMENT_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIsNotNull() {
            addCriterion("DOCUMENT_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryEqualTo(String value) {
            addCriterion("DOCUMENT_CATEGORY =", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotEqualTo(String value) {
            addCriterion("DOCUMENT_CATEGORY <>", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryGreaterThan(String value) {
            addCriterion("DOCUMENT_CATEGORY >", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_CATEGORY >=", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryLessThan(String value) {
            addCriterion("DOCUMENT_CATEGORY <", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_CATEGORY <=", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryLike(String value) {
            addCriterion("DOCUMENT_CATEGORY like", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotLike(String value) {
            addCriterion("DOCUMENT_CATEGORY not like", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIn(List<String> values) {
            addCriterion("DOCUMENT_CATEGORY in", values, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotIn(List<String> values) {
            addCriterion("DOCUMENT_CATEGORY not in", values, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryBetween(String value1, String value2) {
            addCriterion("DOCUMENT_CATEGORY between", value1, value2, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_CATEGORY not between", value1, value2, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNull() {
            addCriterion("ENTITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNotNull() {
            addCriterion("ENTITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntityNameEqualTo(String value) {
            addCriterion("ENTITY_NAME =", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotEqualTo(String value) {
            addCriterion("ENTITY_NAME <>", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThan(String value) {
            addCriterion("ENTITY_NAME >", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME >=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThan(String value) {
            addCriterion("ENTITY_NAME <", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME <=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLike(String value) {
            addCriterion("ENTITY_NAME like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotLike(String value) {
            addCriterion("ENTITY_NAME not like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameIn(List<String> values) {
            addCriterion("ENTITY_NAME in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotIn(List<String> values) {
            addCriterion("ENTITY_NAME not in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME not between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(String value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(String value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(String value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(String value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLike(String value) {
            addCriterion("ENTITY_ID like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotLike(String value) {
            addCriterion("ENTITY_ID not like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<String> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<String> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(String value1, String value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(String value1, String value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionIsNull() {
            addCriterion("DOCUEMENT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionIsNotNull() {
            addCriterion("DOCUEMENT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionEqualTo(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION =", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionNotEqualTo(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION <>", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionGreaterThan(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION >", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION >=", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionLessThan(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION <", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION <=", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionLike(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION like", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionNotLike(String value) {
            addCriterion("DOCUEMENT_DESCRIPTION not like", value, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionIn(List<String> values) {
            addCriterion("DOCUEMENT_DESCRIPTION in", values, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionNotIn(List<String> values) {
            addCriterion("DOCUEMENT_DESCRIPTION not in", values, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionBetween(String value1, String value2) {
            addCriterion("DOCUEMENT_DESCRIPTION between", value1, value2, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andDocuementDescriptionNotBetween(String value1, String value2) {
            addCriterion("DOCUEMENT_DESCRIPTION not between", value1, value2, "docuementDescription");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("SORT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("SORT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("SORT_ORDER =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("SORT_ORDER <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("SORT_ORDER >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_ORDER >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("SORT_ORDER <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_ORDER <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("SORT_ORDER in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("SORT_ORDER not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ORDER between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ORDER not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNull() {
            addCriterion("INSERT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNotNull() {
            addCriterion("INSERT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdEqualTo(String value) {
            addCriterion("INSERT_USER_ID =", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotEqualTo(String value) {
            addCriterion("INSERT_USER_ID <>", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThan(String value) {
            addCriterion("INSERT_USER_ID >", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSERT_USER_ID >=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThan(String value) {
            addCriterion("INSERT_USER_ID <", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThanOrEqualTo(String value) {
            addCriterion("INSERT_USER_ID <=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLike(String value) {
            addCriterion("INSERT_USER_ID like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotLike(String value) {
            addCriterion("INSERT_USER_ID not like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIn(List<String> values) {
            addCriterion("INSERT_USER_ID in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotIn(List<String> values) {
            addCriterion("INSERT_USER_ID not in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdBetween(String value1, String value2) {
            addCriterion("INSERT_USER_ID between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotBetween(String value1, String value2) {
            addCriterion("INSERT_USER_ID not between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNull() {
            addCriterion("INSERT_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNotNull() {
            addCriterion("INSERT_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeEqualTo(Date value) {
            addCriterion("INSERT_DATETIME =", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotEqualTo(Date value) {
            addCriterion("INSERT_DATETIME <>", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThan(Date value) {
            addCriterion("INSERT_DATETIME >", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATETIME >=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThan(Date value) {
            addCriterion("INSERT_DATETIME <", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATETIME <=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIn(List<Date> values) {
            addCriterion("INSERT_DATETIME in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotIn(List<Date> values) {
            addCriterion("INSERT_DATETIME not in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATETIME between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATETIME not between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("UPDATE_USER_ID like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_document
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 31 22:51:22 IST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_document
     *
     * @mbggenerated Thu Aug 31 22:51:22 IST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}