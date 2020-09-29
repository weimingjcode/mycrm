package com.rong.mycrm.model;/*
 @author jm
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/9/29
*/

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class PageResult<T>{
    int code;
    String msg;
    Integer count;
    List<T> data;
}
