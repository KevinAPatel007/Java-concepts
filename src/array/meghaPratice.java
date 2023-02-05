package array;

public class meghaPratice {
    public static void main(String[] args) {
        int a[]={140,50,70,55,65,75,79,80};
        System.out.println("even number");
        for (int i:a)
        if(i%2==0)
        {
            System.out.println(i);
        }
        System.out.println("odd number");
        for (int i:a)
        if(i%2!=0)
        {
            System.out.println(i);
        }

    }
}
