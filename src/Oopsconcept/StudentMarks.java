package Oopsconcept;

public class StudentMarks {


        int sub1,sub2,sub3;


    StudentMarks()   // default constructor
        {
            sub1=10;
            sub2=20;
            sub3=60;

            System.out.println(sub1+sub2+sub3);
        }





    StudentMarks(int a, int b, int c) //Parameterized constructor
        {
            sub1=a;
            sub2=b;
            sub3=c;
            System.out.println(sub1+sub2+sub3);
        }


        public static void main(String[] args) {

            StudentMarks cm=new StudentMarks(60,20,30);
        }


    }
