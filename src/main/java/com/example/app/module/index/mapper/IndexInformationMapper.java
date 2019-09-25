package com.example.app.module.index.mapper;

import com.example.app.module.index.entity.IndexInformation;
import com.example.app.module.index.entity.IndexInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexInformationMapper {
    long countByExample(IndexInformationExample example);

    int deleteByExample(IndexInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexInformation record);

    int insertSelective(IndexInformation record);

    List<IndexInformation> selectByExample(IndexInformationExample example);

    IndexInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexInformation record, @Param("example") IndexInformationExample example);

    int updateByExample(@Param("record") IndexInformation record, @Param("example") IndexInformationExample example);

    int updateByPrimaryKeySelective(IndexInformation record);

    int updateByPrimaryKey(IndexInformation record);
}