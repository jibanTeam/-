package com.example.app.module.login.mapper;

import com.example.app.module.login.entity.LoginEmail;
import com.example.app.module.login.entity.LoginEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginEmailMapper {
    long countByExample(LoginEmailExample example);

    int deleteByExample(LoginEmailExample example);

    int deleteByPrimaryKey(String email);

    int insert(LoginEmail record);

    int insertSelective(LoginEmail record);

    List<LoginEmail> selectByExample(LoginEmailExample example);

    LoginEmail selectByPrimaryKey(String email);

    int updateByExampleSelective(@Param("record") LoginEmail record, @Param("example") LoginEmailExample example);

    int updateByExample(@Param("record") LoginEmail record, @Param("example") LoginEmailExample example);

    int updateByPrimaryKeySelective(LoginEmail record);

    int updateByPrimaryKey(LoginEmail record);
}