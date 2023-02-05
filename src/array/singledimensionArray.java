package array;
/*1) Declare an array
2) insert values into array
3) Find size of an array
4) read values from an array
*/
public class singledimensionArray {
    public static void main(String[] args) {
      /*  int a[] = new int[5];// when value is fixed
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        System.out.println(a[4]);*/

        int b[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        System.out.println(b.length);

// classic for loop
        //       for (int i = 0; i <= b.length - 1; i++){
        //     System.out.println(b[i]);
//    }
// enhanced for loop
    for (int i : b){
        System.out.println(i);
    }

    }}