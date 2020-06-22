package com.wrd.mapper;

import com.wrd.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-22
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectList(@Param("user") User user);
}
