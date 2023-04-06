package com.ruoyi.web.controller.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.web.controller.utils.DataResults;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RequestMapping("users-api")
@Api(tags = "会员API", description = "提供会员相关的RestAPI")
@ApiResponses({
        @ApiResponse(code = 200, message = "请求成功"),
        @ApiResponse(code = 500, message = "服务器内部错误"),
        @ApiResponse(code = 404, message = "请求的资源找不到"),
        @ApiResponse(code = 405, message = "请求方式不支持"),
        @ApiResponse(code = 403, message = "请求被拒绝"),
        @ApiResponse(code = 401, message = "没有权限访问")
})
public interface SysUsersService {

    @GetMapping("listById/{id}")
    @ApiOperation(value = "根据ID查询User对象", notes = "根据ID查询User对象信息")
    DataResults<SysUser> listById(@PathVariable("id") String id);

    @PostMapping("register")
    @ApiOperation(value = "用户注册", notes = "用户注册信息")
    DataResults register(@RequestBody SysUser sysUser);

    @PutMapping("update/{userId}")
    DataResults updates(@PathVariable("userId") String userId);

}
