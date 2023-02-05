package OopsConceptP2;

public class Student {


    public static class student {

        int sid;
        String sname;


        void studentP(int id, String name)
        {
            sid=id;
            sname=name;

        }



        void getValues(int id, String name)
        {
            sid=id;
            sname=name;

        }


        void display()
        {
            System.out.println(sid);
            System.out.println(sname);

        }
    }

}
