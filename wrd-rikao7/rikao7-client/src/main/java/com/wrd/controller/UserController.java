package com.wrd.controller;


import com.github.pagehelper.PageInfo;
import com.wrd.entity.User;
import com.wrd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ~瑞╭❤～
 * @since 2020-06-22
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 列表查询
     * @param user
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("getPageInfo")
    public PageInfo<User> getPageInfo(User user, @RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "3") Integer pageSize){
        return userService.getPageInfo(user,pageNum,pageSize);
    }
}
