package model;

import java.util.ArrayList;

public class Teacher {
    String name;
    ArrayList<Student> manageStudent;

    public Teacher(String name, ArrayList<Student> manageStudent) {
        this.name = name;
        this.manageStudent = manageStudent;
    }

    public void add(Student newStu) {
        this.manageStudent.add(newStu);
    }

    public void printAll() {
        for (int i = 0; i < manageStudent.size(); i++) {
            String name = manageStudent.get(i).name;
            int age = manageStudent.get(i).age;
            String gender = manageStudent.get(i).gender;
            System.out.println(String.format("%s,%d,%s", name, age, gender));
        }
    }
}
