package com.tools.test.baidu;

import com.tools.test.baseTest.BaseTest;
import com.tools.test.service.baidu.Baidu;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;

@Component

public class BaiduTest extends BaseTest {

    @Autowired
    Baidu baidu;

    @Test
    public void test_baidu(){
        String aa  = baidu.baidu().toString();
        System.out.println(aa);
    }
}
