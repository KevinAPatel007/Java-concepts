package Oopsconcept;

public class studentmain {

        int sid ;
        String sname ;
        char sgrade ;

        public studentmain() {

        }


        void display() { //aproach
            System.out.println(sid);
            System.out.println(sname);
            System.out.println(sgrade);}


        void getValue(int id, String name, char grade){

            sid=id;
            sname=name;
            sgrade=grade;
        }
        studentmain (int id, String name, char grade){
                sid=id;
                sname=name;
                sgrade=grade;



        }


}


