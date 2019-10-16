package com.example.app.admin.position.mapper;

import com.example.app.admin.position.entity.PositionSort;
import com.example.app.admin.position.entity.PositionSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionSortMapper {
    long countByExample(PositionSortExample example);

    int deleteByExample(PositionSortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PositionSort record);

    int insertSelective(PositionSort record);

    List<PositionSort> selectByExample(PositionSortExample example);

    PositionSort selectByPrimaryKey(Integer id);

    List<PositionSort> selectGroup();

    int updateByExampleSelective(@Param("record") PositionSort record, @Param("example") PositionSortExample example);

    int updateByExample(@Param("record") PositionSort record, @Param("example") PositionSortExample example);

    int updateByPrimaryKeySelective(PositionSort record);

    int updateByPrimaryKey(PositionSort record);
}