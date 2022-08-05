package day30_CustomClass;

import java.util.ArrayList;

public class StudentsObject {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setInfo("navid",'M',26, 1163,'C');

        Students student2 = new Students();
        student2.setInfo("bayes",'M',20,10090,'B');

        Students student3 = new Students();
        student3.setInfo("basit",'M',26,10091,'A');

        Students student4 = new Students();
        student4.setInfo("emran",'M',26,1169,'D');

        Students[] students = {student1,student2,student3,student4};
        for (Students student : students) {
            System.out.println(student);


        }
        System.out.println("---------------------");
        ArrayList<Students> earlyBirds = new ArrayList<>();
        ArrayList<Students> angryBirds = new ArrayList<>();

        for (Students student : students) {
            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);


    }


    }

