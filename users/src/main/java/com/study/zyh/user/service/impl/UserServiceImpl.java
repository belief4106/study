package com.study.zyh.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.zyh.user.cont.ResponseMessage;
import com.study.zyh.user.entity.User;
import com.study.zyh.user.mapper.UserMapper;
import com.study.zyh.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public ResponseMessage<User> registered(User user) {
        boolean save = save(user);
        return null;
    }

    @Override
    public ResponseMessage<Boolean> login(User user) {
        /*Wrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.
        getOne(user.getUserId())*/
        return null;
    }
}
