package OopsConceptP2;

import Oopsconcept.student;

public class MainMarks {

        public static void main(String[] args) {
        student stu1= new student();

        /*stu1.sid =101; //assising the value using the object
        stu1.sname="megha";*/

            stu1.getvalue(101,"Megha");// getvalue Method
            stu1.display(); //apply in all method but constractor method do not need .display method

            StudentMarks studentMarks=new StudentMarks(30,40,50);// constractor method need only one line which is this 16


}
}
