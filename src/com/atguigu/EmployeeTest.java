package com.atguigu;
// STOPSHIP: 2023/7/16
public class EmployeeTest {
    public static void main(String[] args) {
            Employee emp1=new Employee();
            emp1.id="001";
            emp1.name="杰克";
            emp1.age=18;
            emp1.salary=5999;

            emp1.birthday=new MyDate();
            emp1.birthday.year=2000;
            emp1.birthday.month=7;
            emp1.birthday.day=9;
            //打印员工信息表
        System.out.println("id="+emp1.id+","+"name="+emp1.name+","+
       "age=" +emp1.age+","+"salary="+","+emp1.salary+","+"birthday="+
       "["+ emp1.birthday.year+"年"+emp1.birthday.month+"月"+ emp1.birthday.day+"日"+"]" );

    }
}
