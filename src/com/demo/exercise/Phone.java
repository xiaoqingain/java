package com.demo.exercise;

public class Phone {
    private String brand;
    private double price;
    private double memory;
    private String model;


    Phone() {

    }

    Phone(String brand, double price, double memory, String model) {
        this.brand = brand;
        this.price = price;
        this.memory = memory;
        this.model = model;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    void phone(){
        System.out.println("品牌:"+brand);
        System.out.println("手机型号:"+model);
        System.out.println("内存:"+memory);
        System.out.println("价格:"+price);

    }

    public void call(int sum) {
        switch (sum) {
            case 1:
                System.out.println("正在给爸爸打电话");
                break;
            case 2:
                System.out.println("正在给妈妈打电话");
                break;
            case 3:
                System.out.println("正在给哥哥打电话");
                break;
            case 4:
                System.out.println("正在给妹妹打电话");
                break;
            default:
                System.out.println("您输入的拨号健有误");
        }

    }

    public void playGames() {
        System.out.println("正在运行游戏");

    }

    public void playMusic(int sum) {

        switch (sum) {
            case 1:
                System.out.println("正在播放听流行歌曲");
                break;
            case 2:
                System.out.println("正在播放听国歌");
                break;
            case 3:
                System.out.println("正在播放每日推荐");
                break;
            default:
                System.out.println("您输入的音乐有误");

        }


    }
}
