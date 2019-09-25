package com.example.app.module.index.mapper;

import com.example.app.module.index.entity.IndexVo;
import com.example.app.module.index.entity.SystemTest;
import com.example.app.module.index.entity.SystemTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemTestDao {
    long countByExample(SystemTestExample example);

    int deleteByExample(SystemTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemTest record);

    int insertSelective(SystemTest record);

    List<SystemTest> selectByExample(SystemTestExample example);

    SystemTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemTest record, @Param("example") SystemTestExample example);

    int updateByExample(@Param("record") SystemTest record, @Param("example") SystemTestExample example);

    int updateByPrimaryKeySelective(SystemTest record);

    int updateByPrimaryKey(SystemTest record);

}