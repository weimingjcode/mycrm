package com.rong.mycrm.controller;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/28
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/test")
//    @ResponseBody
    public String tests(){
        return "index";
    }
}
