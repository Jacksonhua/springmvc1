/**
 * @program: springmvc1
 * @description:
 * @author: Mr.Wang
 * @create: 2018-10-24 22:14
 * @UpdateDate:
 * @UpdateRemark: 更新说明
 * @Version: V1.0
 **/

package com.wang.mapper.Impl;

import com.wang.mapper.ItemMapper;
import com.wang.pojo.Item;

import java.util.List;

public class itemMapperImpl implements ItemMapper {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Item record) {
        return 0;
    }

    @Override
    public int insertSelective(Item record) {
        return 0;
    }

    @Override
    public Item selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Item> selectAll() {
        List<Item> items = selectAll();
        return items;
    }

    @Override
    public List<Item> queryBySome(String id, Double price) {
        List<Item> items = queryBySome(id,price);
        return items;
    }

/*    @Override
    public List<Item> queryBySome(String name) {
        List<Item> items = queryBySome(name);
        return items;
    }

    @Override
    public List<Item> queryBySome(Double price) {
        List<Item> items = queryBySome(price);
        return items;
    }*/

    @Override
    public List<Item> queryBySome() {
        List<Item> items = queryBySome();
        return items;
    }

    @Override
    public int updateByPrimaryKeySelective(Item record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Item record) {
        return 0;
    }
}
