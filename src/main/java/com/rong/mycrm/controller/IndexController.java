package com.rong.mycrm.controller;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/28
*/

import com.rong.mycrm.model.CourseOrder;
import com.rong.mycrm.model.PageResult;
import com.rong.mycrm.service.ICourseOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    ICourseOrderService courseOrderService;

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


    @RequestMapping("/addCourseOrder")
    public String addCourseOrder(){
        return "courseorder/add";
    }

    @RequestMapping("/getCourseTableResult")
    @ResponseBody
    public PageResult<CourseOrder> getCourseTableResult(int page,int limit){
        PageResult pageResult = courseOrderService.getCourseTableResult(page,limit);
        log.info("请求数据  getCourseTableResult");
        return  pageResult;
    }



}
