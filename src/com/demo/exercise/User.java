package com.demo.exercise;

/**
 * @author Ryan
 */
public class User {
    private String username;
    private String password;
    private String mailbox;
    private String sex;
    private int age;

    public User() {
    }

    public User(String username, String password, String mailbox, String sex, int age) {
        //属性
        this.username = username;
        this.password = password;
        this.mailbox = mailbox;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     * 定义无参构造方法
     */

    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     * 定义无参构造方法============================
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     * 定义Getter和Setter方法
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return mailbox
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * 设置
     * @param mailbox
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
