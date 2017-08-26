package com.bss.iqs.service;


import com.baomidou.mybatisplus.service.IService;
import com.bss.iqs.bean.Result;
import com.bss.iqs.bean.UserLoginResult;
import com.bss.iqs.bean.UserResult;
import com.bss.iqs.entity.QueryUserLogin;
import com.bss.iqs.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
public interface IUserService extends IService<User> {
    public Result saveUser(User user);

    public Result deleteUser(Integer id);

    public Result updateUser(User user);

    public User getUser(Integer id);


    public List<QueryUserLogin> queryUser(String type, String keyword, Integer pageNum, Integer pageSize);

    public UserResult getDepartmentAndUserGroup();

    public Result login(String username, String password);

    public List<UserLoginResult> queryAll();
}
