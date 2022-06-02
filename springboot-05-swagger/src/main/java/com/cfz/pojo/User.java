package com.cfz.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User", description = "用户信息")
public class User {

    @ApiModelProperty(value = "用户名", name = "username", example = "黄建妹")
    public String username;
    @ApiModelProperty(value = "密码", name = "password", example = "0920")
    public String password;

}
