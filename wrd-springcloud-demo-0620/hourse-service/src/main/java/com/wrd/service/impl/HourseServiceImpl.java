package com.wrd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wrd.entity.Area;
import com.wrd.entity.Hourse;
import com.wrd.entity.HourseVo;
import com.wrd.mapper.HourseMapper;
import com.wrd.service.IAreaService;
import com.wrd.service.IHourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
@Service
public class HourseServiceImpl extends ServiceImpl<HourseMapper, Hourse> implements IHourseService {

    @Autowired
    private IAreaService iAreaService;

    @Override
    public PageInfo<HourseVo> selects(HourseVo hourseVo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<HourseVo> hourse = this.getBaseMapper().selectList(hourseVo);

        return new PageInfo<>(hourse);
    }
}
