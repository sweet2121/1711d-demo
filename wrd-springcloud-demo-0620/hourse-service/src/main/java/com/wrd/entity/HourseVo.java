package com.wrd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class HourseVo extends Hourse {

    private Integer maxRoom;

    //虚拟接收租金
    private  String xrent;

    //租金范围1
    private  Integer rent1;
    //租金范围2
    private  Integer rent2;

    private List<Integer> ids;
}
