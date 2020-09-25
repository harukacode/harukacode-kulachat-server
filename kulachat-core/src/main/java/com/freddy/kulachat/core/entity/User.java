package com.freddy.kulachat.core.entity;

import java.util.Date;
import java.util.Objects;

/**
 * @author FreddyChen
 * @name
 * @date 2020/09/22 20:22
 * @email chenshichao@outlook.com
 * @github https://github.com/FreddyChen
 */
public class User {

    private Long userId;
    private String phone;
    private String nickname;
    private String avatar;
    private int gender;
    private String birthday;
    private String signature;
    private String province;
    private String city;
    private boolean isCompletedInfo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCompletedInfo() {
        return isCompletedInfo;
    }

    public void setCompletedInfo(boolean completedInfo) {
        isCompletedInfo = completedInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", phone='" + phone + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                ", signature='" + signature + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", isCompletedInfo=" + isCompletedInfo +
                '}';
    }
}