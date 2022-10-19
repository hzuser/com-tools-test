package com.tools.test;

import com.alibaba.fastjson.JSONObject;
import com.tools.test.baseTest.BaseTest;


//import com.tools.test.entity.SysUser;
//import com.tools.test.mapper.SysUserMapper;
//import com.tools.test.service.SysUserService;
import com.tools.test.entity.SysUser;
import com.tools.test.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
@Component
@Slf4j
public class TestApplicationTests extends BaseTest {

    @Autowired
    SysUserService sysUserService;
//    @Autowired
//    SysUserMapper sysUserMapper;
//
//
    @Test
    public void test(){
        List<SysUser> sysUserList = sysUserService.list();
        SysUser sysUser = sysUserList.get(0);
        String userName = sysUser.getUsername();
        logger.info("username:"+ userName);
        Assert.assertEquals(userName,"admin");
    }

}
