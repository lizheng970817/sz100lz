package com.itheima.prictices1_继承;

/**
 * @author:lizheng
 * @Data:2020/7/8 19:32
 */

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import javax.naming.Name;

/**
 * 1.创建类描述学生、老师；
 * 2.学生和老师都具有的属性：姓名；性别；年龄；
 * 3.学生具有的行为：吃饭；睡觉；学习；其中，调用学习功能能够输出一句话：xxx在学习Java；
 * 4.老师具有的行为：吃饭；睡觉；教学；其中，调用教学功能能够输出一句话：xxx在教Java；
 * 注：上面的xxx指的是老师或学生的名字；
 */
class Person{
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){
        int[] ints =new int[9];

    }


    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println(name+","+sex+","+age);
    }
}

/**
 * 学生具有的行为：吃饭；睡觉；学习；其中，调用学习功能能够输出一句话：xxx在学习Java；
 *  * 4.老师具有的行为：吃饭；睡觉；教学；其中，调用教学功能能够输出一句话：xxx在教Java；
 *  * 注：上面的xxx指的是老师或学生的名字；
 */
class Student extends Person{
    public Student(String name, String sex, int age){
        super(name,sex,age);
    }

    public  void study(){
       System.out.println(this.getName()+"在学习java");
   }
}

class Teacher extends Person{
    public Teacher(String name ,String sex ,int age){
            super(name,sex,age);
    }


    public void teach(){
        System.out.println(this.getName()+"在教java");
    }
}


public class Test {
    public static void main(String[] args) {
        Student st = new Student("张三","男",22);
        st.eat();
        st.sleep();
        st.study();
        st.show();
		System.out.println("我被更改了");
		System.out.println("奇怪");
        Teacher t= new Teacher("李四","女",22);
        t.eat();
        t.sleep();
        t.teach();
        t.show();

    }
}
