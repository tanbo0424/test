package com.qf.userinfo.service;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface UserService {
    public List<UserInfo> getAllUserInfoMap();

    public void deleteUserInfoById(int id);

    public void insertUserInfo(UserInfo userInfo);

    public UserInfo selectUserInfoById(int id);

    public void updateUserInfoBy(UserInfo userInfo);

    public Boolean checkUserLogin(UserInfo userInfo);


}
