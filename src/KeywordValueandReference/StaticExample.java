package KeywordValueandReference;

public class StaticExample {
    static int a=10;
    int b=20;

    static void a1()
    {
        System.out.println("this is a1 static method");
    }


    void a2()
    {
        System.out.println("this is a2 Non-static method");
    }
    void m3()
    {
        System.out.println("--------output from a3--------------");
        System.out.println(a);
        System.out.println(b);
        a1();
        a2();
    }
    public static void main(String[] args) {
        System.out.println(a);
        a1();

        StaticExample se=new StaticExample();
        System.out.println(se.b);
        se.a2();
        
        se.m3();

    }
}
