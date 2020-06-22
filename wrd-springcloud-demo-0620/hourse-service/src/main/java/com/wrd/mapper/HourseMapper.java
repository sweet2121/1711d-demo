package com.wrd.mapper;

import com.wrd.entity.Hourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wrd.entity.HourseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-21
 */
public interface HourseMapper extends BaseMapper<Hourse> {

    List<HourseVo> selectList(@Param("hourseVo") HourseVo hourseVo);
}
