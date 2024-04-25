package com.test.service;

import com.test.common.Result;

public interface UserService {
    Result login(String username, String password);
}
