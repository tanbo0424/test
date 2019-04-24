package com.qf.userinfo.controller;

import com.qf.pojo.UserInfo;
import com.qf.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ResultFulController {
    @Autowired
    UserService userService;
    //查所有
    @RequestMapping("getAllUserInfoMap")
    public List<UserInfo> getAllUserInfoMap(){
        return userService.getAllUserInfoMap();
    }

    //通过id查表
    @RequestMapping(value = "upUser", method = RequestMethod.POST)
    public Object upUser(@RequestParam int uid){
        return userService.selectUserInfoById(uid);
    }

    //改
   @RequestMapping(value = "upUserDo", method = RequestMethod.POST)
    public Object upUserDo(@RequestBody UserInfo userInfo){
        userService.updateUserInfoBy(userInfo);
        return  "更改成功";
    }
    //通过ID删
    @RequestMapping(value="delUser", method = RequestMethod.POST)
    public String delUser(@RequestParam(value = "userid", defaultValue = "0") int id){
        userService.deleteUserInfoById(id);
        return "删除成功";
    }
    //增加用户
    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public Object insert(@RequestBody UserInfo userInfo) {
        userService.insertUserInfo(userInfo);
        return "添加成功";
    }

    //登录
    @RequestMapping("checkUserInfo")
    public Boolean checkUserInfo(@RequestParam String username, @RequestParam String password) {
       // System.out.println("username:" + username + ",密码:" + password);
        //根据用户名和密码查询是否有这个用户
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);

        return userService.checkUserLogin(userInfo);
    }

}