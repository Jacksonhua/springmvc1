/**
 * @program: springmvc1
 * @description:
 * @author: Mr.Wang
 * @create: 2018-10-24 23:08
 * @UpdateDate:
 * @UpdateRemark: 更新说明
 * @Version: V1.0
 **/

package com.wang.controller;


import com.wang.pojo.Item;
import com.wang.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ItemController {
    @Resource
    private ItemService itemService;
    @RequestMapping("itemlist")
    public ModelAndView getItemList(){
        ModelAndView mav=new ModelAndView();
        List<Item> items=itemService.getItemList();
        mav.addObject("itemList",items);
        mav.setViewName("itemList");
        return mav;
    }
    @RequestMapping("queryItem")
    public ModelAndView queryItem(){
        ModelAndView mav=new ModelAndView();
        List<Item> items=itemService.getItemList();
        mav.addObject("itemList",items);
        mav.setViewName("itemList");
        return mav;
    }

}
