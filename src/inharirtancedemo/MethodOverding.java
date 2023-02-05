package inharirtancedemo;

class Bank
{
    double rateofintrest()
    {
        return 0;
    }
    double rateofintres(){
        return 1;
    }
}
class sbi extends Bank
{
    double rateofintrest()
    {
        return 9.7;
    }
    double rateofintres(){
        return 5;
    }
}
class axis extends Bank
{
    double rateofintrest()
    {
        return 9;
    }
}
public class MethodOverding {
    public static void main(String[] args) {
        Bank bk=new Bank();
        System.out.println(bk.rateofintres());
        System.out.println(bk.rateofintrest());
        sbi Sbi=new sbi();
        System.out.println(Sbi.rateofintres());
        System.out.println(Sbi.rateofintrest());
        axis Acis=new axis();
        System.out.println(Acis.rateofintrest());

    }
}
