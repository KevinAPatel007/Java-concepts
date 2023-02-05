package array;

public class searchElementinAray {
    public static void main(String[] args) {

        int a[] = {100, 20, 50, 150, 80, 70, 40};
        int num = 1000;

        for (int i : a) {
            if (i == num)
            {   System.out.println("Element found");}
            else System.out.println("not found");
            break;
        }
    }
}
