package DataStructure;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(123,432);
        ht.put(31, 21415);
        ht.put(14,1515);
        ht.put(2,221);

//        ht.remove(14);
        System.out.println(ht);
    }
}
