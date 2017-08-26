package com.bss.iqs.controller;


import com.bss.iqs.bean.Result;
import com.bss.iqs.bean.UserLoginResult;
import com.bss.iqs.bean.UserResult;
import com.bss.iqs.entity.DataQueryTask;
import com.bss.iqs.entity.QueryUserLogin;
import com.bss.iqs.entity.User;
import com.bss.iqs.service.IDataQueryTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 * InnoDB free: 3072 kB 前端控制器
 * </p>
 *
 * @author hgh
 * @since 2017-08-26
 */
@Controller
@RequestMapping("/dataQueryTask")
public class DataQueryTaskController {
    @Autowired
    private IDataQueryTaskService queryTaskService;
    @GetMapping("/save")
    public void saveDataQueryTask(DataQueryTask dataQueryTask){
        queryTaskService.saveDataQueryTask(dataQueryTask);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void deleteDataQueryTask(@PathVariable Integer id){
        System.out.println("111111");
        queryTaskService.deleteDataQueryTask(id);
    }

    @GetMapping("/update")
    @ResponseBody
    public void updateDataQueryTask(DataQueryTask dataQueryTask){
        queryTaskService.updateDataQueryTask(dataQueryTask);
    }


    @RequestMapping("/get/{id}")
    public ModelAndView getDataQueryTask(@PathVariable Integer id){
        DataQueryTask dataQueryTask = queryTaskService.getDataQueryTask(id);
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("user",dataQueryTask);
        return  modelAndView;
    }


    @RequestMapping("/query/{type}/{keyword}/")
    public ModelAndView queryDataQueryTask(@PathVariable Integer type,@PathVariable String keyword){
        List<DataQueryTask> dataQueryTasks = queryTaskService.queryDataQueryTask(type, keyword);
        ModelAndView modelAndView = new ModelAndView("updateUser");
        modelAndView.addObject("user",dataQueryTasks);
        return  modelAndView;

    }

    @RequestMapping("/beforeAdd")

    public ModelAndView getTemplateAndAddress(){
        queryTaskService.getTemplateAndAddress();
        ModelAndView modelAndView = new ModelAndView("addUser");
     //   modelAndView.addObject("departmentAndUserGroup",departmentAndUserGroup);
        return  modelAndView;
    }



    @RequestMapping("/queryAll")
    @ResponseBody
    public List<UserLoginResult> queryAll(){
      //  List<UserLoginResult> userLoginResults = queryTaskService.queryAll();
        return null;
    }
}
