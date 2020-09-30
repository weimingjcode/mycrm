package com.rong.mycrm.service;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/29
*/

import com.rong.mycrm.model.CourseOrder;
import com.rong.mycrm.model.PageResult;

import java.util.Map;

public interface ICourseOrderService {

    public PageResult<CourseOrder> getCourseTableResult(int page,int limit);
}
