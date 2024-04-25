package com.test.service.impl;

import com.test.common.Result;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Result login(String username, String password) {
        if(username == null || password == null){
            return Result.fail("用户名或密码为空");
        }
        if(!username.equals("test") || !password.equals("123456")){
            return Result.fail("用户名或密码错误");
        }

        return Result.succ("登录成功");
    }
}
