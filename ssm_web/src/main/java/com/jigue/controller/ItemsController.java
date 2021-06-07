/**
 * Created by Tanglf
 * 2021-06-07 18:28
 */
package com.jigue.controller;

import com.jiuge.bean.Items;
import com.jiuge.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
* 6.4创建ItemsController类，类上打@Controller，@RequestMapping(value = "/items") ，
* 方法上打@RequestMapping(value = "/list") ,注入service层对象
 * */
@Controller
@RequestMapping(value = "/items")
public class ItemsController {
    //注入service层对象
    @Autowired
    private ItemsService service;
    @RequestMapping(value = "/list")
    public String findAll(Model model){
         //调用service，返回结果
        List<Items> items = service.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    @RequestMapping(value = "/add")
    public String add(Items items){
        //调用service，返回结果
        int rows = service.add(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }

}
