package com.test.controller;

import com.test.common.Result;
import com.test.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public Result login(String username, String password, HttpServletRequest request){
        Result login = userService.login(username, password);
        if(login.getCode() == 200){
            request.getSession().setAttribute("user", "login-success");
        }
        return login;
    }
}
