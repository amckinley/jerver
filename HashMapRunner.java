import mapper.ArrayListMap;
import java.util.*;

public class HashMapRunner {
    public static void main(String[] args) {
        // our map
        ArrayListMap<String, Integer> myMap = new ArrayListMap<String, Integer>();

        myMap.put("foo", new Integer(4));
        myMap.put("bar", new Integer(42));

        // a real java map
        HashMap<String, Integer> realMap = new HashMap<String, Integer>();
        realMap.put("foo", new Integer(4));
        realMap.put("bar", new Integer(42));

        // if our map works, we should get the same results
        Integer myMapFoo = myMap.get("foo");
        Integer realMapFoo = realMap.get("foo");

        Integer myMapBar = myMap.get("bar");
        Integer realMapBar = realMap.get("bar");

        System.out.println("real foo: " + realMapFoo + ", my foo: " + myMapFoo + ", equal: " + realMapFoo.equals(myMapFoo));
        System.out.println("real bar: " + realMapBar + ", my bar: " + myMapBar + ", equal: " + realMapBar.equals(myMapBar));

    }
}
