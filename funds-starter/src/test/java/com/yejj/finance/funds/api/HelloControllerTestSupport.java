package com.yejj.finance.funds.api;

import com.alibaba.fastjson.JSON;
import com.yejj.finance.funds.TestSupport;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author: yejj
 * @Date: 2020/5/8 19:48
 * @Description:
 **/
public class HelloControllerTestSupport extends TestSupport {


    @Test
    public void hello() throws Exception{

        MvcResult result = mvc.perform(post("/hello")
                .characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(null)))
                .andExpect(status().isOk())
                .andReturn();

        System.out.println("api result---"+result.getResponse().getContentAsString());
    }

}
