package com.fh.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer sex;
    private Integer aid1;
    private Integer aid2;
    private Integer aid3;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registerTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAid1() {
        return aid1;
    }

    public void setAid1(Integer aid1) {
        this.aid1 = aid1;
    }

    public Integer getAid2() {
        return aid2;
    }

    public void setAid2(Integer aid2) {
        this.aid2 = aid2;
    }

    public Integer getAid3() {
        return aid3;
    }

    public void setAid3(Integer aid3) {
        this.aid3 = aid3;
    }

    public Date getRegisterTime(Date date) {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

}
