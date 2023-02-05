package ArrayListDemo;



import com.sun.applet2.preloader.event.ConfigEvent;

import java.util.HashMap;
import java.util.Map;

/*HashMap
        ----------
        declare HASHMAP
        add pairs to hashmap
        remove pairs from hashmap
        read pairs from hashmap*/
public class Hashmapdemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(101, "john");

        hm.put(106, "peter");
        hm.put(102, "scott");
        hm.put(103, "james");
        hm.put(104, "kim");
        hm.put(105, "alan");

        System.out.println(hm);

        //hm.remove(103);
        // System.out.println(hm);

      for (Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}
