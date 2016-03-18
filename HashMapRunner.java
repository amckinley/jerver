import mapper.ArrayListMap;
import java.util.*;

public class HashMapRunner {
    public static void main(String[] args) {
        // our map
        ArrayListMap<String, Integer> myMap = new ArrayListMap<String, Integer>();

        myMap.put("foo", 4);
        myMap.put("bar", 42);

        // a real java map
        HashMap<String, Integer> realMap = new HashMap<String, Integer>();
        realMap.put("foo", 4);
        realMap.put("bar", 42);

        // TESTS FOR GET()
        Integer myMapFoo = myMap.get("foo");
        Integer realMapFoo = realMap.get("foo");

        Integer myMapBar = myMap.get("bar");
        Integer realMapBar = realMap.get("bar");

        System.out.println("real foo: " + realMapFoo + ", my foo: " + myMapFoo + ", equal: " + realMapFoo.equals(myMapFoo));
        System.out.println("real bar: " + realMapBar + ", my bar: " + myMapBar + ", equal: " + realMapBar.equals(myMapBar));

        // TESTS FOR CONTAINSKEY()
        Boolean myMapContains = myMap.containsKey("foo");
        Boolean myMapNotContains = myMap.containsKey("not");
        Boolean realMapContains = realMap.containsKey("foo");
        Boolean realMapNotContains = realMap.containsKey("not");

        System.out.println(myMapContains + ", " + myMapNotContains + ", " + realMapContains + ", " + realMapNotContains);

        // TESTS FOR UPDATES
        myMap.put("foo", 21);
        realMap.put("foo", 21);

        myMapFoo = myMap.get("foo");
        realMapFoo = realMap.get("foo");

        System.out.println("real was: " + realMapFoo + ", mine was: " + myMapFoo +  ", equal: " + realMapFoo.equals(myMapFoo));

    }
}
