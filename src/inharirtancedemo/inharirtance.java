package inharirtancedemo;


    class A
    {        int a;
        void display()
        {
            System.out.println(a);
        }
    }
    class B extends A {
        int b;

        void show() {
            System.out.println(b);
        }
    }
    class C extends B{

       int c;
       void print(){
        System.out.println(c);}
    }


public class inharirtance {
    public static void main(String[] args) {
        A obj=new A();
        obj.a=100;
        obj.display();

        B bobj=new B();
        bobj.a=200;
        bobj.b=400;
        bobj.display();
        bobj.show();

        C cobj=new C();
        cobj.a=10;
        cobj.b=25;
        cobj.c=15;
        cobj.display();
        cobj.show();
        cobj.print();


    }


}
