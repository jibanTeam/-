package com.example.app.module.text.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel(value = "text数据库")
@Data
public class TextVo {

    @ApiModelProperty(value="参数名称")
    private String parameterName;


    @ApiModelProperty(value="参数说明")
    private String parameterDescription;

    @ApiModelProperty(value="类型")
    private String type;

    @ApiModelProperty(value="schema")
    private String schema;

}
