package com.bss.iqs.controller;


import com.bss.iqs.bean.Result;
import com.bss.iqs.entity.DataQueryGroup;
import com.bss.iqs.entity.DataQueryTask;
import com.bss.iqs.service.IDataQueryGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hgh
 * @since 2017-08-25
 */
@Controller
@RequestMapping("/dataQueryGroup")
public class DataQueryGroupController {

    @Autowired
    private IDataQueryGroupService dataQueryGroupService;

    @RequestMapping("/getdataQueryTasks")
    @ResponseBody
    private ModelAndView getdataQueryTasks(){
        List<DataQueryTask> dataQueryTasks = dataQueryGroupService.getdataQueryTasks();
        ModelAndView modelAndView = new ModelAndView("Add");
        modelAndView.addObject("dataQueryTasks",dataQueryTasks);
        return modelAndView;
    }

    @RequestMapping("/save")
    @ResponseBody
    private Result savedataQueryGroup(DataQueryGroup dataQueryGroup){
        Result result = dataQueryGroupService.savedataQueryGroup(dataQueryGroup);

        return result;
    }
}
