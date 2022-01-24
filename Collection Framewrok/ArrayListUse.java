import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>(20);
        //Initial capacity will become 20,and only stores Integer typr objects
        ArrayList<Integer> al2= new ArrayList<>();


        
        
        System.out.println(al1);

        System.out.println(al1.get(1));//get element at indesx 1
        System.out.println(al1.indexOf(5));//get index of 5
        System.out.println(al1.lastIndexOf(5));//get index of 5 from end
        al1.retainAll(al2);//remove all elements expect elements present in al2
        System.out.println(al1);
        al1.set(0, 20);al1.add(10);
        al1.add(0,5);
        al2.add(6);
        al1.addAll(al2);
        System.out.println(al1);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        //Iteration through ArrayLists
        //Method 1
        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+" ");
        }
        System.out.println();
        //Method 2
        for(var elem:al1){
            System.out.print(elem+" ");
        }//we can use var here too

        //Method 3
        //Using iterator
        Iterator<Integer> it= al1.iterator();
        //it is holding a reference on first element now
        while(it.hasNext()){
            System.out.print(it.next());//get present elem and then move to next elem 
        }

        ListIterator<Integer> lit= al1.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
            // System.out.print(lit.previous());It is birectional and indexed Iterator
        }

        //method 4
        for(it=al1.iterator();it.hasNext();){
            System.out.print(it.next()+" ");
        }

        //method 5
        al1.forEach((n)->show(n));//for each n show() is called
        //n=> each element in the Arraylist
    }

    static void show(int n){
        if(n<40){
            System.out.print(n+" ");
        }
    }

}
