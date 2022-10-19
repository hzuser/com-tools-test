package com.tools.test.baseTest;


import com.tools.test.TestApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = TestApplication.class)
@WebAppConfiguration
@Slf4j
public class BaseTest extends AbstractTestNGSpringContextTests {
    public BaseTest(){

    }
}
