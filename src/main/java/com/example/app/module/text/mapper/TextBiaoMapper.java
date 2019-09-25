package com.example.app.module.text.mapper;

import com.example.app.module.text.entity.TextBiao;
import com.example.app.module.text.entity.TextBiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextBiaoMapper {
    long countByExample(TextBiaoExample example);

    int deleteByExample(TextBiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TextBiao record);

    int insertSelective(TextBiao record);

    List<TextBiao> selectByExample(TextBiaoExample example);

    TextBiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TextBiao record, @Param("example") TextBiaoExample example);

    int updateByExample(@Param("record") TextBiao record, @Param("example") TextBiaoExample example);

    int updateByPrimaryKeySelective(TextBiao record);

    int updateByPrimaryKey(TextBiao record);
}