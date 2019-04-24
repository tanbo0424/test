package com.qf.userinfo.service.Impl;

import com.qf.pojo.UserInfo;
import com.qf.userinfo.mapper.UserInfoMapper;
import com.qf.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserInfoImpl implements UserService {
    @Autowired(required = false)
    UserInfoMapper userInfoDao;
    
    
    public List<UserInfo> getAllUserInfoMap() {
        List<UserInfo> userInfos = userInfoDao.getAllUserInfoMap();
        return userInfos;
    }

    public void deleteUserInfoById(int id) {
        userInfoDao.deleteUserInfoById(id);
    }
    @Transactional
    public void insertUserInfo(UserInfo userInfo) {
        userInfoDao.addUserInfo(userInfo);
    }



    public UserInfo selectUserInfoById(int id) {
        UserInfo userInfo = userInfoDao.selectUserInfoById(id);
        return userInfo;
    }



   public void updateUserInfoBy(UserInfo userInfo) {
        userInfoDao.updateUserInfoBy(userInfo);
    }

    public  Boolean checkUserLogin(UserInfo userInfo) {
        UserInfo userInfos = userInfoDao.getUserInfoBy(userInfo);

        if (userInfos!=null){
            return true;
        }

        return false;
    }



}
