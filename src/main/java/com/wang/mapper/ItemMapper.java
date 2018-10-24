package com.wang.mapper;

import com.wang.pojo.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

     List<Item> selectAll();

     List<Item> queryBySome(@Param("name") String name, @Param("price") Double price);

/*    List<Item> queryBySome(@Param("name") String name);
    List<Item> queryBySome(@Param("price") Double price);*/
    List<Item> queryBySome();

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}