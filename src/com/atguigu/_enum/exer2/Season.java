package com.atguigu._enum.exer2;

/**
 * @author : Yac
 * @date : 2023/8/12
 */
public enum Season {
    /**
     * agree
     */

    SPRING("春天", "鸟语花香"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "银装素裹");


    private String name;
    private String description;//描述季节

    Season(String name, String description) {

        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

