package com.wang.service;

import com.wang.mapper.ItemMapper;
import com.wang.pojo.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ItemServiceImplTest {
    private ItemMapper a;
    @Autowired
    private ItemMapper b;
    @Autowired
    private ItemService itemService;
@Test
public void a() {

    System.out.println(a);
    System.out.println(b.toString());
    System.out.println(a==b);

    System.out.println(b);

}

    @Test
    public void getItemList() {
        System.out.println(itemService);
//        List<Item> itemList = itemService.query("蛋卷", Double.parseDouble(null));
//        List<Item> itemList = itemService.getItemList();
        List<Item> itemList = itemService.query(null,100);
        for (Item i:itemList
             ) {
            System.out.println(i);

        }
//        System.out.println(itemList);
    }





}