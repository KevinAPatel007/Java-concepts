package array;

public class searchelementinarray2 {
    public static void main(String[] args) {
        int a[] = {100, 200, 400, 300, 500, 6959, 2191, 20, -14, -26, 25, 106, -35, 89};
       /* for (int i=0;i<a.length;i++){ //how many number are there
            System.out.println(i);
        }*/
        //   for (int i:a)
        // {System.out.println(i);} // print all the elements in array
   /*int sum=0;
   for (int i:a) {
       sum = sum + i;
        {System.out.println(sum);}}}}*/// //printing all sum adding to main figure one by one (100+200=300+400=700)
    int sum=0;
    for (int i:a)
    {
        sum=sum+i;
    }
    {
            System.out.println(sum);}
    }
}

