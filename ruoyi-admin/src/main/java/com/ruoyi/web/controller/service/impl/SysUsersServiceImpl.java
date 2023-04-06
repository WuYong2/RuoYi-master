package com.ruoyi.web.controller.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.web.controller.mapper.SysUsersMapper;
import com.ruoyi.web.controller.service.SysUsersService;
import com.ruoyi.web.controller.utils.DataResults;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SysUsersServiceImpl implements SysUsersService{

    @Resource
    SysUserMapper sysUserMapper;

    @Override
    public DataResults<SysUser> listById(String id) {
        return null;
    }

    @Override
    public DataResults register(SysUser sysUser) {
        return null;
    }

    @Override
    public DataResults updates(String userId) {


        return null;
    }
}
