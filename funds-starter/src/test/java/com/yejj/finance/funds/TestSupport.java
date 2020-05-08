package com.yejj.finance.funds;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @Author: yejj
 * @Date: 2019/4/12 16:23
 * @Description:
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
@WebAppConfiguration
@Slf4j
public abstract class TestSupport {

    @Autowired
    WebApplicationContext wac;

    protected static MockMvc mvc;

    @Before
    public void initTests() {
        MockitoAnnotations.initMocks(TestSupport.class);
        System.out.println("mockMvc初始化-----------------------------------");
        try {
            mvc = MockMvcBuilders.webAppContextSetup(wac).build();
        } catch (Exception e) {
            log.error("创建模拟test异常", e);
        }
    }

}
