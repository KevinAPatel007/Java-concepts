package If_else_package_And_Loops;

public class comparemanynumbers {
    public static void main(String[] args) {
        // compare 5,9,21,36,48
        int i=5;
        int x=9;
        int y=21;
        int z=36;
        int a=48;

        if(i>x && i>y && i>z && i>a){
            System.out.println("i is greatest number");
        }
       else if(x>i && x>y && x>z && x>a){
            System.out.println("x is greatest number");
        }
        else if(y>i && y>x && y>z && y>a){
            System.out.println("y is greatest number");
        }
        else if(z>i && z>y && z>x && z>a){
            System.out.println("z is greatest number");
        }
        else {
            System.out.println("a is greatest number");
        }
    }
}
