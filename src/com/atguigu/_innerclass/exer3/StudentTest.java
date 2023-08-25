package com.atguigu._innerclass.exer3;

/**
 * @author : Yac
 * @date : 2023/8/12
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] arr=new Student[5];
        arr[0] =new Student(001,"张三",23,83);
        arr[1] =new Student(002,"李四",24,94);
        arr[2] =new Student(003,"王五",25,65);
        arr[3] =new Student(004,"谷哥",28,100);
        arr[4] =new Student(005,"谷姐",18,88);
        System.out.println("按照年龄从小到大：");
        MyArrays.bubbleSort(arr, new Comparator() {
            @Override
            public int sort(Object o1, Object o2) {
                return ((Student)o1).getAge()-((Student)o2).getAge();

                }
            }
        );
        MyArrays.iterate(arr);
        System.out.println("------------");
        System.out.println("按照成绩从高到低排序：");
        MyArrays.bubbleSort(arr, new Comparator() {
            @Override
            public int sort(Object o1, Object o2) {
                return ((Student)o2).getScore()-((Student)o1).getScore();
            }
        });
        MyArrays.iterate(arr);

        System.out.println("------------");
        System.out.println("按照编号从小到大排序：");
        MyArrays.bubbleSort(arr, new Comparator() {
            @Override
            public int sort(Object o1, Object o2) {
                return ((Student)o1).getId()-((Student)o2).getId();
            }
        });
        MyArrays.iterate(arr);
    }
}
