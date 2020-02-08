package model;

public class Student {
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void study() {
        System.out.println(name + "在学习");
    }

    public void rest() {
        System.out.println(name + "在休息");
    }
}
