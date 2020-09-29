package com.rong.mycrm.model;
/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/29
*/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class CourseOrder {
    int id;
    String name;
    String wechat_mark;
    String uuid;
    String qq_no;
    String course_name;
    String wechat_no;
    BigDecimal course_price;
    Date order_date;
}
