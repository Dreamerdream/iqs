package com.bss.iqs.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.UserGroup;
import com.bss.iqs.mapper.UserGroupMapper;
import com.bss.iqs.service.IUserGroupService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
@Service
public class UserGroupServiceImpl extends ServiceImpl<UserGroupMapper, UserGroup> implements IUserGroupService {
    @Autowired
    private UserGroupMapper userGroupMapper;

    @Override
    public Result saveUserGroup(UserGroup userGroup) {
        Integer insert = userGroupMapper.insert(userGroup);
        if (insert != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("添加成功");
        }
        return null;
    }

    @Override
    public Result deleteUserGroup(Integer id) {
        Integer integer = userGroupMapper.deleteById(id);
        if (integer != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("删除成功");
        }
        return null;
    }

    @Override
    public Result updateUserGroup(UserGroup userGroup) {
        Integer integer = userGroupMapper.updateById(userGroup);
        if (integer != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("更新成功");
        }
        return null;
    }

    @Override
    public UserGroup getUserGroup(Integer id) {
        return userGroupMapper.selectById(id);
    }
}
