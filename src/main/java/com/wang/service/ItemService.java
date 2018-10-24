package com.wang.service;

import com.wang.pojo.Item;

import java.util.List;

/**
 * @author Jackwang
 * @Title: itemService
 * @ProjectName springmvc1
 * @Description:
 * @date 2018/10/2422:13
 */
public interface ItemService {
    List<Item> getItemList();
    List<Item> query(String name,double price);
/*    List<Item> query(String name);
    List<Item> query(double price);*/
    List<Item> query();

}
