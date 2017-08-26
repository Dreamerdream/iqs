package com.bss.iqs.service;


import com.baomidou.mybatisplus.service.IService;
import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.DataQueryGroup;
import com.bss.iqs.entity.DataQuerySql;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
public interface IDataQuerySqlService extends IService<DataQuerySql> {
    public Result saveSql(DataQuerySql sql);

    public Result deleteSql(Integer id);

    public Result updateSql(DataQuerySql sql);

    public DataQuerySql getSql(Integer id);

    public List<DataQueryGroup> getDataQueryGroup();

    public List<DataQuerySql> querySql(Integer groupId,String keyword);
}
