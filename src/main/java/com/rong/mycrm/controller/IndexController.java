package com.rong.mycrm.controller;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/28
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String tests(){
        return "index";
    }

    @RequestMapping("/getCoursesOrderList")
    public String getCoursesOrderList(){
        return "courseorder/list";
    }

    @RequestMapping("/getStudentsOrderList")
    public String getStudentsOrderList(){
        return "studentsorder/list";
    }
}
