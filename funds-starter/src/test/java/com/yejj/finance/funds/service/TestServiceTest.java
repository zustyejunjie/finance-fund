package com.yejj.finance.funds.service;

import com.yejj.finance.funds.TestService;
import com.yejj.finance.funds.TestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yejj
 * @Date: 2020/5/8 19:59
 * @Description:
 **/
public class TestServiceTest extends TestSupport {

    @Autowired
    private TestService testService;

    @Test
    public void test1(){

        System.out.println(testService.test("tttttt")) ;
    }
}
