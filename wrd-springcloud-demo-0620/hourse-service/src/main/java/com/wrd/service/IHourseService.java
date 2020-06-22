package com.wrd.service;

import com.github.pagehelper.PageInfo;
import com.wrd.entity.Hourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wrd.entity.HourseVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
public interface IHourseService extends IService<Hourse> {

   // PageInfo<HourseVo> getPageInfo(HourseVo hourseVo, Integer pageNum, Integer pageSize);

    PageInfo<HourseVo> selects(HourseVo hourseVo, Integer pageNum, Integer pageSize);
}
