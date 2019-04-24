package com.qf.pojo;

public class UserInfo {
    int userid;
    String username;
    String password;
    String state;
    int usertype;
    String createby;
    String createat;
    String  modifyby;
    String  modifyat;
    String token;
    String idcard;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby;
    }

    public String getModifyat() {
        return modifyat;
    }

    public void setModifyat(String modifyat) {
        this.modifyat = modifyat;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", usertype=" + usertype +
                ", createby='" + createby + '\'' +
                ", createat='" + createat + '\'' +
                ", modifyby='" + modifyby + '\'' +
                ", modifyat='" + modifyat + '\'' +
                ", token='" + token + '\'' +
                ", idcard='" + idcard + '\'' +
                '}';
    }
}
