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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseOrderService implements ICourseOrderService{

    @Autowired
    CourseOrderMapper courseOrderMapper;

    @Override
    public PageResult<CourseOrder> getCourseTableResult(int page,int limit) {
        PageResult<CourseOrder> pageResult = new PageResult<>();
        pageResult.setCode(0);
        pageResult.setMsg("请求成功！");
        pageResult.setCount(limit);

        Map<String,Object> paraMap = new HashMap<>();
//        paraMap.put("condition",conditon);
        paraMap.put("start",(page-1)*limit);
        paraMap.put("size",limit);
        List<CourseOrder> list = courseOrderMapper.getCourseOrderList(paraMap);
        pageResult.setData(list);
        return pageResult;
    }
}
