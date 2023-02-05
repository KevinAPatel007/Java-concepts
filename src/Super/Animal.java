package Super;

public class Animal
{
    String color="white";
    int age=15;

    void m1(){
        System.out.println("my dog is snoopy");
    }

static class Dog extends Animal {
    String color = "Black";
    int age=20;


    void Display() {
        System.out.println(age);
        System.out.println(color);



    }
}}
/*    public static void main(String[] args) {
    Animal AM = new Animal();
        AM.m1();
        System.out.println(AM.color);
    }
}*/
