package com.yejj.finance.funds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yejj
 * @Date: 2020/5/8 19:41
 * @Description:
 **/
@Controller
public class ViewController {

    @GetMapping("/index")
    public String index(ModelMap map) {
        return "index";
    }
}
