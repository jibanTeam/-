package com.example.app.module.index.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel(value = "测试数据库")
@Data
public class IndexVo {

    @ApiModelProperty(value="用户唯一标识")
    private Integer id;

    @ApiModelProperty(value="任务名字")
    private String taskName;

    private String name;

    private Integer age;


}
