package Oopsconcept;

public class student1 {
    public static void main(String[] args) {
        studentmain stu1=new studentmain();
       studentmain stu2=new studentmain();
        studentmain stu3=new studentmain(103,"megha",'B');

     stu1.sid = 101;
       stu1.sname ="dev";
       stu1.sgrade = 'A';

       stu2.getValue(100, "aarya",'A' );

        stu1.display();
        stu2.display();
        stu3.display();
    }
}
