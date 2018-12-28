import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher(30,
                "Clear Lake High School", 6);

        System.out.println(mathTeacher.numberOfStudents);
        System.out.println(mathTeacher.school);
        System.out.println(mathTeacher.favoriteNumber);
        System.out.println(mathTeacher.getRole());

        Teacher teacher = new Teacher(400,
                "Eagle 43 High School");

        System.out.println(teacher.numberOfStudents);
        System.out.println(teacher.school);
        System.out.println(teacher.getRole());
       // System.out.println(teacher.favoriteNumber)
    }
}