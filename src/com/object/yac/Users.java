package com.object.yac;

public class Users {
   private String username;
   private String password;
   private String confirmpassword;
   private String email;
   private String gender;
   private int age;
    public Users(){

    }

    public Users(String username, String password, String confirmpassword, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.email = email;
        this.gender = gender;
        this.age = age;
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

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void register(){
       System.out.println("注册成功");
   }

}
