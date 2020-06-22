package com.wrd.controller;


import com.github.pagehelper.PageInfo;
import com.wrd.entity.HourseVo;
import com.wrd.service.IHourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
@RestController
@RequestMapping("/hourse")
public class HourseController {

    @Autowired
    private IHourseService iHourseService;

    @GetMapping("selects")
    public PageInfo<HourseVo> getPageInfo(HourseVo hourseVo, @RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "3") Integer pageSize){
        if(hourseVo.getRoom()!=null){
            if(hourseVo.getRoom()==5){
                hourseVo.setMaxRoom(hourseVo.getRoom());
            }
        }
        if(hourseVo.getXrent()!=null){
            String[] split = hourseVo.getXrent().split("-");
            for(int i=0 ;i<split.length;i++){

                hourseVo.setRent1(Integer.parseInt(split[0]));
                hourseVo.setRent2(Integer.parseInt(split[1]));
            }
        }
        System.out.println("getRent1"+hourseVo.getRent1()+"xxxx"+"getRent2"+hourseVo.getRent2());

        System.err.println("setMaxRoom"+hourseVo.getMaxRoom());
        PageInfo<HourseVo> info = iHourseService.selects(hourseVo, pageNum, pageSize);
        return info;
    }
    @PostMapping("save")
    public  boolean save (@RequestBody HourseVo hourseVo){
        boolean b = iHourseService.saveOrUpdate(hourseVo);
        return  b;
    }


    @PostMapping("delBatch")
    public  boolean delBatch (@RequestBody HourseVo hourseVo){
        boolean b = iHourseService.removeByIds(hourseVo.getIds());
        return  b;
    }
}
