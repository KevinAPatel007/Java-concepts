package string;

import java.util.Locale;

public class concat {
    public static void main(String[] args) {
        String s1="megha";
        String s2="patel";
        String s3="36 lower tail";
        System.out.println(s1+ " "+s2+" ");
        System.out.println(s3);
        String s4= "watford";
        String s5= "wd19 5dd";
        System.out.println(s4+"  ".concat(s5));
        System.out.println(s2.charAt(0));
        System.out.println(s1.charAt(2));
                //contains method
        System.out.println(s3.contains("tail"));//true
        System.out.println(s1.contains("tail"));//false
        //equals
        System.out.println(s1.equals("megha"));//true
        System.out.println(s2.equals("megha"));//false
        //replace
        System.out.println(s1.replace(s1,"dev"));//replace megha to dev

        String s="welcome to java welcome to selenium";
        System.out.println(s.replace('e','a'));// walcoma to java walcoma to salanium
        //case to uppercase letters
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        //substracting letter from string
        System.out.println(s.substring(1,4));//elc
        System.out.println(s.substring(0,4));//welc
        //reverse method
        int len=s.length();
        String rev="";
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("printing reverse string____________");
        System.out.println(rev);

    }
}
