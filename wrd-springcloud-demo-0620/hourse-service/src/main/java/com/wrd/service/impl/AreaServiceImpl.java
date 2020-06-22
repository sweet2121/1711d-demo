package com.wrd.service.impl;

import com.wrd.entity.Area;
import com.wrd.mapper.AreaMapper;
import com.wrd.service.IAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService {


    @Override
    public List<Area> selectArea() {
        return this.baseMapper.selectArea();
    }
}
