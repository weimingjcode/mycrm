package com.rong.mycrm.service.imp;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/29
*/

import com.rong.mycrm.mapper.CourseOrderMapper;
import com.rong.mycrm.model.CourseOrder;
import com.rong.mycrm.model.PageResult;
import com.rong.mycrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOrderService implements ICourseOrderService{

    @Autowired
    CourseOrderMapper courseOrderMapper;

    @Override
    public PageResult<CourseOrder> getCourseTableResult() {
        PageResult<CourseOrder> pageResult = new PageResult<>();
        pageResult.setCode(0);
        pageResult.setMsg("请求成功！");
        pageResult.setCount(10);
        List<CourseOrder> list = courseOrderMapper.getCourseOrderList();
        pageResult.setData(list);
        return pageResult;
    }
}
