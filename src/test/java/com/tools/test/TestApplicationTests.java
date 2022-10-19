package com.tools.test;

import com.tools.test.baseTest.BaseTest;


//import com.tools.test.entity.SysUser;
//import com.tools.test.mapper.SysUserMapper;
//import com.tools.test.service.SysUserService;
import com.tools.test.service.SysUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

import java.util.List;
@Component
public class TestApplicationTests extends BaseTest {

    @Autowired
    SysUserService sysUserService;
//    @Autowired
//    SysUserMapper sysUserMapper;
//
//
    @Test
    public void test(){
        Object sysUserList = sysUserService.list();
        System.out.println(sysUserList);
    }

}
