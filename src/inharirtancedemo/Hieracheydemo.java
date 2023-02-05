package inharirtancedemo;


    class Parent{
        int a;
        void Display(){
            System.out.println(a);
        }
    }
    class Child1 extends Parent
    {
        int b;
        void Print(){
            System.out.println(b);
        }
    }
    class Child2 extends Parent
    {
        int c;
        void Show(){
            System.out.println(c);
        }
    }
public class Hieracheydemo{
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.b=100;
        c1.a=200;
        c1.Display();
        c1.Print();

        Child2 c2=new Child2();
        c2.a=50;
        c2.c=15;
        c2.Display();
        c2.Show();
    }
}
