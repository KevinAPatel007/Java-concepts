package array;

public class FindEvenNumber {
    public static void main(String[] args) {
        int a[] = {100, 121, 135, 200, 150, 125, 15, 18, 19};
        System.out.println("even numbers are_____________");
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("odd numbers are_____________");

        for (int i : a)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }
            }





