package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Page;
import com.fh.model.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List queryList(Page page);

    void updateUser(User user);
}
