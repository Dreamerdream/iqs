package com.bss.iqs.service;


import com.baomidou.mybatisplus.service.IService;
import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.Rds;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
public interface IRdsService extends IService<Rds> {
    public Result saveRDS(Rds rds);

    public Result deleteRDS(Integer id);

    public Result updateRDS(Rds rds);

    public Rds getRDS(Integer id);

    public List<Rds> queryRDS(Integer groupId, String keyword, Integer pageNum, Integer pageSize);
}
