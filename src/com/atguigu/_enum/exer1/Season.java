package com.atguigu._enum.exer1;

/**
 * @author : Yac
 * @date : 2023/8/12
 */
public class Season {
    private String name;
    private String description;//描述季节
    public static final Season SPRING= new Season("春天","鸟语花香");
    public static final Season SUMMER= new Season("夏天","烈日炎炎");
    public static final Season AUTUMN= new Season("秋天","秋高气爽");
    public static final Season WINTER= new Season("冬天","银装素裹");

    public Season(String name, String description) {
        super();
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
