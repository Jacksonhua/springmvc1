/**
 * @program: springmvc1
 * @description:
 * @author: Mr.Wang
 * @create: 2018-10-24 22:16
 * @UpdateDate:
 * @UpdateRemark: 更新说明
 * @Version: V1.0
 **/

package com.wang.service;

import com.wang.mapper.ItemMapper;
import com.wang.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> getItemList() {
        System.out.println(itemMapper);

        List<Item> items = (List<Item>) itemMapper.selectAll();
        return items;
    }

    @Override
    public List<Item> query(String id, double price) {
        System.out.println(itemMapper);
        List<Item> items = (List<Item>) itemMapper.queryBySome(id,price);

        return items;
    }

 /*   @Override
    public List<Item> query(String name) {
        List<Item> items = (List<Item>) itemMapper.queryBySome(name);
        return items;
    }

    @Override
    public List<Item> query(double price) {
        List<Item> items = (List<Item>) itemMapper.queryBySome(price);
        return items;
    }*/

    @Override
    public List<Item> query() {
        List<Item> items = (List<Item>) itemMapper.queryBySome();
        return items;
    }
}
