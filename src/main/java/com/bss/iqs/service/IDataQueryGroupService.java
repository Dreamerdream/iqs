package com.bss.iqs.service;


import com.baomidou.mybatisplus.service.IService;
import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.DataQueryGroup;
import com.bss.iqs.entity.DataQueryTask;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
public interface IDataQueryGroupService extends IService<DataQueryGroup> {

    public List<DataQueryTask> getdataQueryTasks();

    public Result savedataQueryGroup(DataQueryGroup dataQueryGroup);

    public Result updatedataQueryGroup(DataQueryGroup dataQueryGroup);

    public Result deletedataQueryGroup(Integer id);

    public DataQueryGroup getdataQueryGroup(Integer id);
	
}
