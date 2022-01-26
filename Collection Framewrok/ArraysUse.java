import java.util.Arrays;
import java.util.Comparator;

public class ArraysUse {
    public static void main(String[] args) {
        
        Integer[] a= {1,2,3,4,5,6,7,8};
        Integer[] b= {1,8,5,4,3,2,7,6};

        System.out.println(Arrays.compare(a, b));//if both are same then zero,if a is inferior then -1 and else +1

        //If the lengths are same then it compares on the values starting from thr index 0

        Integer c[]=Arrays.copyOf(b,b.length);//gives copy of elements of array a and length will be 4

        // Arrays.fill(c, 10);//fills entrie array with same value
        Arrays.sort(a,new MyCom());//sort using quick  sort
        
        System.out.println(Arrays.binarySearch(c, 2));//array and the value to be searched is given to a sorted array
        for(int x:a){
            System.out.println(x);
        }
    }
} 


//Now it sorted in desc order
class MyCom implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1<i2){
            return 1;
        }
        if(i1>i2){
            return -1;
        }
        return 0;
    }
}
