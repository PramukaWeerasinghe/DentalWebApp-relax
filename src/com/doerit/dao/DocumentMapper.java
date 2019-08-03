package com.doerit.dao;

import com.doerit.model.Document;
import com.doerit.model.DocumentExample;
import com.doerit.model.DocumentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface DocumentMapper {

	int countByExample(DocumentExample example);
    int deleteByExample(DocumentExample example);
    int deleteByPrimaryKey(String id);
    int insert(DocumentWithBLOBs record);
    int insertSelective(DocumentWithBLOBs record);
    List<DocumentWithBLOBs> selectByExampleWithBLOBs(DocumentExample example);
    List<Document> selectByExample(DocumentExample example);
    DocumentWithBLOBs selectByPrimaryKey(String id);
    int updateByExampleSelective(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);
    int updateByExampleWithBLOBs(@Param("record") DocumentWithBLOBs record, @Param("example") DocumentExample example);
    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);
    int updateByPrimaryKeySelective(DocumentWithBLOBs record);
    int updateByPrimaryKeyWithBLOBs(DocumentWithBLOBs record);
    int updateByPrimaryKey(Document record);
    
    @Select("SELECT * FROM tbl_document WHERE ENTITY_ID=#{entityId} AND ENTITY_NAME='STUDENT' AND DOCUMENT_CATEGORY='STUDENT_PROFILE_IMAGE' ORDER BY INSERT_DATETIME DESC LIMIT 1")
    @ResultMap("ResultMapWithBLOBs")
    DocumentWithBLOBs selectStudentProfileImage(@Param("entityId")String entityId);
    
    @Select("SELECT * FROM tbl_document WHERE ENTITY_ID=#{entityId} AND ENTITY_NAME='STUDENT' AND DOCUMENT_CATEGORY='STUDENT_SIGNATURE_IMAGE' ORDER BY INSERT_DATETIME DESC LIMIT 1")
    @ResultMap("ResultMapWithBLOBs")
    DocumentWithBLOBs selectStudentSignatureImage(@Param("entityId")String entityId);
    
    @Select("SELECT * FROM tbl_document WHERE id=#{id} AND STATE=1")
    @ResultMap("ResultMapWithBLOBs")
	DocumentWithBLOBs selectById(@Param("id")String id);
    
    @Select("SELECT * FROM tbl_document WHERE ID = #{id} AND STATE = #{state}")
	@ResultMap("ResultMapWithBLOBs")
	DocumentWithBLOBs findById(@Param("id") String id, @Param("state")byte state);
	
    @Select("SELECT * FROM tbl_document "
    		+ "WHERE ENTITY_ID = #{entityId} AND DOCUMENT_CATEGORY = #{category} AND STATE = #{state}")
   	@ResultMap("ResultMapWithBLOBs")
   	DocumentWithBLOBs findByEntityIdAndCategory(
   			@Param("entityId") String entityId,
   			@Param("category") String category,
   			@Param("state")byte state);
   	
}