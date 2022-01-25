import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapsUse {
    //Maps are data structures which store key-value pairs
}

class TreeMapUse{
    public static void main(String[] args) {
        //It is implemented using Red-Black Tree and provides guaranteed logn time cost for basic functionalities

        //Treemap always store in sorted key values
        TreeMap<Integer,String> tm= new TreeMap<>(Map.of(0, "A",1,"B",3,"C"));
        //keys are integers and values are strings


        tm.put(5, "Aka");
        tm.put(4, "Akash");
        
        System.out.println(tm.ceilingEntry(1).getValue());
        //ceilingEntry() gives the key-value pair of the key the very greater than the key given as argument
        System.out.println(tm.get(4));

        Entry<Integer,String> e=tm.firstEntry();//gets the first entry of the map
        System.out.println(e.getValue());

        System.out.println(tm);
    }
}

class HashMapUse{
    public static void main(String[] args) {
        
        //In HashMap the entries are not sorted and it takes O(1) time for all operations, it is a map implemented usinh hashing

        HashMap<Integer,String> hm= new HashMap<>(Map.of(0, "Akash", 1, "Kuki", 2, "Amit"));

        hm.put(6, "Danish");
        hm.put(5, "Akarsh");
        System.out.println(hm);
    }
}

class LinkedHashMapUse{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }//to restrict size and implement lru,deletes the least recently used entry
        };//true=> sort in aceess time
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(6, "F");
        lhm.put(5, "E");//no sorting
        String s= lhm.get(2);
        s=lhm.get(4);

        

        lhm.forEach((k,v)->System.out.println(k+" "+v));
    }
}
