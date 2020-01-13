package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.Page;
import com.fh.model.User;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("user/")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("queryList")
    public ServerResponse queryList(Page page){
        return userService.queryList(page);
    }


    @RequestMapping("addUser")
    public ServerResponse addUser(User user){

        return userService.addUser(user);
    }



    @RequestMapping("getIdByUser")
    public ServerResponse getIdByUser(Integer id){
        return userService.getIdByUser(id);
    }

    @RequestMapping("updateUser")
    public ServerResponse updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping("deleteUser")
    public ServerResponse deleteUser(Integer id){
        return userService.deleteUser(id);
    }

    @RequestMapping("getPidByArea")
    public ServerResponse getPidByArea(Integer pid){
        return userService.getPidByArea(pid);
    }

}
