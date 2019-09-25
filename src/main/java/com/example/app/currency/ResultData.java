package com.example.app.currency;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "通用返回实体")
@Data
public class ResultData<T> {
    @ApiModelProperty(value="返回数据体")
    private T data;
    @ApiModelProperty(value="响应状态")
    private String status="true";
    @ApiModelProperty(value="相应附加信息")
    private String message= "No relevant information";
    @ApiModelProperty(value="响应状态码")
    private Integer code=0;

    public ResultData(T t) {
        this.data = t;
    }

    public ResultData(String message) {
        this.message = message;
        this.status = "false";

    }


}

