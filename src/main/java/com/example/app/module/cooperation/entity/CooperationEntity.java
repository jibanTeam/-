package com.example.app.module.cooperation.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class CooperationEntity {

    @ApiModelProperty(value="创建时间")
    private Date creatTime;

    @ApiModelProperty(value="合作人名字")
    private String name;

    @ApiModelProperty(value="合作人邮箱")
    private String email;

    @ApiModelProperty(value="说明")
    private String explain;
}
