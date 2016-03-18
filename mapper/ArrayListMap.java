package mapper;
import java.util.*;

// - create a new class, named ArrayListMap.
// - the class takes two type variables, named K and V,
//   for the type of the Map's keys and values, respectively
// - the class implements the Map interface
public class ArrayListMap<K, V> implements Map<K, V> {
    // - define a variable inside our class, named internalList.
    // - the list stores objects of type Map.Entry<K, V>. this is the same
    //   K and V that are the type arguments to our ArrayListMap
    private ArrayList<Map.Entry<K, V>> internalList;

    // - the constructor for our ArrayListMap. this is the code that gets run when
    //   doing new ArrayListMap() in HashMapRunner
    public ArrayListMap() {
        this.internalList = new ArrayList<Map.Entry<K, V>>();
    }

    public V get(Object key) {
        // loop through this.internalList. check every Map.Entry object to see if the
        // entry's Key matches the key argument we got passed
        return null;
    }


    public V put(K key, V value) {
        // create a new Map.Entry. this is the little container that doesnt do anything
        // but store a key and a value together
        Map.Entry<K, V> entry = new AbstractMap.SimpleEntry<K, V>(key, value);

        // stick the entry at the end of the list
        return null;
    }

    public void clear() {
        return;

    }

    public boolean containsKey(Object key) {
        return true;

    }

    public boolean containsValue(Object value) {
        return true;

    }

    public Set<Map.Entry<K, V>> entrySet() {
        return null;

    }

    public boolean equals(Object o) {
        return true;

    }

    public int hashCode() {
        return 0;

    }

    public boolean isEmpty() {
        return true;

    }

    public Set<K> keySet() {
        return null;

    }

    public void putAll(Map<? extends K,? extends V> m) {
        return;

    }

    public V remove(Object key) {
        return null;

    }

    public int size() {
        return 1;

    }

    public Collection<V> values() {
        return null;

    }


}
