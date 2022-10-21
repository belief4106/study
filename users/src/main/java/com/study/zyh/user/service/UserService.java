package com.study.zyh.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.study.zyh.user.cont.ResponseMessage;
import com.study.zyh.user.entity.User;

public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param user
     * @return
     */
    ResponseMessage<User> registered(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    ResponseMessage<Boolean> login(User user);
}
