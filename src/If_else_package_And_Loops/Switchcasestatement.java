package If_else_package_And_Loops;

public class Switchcasestatement {
    public static void main(String[] args) {
        int month=9;
        switch (month) {
            case 1: System.out.println("january");break;
            case 2: System.out.println("february");break;
            case 3: System.out.println("march");break;
            case 4: System.out.println("april");break;
            case 5: System.out.println("may");break;
            case 6: System.out.println("june");break;
            case 7: System.out.println("july");break;
            case 8: System.out.println("auguest");break;
            case 9: System.out.println("september");break;
            case 10: System.out.println("october");break;
            case 11: System.out.println("novomber");break;
            case 12: System.out.println("december");break;
            default:
                System.out.println("no such month found");
        }
        int day=7;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
            default:
                System.out.println("no such day found");
        }
    }
}
