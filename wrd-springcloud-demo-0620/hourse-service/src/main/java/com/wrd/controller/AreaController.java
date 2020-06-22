package com.wrd.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wrd.entity.Area;
import com.wrd.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private IAreaService iAreaService;

    @GetMapping("selectArea")
    public List<Area> selectArea(){
        return iAreaService.selectArea();
    }


    @GetMapping("selectAllArea")
    public  List<Area> selectAllArea(Integer pid){
        if(pid==null){
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("pid",1);
            List<Area> list = iAreaService.list(queryWrapper);
            return  list;
        }else {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("pid",pid);
            List<Area> list = iAreaService.list(queryWrapper);
            return  list;
        }

    }
}
