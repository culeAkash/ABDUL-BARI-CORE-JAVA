import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashingUse {
    public static void main(String[] args) {

    }
}

class HashSetUse {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20, 0.5f); // initial capacity and loading factor is declared
        // It is a Data Structure that won't allow duplicates and it is implemented
        // using Hashing

        hs.add(10);
        hs.add(20);
        hs.add(10);// 10 should be there only 1 time
        hs.add(30);

        hs.forEach(n -> System.out.println(n));
        hs.remove(10);
        hs.forEach(n -> System.out.println(n));
    }
}

class TreeSetUse {
    public static void main(String[] args) {
        // It is a set implemented using Tree, it provides guaranteed logn time for
        // baasic operations
        // Elements will be sorted in this data structure

        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 20, 30, 40, 10, 15, 5));

        ts.add(2);
        System.out.println(ts.ceiling(1));// gives the minimum number greater than or equal to the given number int the
                                          // TreeSet
        System.out.println(ts.higher(1));// gives number higher than the given element

        System.out.println(ts);// It will call the toString()

    }

}

class ComparableUse {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        // for sorting we have to tell the jvm how to compare two points using compareTo
        // implemented from Comparable interface,as Point is not a inbuilt data type so
        // it doesn;t know how to compare two Points
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));
        //Now this data will get sorted as per the compareTo()overrided method

        System.out.println(ts);
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x= " + x + " y= " + y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } 
        else {

            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            }
        }
        return 0;

    }
}
