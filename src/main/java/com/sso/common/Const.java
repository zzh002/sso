package com.sso.common;

/**
 * @author ZZH
 * @date 2018/12/25 0025 21:39
 **/
public class Const {

    public static final String CURRENT_USER = "currentUser";
    public static final String TOKEN_PREFIX = "token_";

    public interface RedisCacheExtime{
        int REDIS_SESSION_EXTIME = 60 * 30;//30分钟
    }
}
