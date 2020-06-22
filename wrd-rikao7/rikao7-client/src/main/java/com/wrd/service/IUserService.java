package com.wrd.service;

import com.github.pagehelper.PageInfo;
import com.wrd.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-22
 */
public interface IUserService extends IService<User> {

    PageInfo<User> getPageInfo(User user, Integer pageNum, Integer pageSize);
}
