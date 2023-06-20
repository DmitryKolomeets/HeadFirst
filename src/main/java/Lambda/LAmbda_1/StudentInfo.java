package Lambda.LAmbda_1;

import java.util.ArrayList;

public class StudentInfo {



    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }


    void printStudentsUnderAge(ArrayList<Student> al, double age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s : al) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }


}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();


        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students, 8);
        System.out.println("--------------------------------");
        info.printStudentsUnderAge(students, 30);
        System.out.println("--------------------------------");
        info.printStudentsMixCondition(students, 20, 9.5 , 'f');




    }
}