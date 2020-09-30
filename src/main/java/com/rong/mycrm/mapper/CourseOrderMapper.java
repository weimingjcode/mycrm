package com.rong.mycrm.mapper;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/29
*/

import com.rong.mycrm.model.CourseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface CourseOrderMapper {
    public List<CourseOrder> getCourseOrderList(Map parMap);
}
