package com.myke.api;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author: zh
 * @date: 2020/3/7/007 11:33
 */
public interface UserService {
    String userAddress(@NotBlank(message = "userId 不能为空") String userId);
}
