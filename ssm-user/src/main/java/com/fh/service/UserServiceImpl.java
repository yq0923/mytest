package com.fh.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.common.ServerResponse;
import com.fh.mapper.AreaMapper;
import com.fh.mapper.UserMapper;
import com.fh.model.Area;
import com.fh.model.Page;
import com.fh.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private AreaMapper areaMapper;
    @Override
    public ServerResponse queryList(Page page) {
        Map map = new HashMap();
        List list = userMapper.queryList(page);
        Integer total = userMapper.selectCount(null);
        map.put("draw",page.getDraw());
        map.put("recordsTotal",total);
        map.put("recordsFiltered",total);
        map.put("data",list);
        return ServerResponse.success(map);
    }

    @Override
    public ServerResponse addUser(User user) {
        userMapper.insert(user);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse getPidByArea(Integer pid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("pid",pid);
        List<Area> list = areaMapper.selectList(queryWrapper);
        return ServerResponse.success(list);
    }

    @Override
    public ServerResponse getIdByUser(Integer id) {
        User user = userMapper.selectById(id);
        return ServerResponse.success(user);
    }

    @Override
    public ServerResponse updateUser(User user) {
        userMapper.updateUser(user);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse deleteUser(Integer id) {
        userMapper.deleteById(id);
        return ServerResponse.success();
    }
}
