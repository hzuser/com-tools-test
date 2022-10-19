package com.tools.test.controller;


import com.tools.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hz
 * @since 2022-10-18
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @GetMapping("/test")
    public Object test(){
        Object o= sysUserService.list();
        return o;
    }
}
