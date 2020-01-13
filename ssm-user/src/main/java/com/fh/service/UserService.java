package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.Page;
import com.fh.model.User;

public interface UserService {
    ServerResponse queryList(Page page);

    ServerResponse addUser(User user);

    ServerResponse getPidByArea(Integer pid);

    ServerResponse getIdByUser(Integer id);

    ServerResponse updateUser(User user);

    ServerResponse deleteUser(Integer id);
}
