package KeywordValueandReference;

public class ThisKeyword {
        int a,b;

        ThisKeyword(int a, int b)
        {
            this.a=a;
            this.b=b;
        }

        void display()
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println("Sum of a & b is:" +(a+b));
        }

        public static void main(String[] args) {

            ThisKeyword th=new ThisKeyword(10,20);
            //th.add(10, 20);
            th.display();


        }


}
