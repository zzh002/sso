package com.sso.service;

import com.sso.common.ServerResponse;
import com.sso.pojo.User;

/**
 * @author ZZH
 * @date 2018/12/25 0025 21:42
 **/
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
