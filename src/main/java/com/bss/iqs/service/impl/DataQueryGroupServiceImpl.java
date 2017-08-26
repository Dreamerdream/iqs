package com.bss.iqs.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.DataQueryGroup;
import com.bss.iqs.entity.DataQueryTask;
import com.bss.iqs.mapper.DataQueryGroupMapper;
import com.bss.iqs.mapper.DataQueryTaskMapper;
import com.bss.iqs.service.IDataQueryGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
@Service
public class DataQueryGroupServiceImpl extends ServiceImpl<DataQueryGroupMapper, DataQueryGroup> implements IDataQueryGroupService {

    @Autowired
    private DataQueryTaskMapper dataQueryTaskMapper;

    @Autowired
    private DataQueryGroupMapper dataQueryGroupMapper;
    @Override
    public List<DataQueryTask> getdataQueryTasks() {

        Wrapper<DataQueryTask> dataQueryTaskWrapper = new EntityWrapper<>();
        dataQueryTaskWrapper.eq("status","1");
        List<DataQueryTask> dataQueryTasks = dataQueryTaskMapper.selectList(dataQueryTaskWrapper);
        return dataQueryTasks;
    }

    @Override
    public Result savedataQueryGroup(DataQueryGroup dataQueryGroup) {
        Integer insert = dataQueryGroupMapper.insert(dataQueryGroup);
        if (insert != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("添加成功");
        }
        return null;
    }

    @Override
    public Result updatedataQueryGroup(DataQueryGroup dataQueryGroup) {
        Integer integer = dataQueryGroupMapper.updateById(dataQueryGroup);
        if (integer != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("修改成功");
        }
        return null;
    }

    @Override
    public Result deletedataQueryGroup(Integer id) {
        Integer integer = dataQueryGroupMapper.deleteById(id);
        if (integer != null){
            Result result = new Result();
            result.setErrorCode(0);
            result.setErrorReason("删除成功");
        }
        return null;
    }

    @Override
    public DataQueryGroup getdataQueryGroup(Integer id) {
        DataQueryGroup dataQueryGroup = dataQueryGroupMapper.selectById(id);
        if (dataQueryGroup != null){
            return dataQueryGroup;
        }
        return null;
    }
}
