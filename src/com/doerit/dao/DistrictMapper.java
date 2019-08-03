package com.doerit.dao;

import com.doerit.model.District;
import com.doerit.model.DistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface DistrictMapper {
    
    int countByExample(DistrictExample example);
    int deleteByExample(DistrictExample example);
    int deleteByPrimaryKey(String id);
    int insert(District record);
    int insertSelective(District record);
    List<District> selectByExample(DistrictExample example);
    District selectByPrimaryKey(String id);
    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictExample example);
    int updateByExample(@Param("record") District record, @Param("example") DistrictExample example);
    int updateByPrimaryKeySelective(District record);
    int updateByPrimaryKey(District record);
    @Select("SELECT * FROM tbl_district ORDER BY SORT_ORDER, NAME")
    @ResultMap("BaseResultMap")
	List<District> findAll();
}