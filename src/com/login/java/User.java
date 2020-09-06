package com.login.java;

/*
 * 用户实体类
 * */
public class User {
    private String user;
    private String pwd;

    public User() {
    }

    public User(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
