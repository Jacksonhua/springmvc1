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

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
