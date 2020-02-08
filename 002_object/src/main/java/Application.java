import model.Student;
import model.Teacher;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student("李莉", 20, "女");
        stu.study();
        stu.rest();
        ArrayList<Student> manage = new ArrayList<>();
        Student stu2 = new Student("王其", 21, "男");
        manage.add(stu);
        manage.add(stu2);
        Teacher teacher = new Teacher("张龙", manage);
        Student stu3 = new Student("赵毅", 22, "男");
        teacher.add(stu3);
        teacher.printAll();
    }
}
