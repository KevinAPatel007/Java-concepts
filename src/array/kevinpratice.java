package array;

public class kevinpratice {
    public static void main(String[] args) {
        int a[] = {100, 500, 600, 7, 759, 357, 951, 51, 800, 900};
        //for (int i:a){System.out.println(i);}
    /* int sum=0;
     for (int i:a){sum=sum+i;}System.out.println(sum);}*/
        System.out.println("even numbers");
        for (int i : a)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        System.out.println("odd numbers");
        for (int i : a)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }
}
