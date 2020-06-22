package com.wrd.mapper;

import com.wrd.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
public interface AreaMapper extends BaseMapper<Area> {

    List<Area> selectArea();
}
