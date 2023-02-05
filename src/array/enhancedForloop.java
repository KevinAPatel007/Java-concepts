package array;

public class enhancedForloop {
    public static void main(String[] args) {
        int a[][]= {{100,200},{300,400},{500,600},{700,800},{900,1000}};

        for (int r[]:a){
            for (int i:r){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
