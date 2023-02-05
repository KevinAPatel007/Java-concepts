package array;

public class ElementNotfound {
    public static void main(String[] args) {
        int a[] = {120, 300, 400, 200, 350, 600};
        int num = 300;
        boolean flag=false;
        for (int i : a) {
            if (i == num) {
                System.out.println("Element found");
                flag = true;
                break;
            }
        }
        if (flag==false)
        {

            System.out.println("Element not found");
        }}}
      /*  double myDouble = 9.78d;
        int myInt =
                (int)              This is converstion method
                        myDouble;
        System.out.println(myInt);
    }*/

