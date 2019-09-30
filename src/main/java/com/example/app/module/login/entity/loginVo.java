package com.example.app.module.login.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class loginVo {

    @NotEmpty(message = "用户名不能为空")
    @ApiModelProperty(value="用户名")
    private String userName;

    @Size(min = 8,message = "密码至少为8位数")
    @ApiModelProperty(value="密码")
    private String password;

}
