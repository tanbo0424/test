package com.qf.userinfo.mapper;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    //查全表 public List<UserInfo> getAllUserInfoMap();


    public void deleteUserInfoById(int id);

    public void addUserInfo(UserInfo userInfo);

    public UserInfo selectUserInfoById(int id);

    public void updateUserInfoBy(UserInfo userInfo);
    //登录
    public UserInfo getUserInfoBy(UserInfo userInfo);

    List<UserInfo> getAllUserInfoMap();


}
