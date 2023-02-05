package ArrayListDemo;

import java.util.ArrayList;

/*How to declare array list
        how to to add elements/values to array list
        Find size of array list
        remove elements/values from array list
        insert a new element in the middle of array list
        read values from arraylist*/
public class ArrayListFunctions {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add("Welcome");
        list.add('A');
        list.add(false);
        list.add(12546);
        list.add(4.5);
        list.add("selenium");
        //System.out.println(list);// printed all of the value in console value prints in array box
        //System.out.println(list.size());// printed how many size is the ex:5 here
        //System.out.println(list.remove(4));// printed remove index number 4
        System.out.println(list.remove(0));
        System.out.println(list.add("java"));



        System.out.println(list);       // System.out.println(list);
       // for (Object i:list)// this method extracts and prints all values seprately
        {
        //    System.out.println(i);
        }

    }
}
