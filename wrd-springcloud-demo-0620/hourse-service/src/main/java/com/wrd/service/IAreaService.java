package com.wrd.service;

import com.wrd.entity.Area;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
public interface IAreaService extends IService<Area> {

    List<Area> selectArea();
}
