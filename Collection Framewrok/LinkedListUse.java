import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<Integer> ll1= new LinkedList<>();
        //Linked List has variable size, and in collections framework a doubly linked list used

        LinkedList<Integer> ll2= new LinkedList<>();

        //All methods present in arraylist is alo here in linked list,as they are implementing the same interface

        System.out.println(ll1);

        System.out.println(ll1.get(1));//get element at indesx 1
        System.out.println(ll1.indexOf(5));//get index of 5
        System.out.println(ll1.lastIndexOf(5));//get index of 5 from end
        ll1.retainAll(ll2);//remove all elements expect elements present in ll2
        System.out.println(ll1);
        ll1.set(0, 20);ll1.add(10);
        ll1.add(0,5);
        ll2.add(6);
        ll1.addAll(ll2);
        System.out.println(ll1);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);

        //Iteration through ArrayLists
        //Method 1
        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i)+" ");
        }
        System.out.println();
        //Method 2
        for(var elem:ll1){
            System.out.print(elem+" ");
        }//we can use var here too

        //Method 3
        //Using iterator
        Iterator<Integer> it= ll1.iterator();
        //it is holding a reference on first element now
        while(it.hasNext()){
            System.out.print(it.next());//get present elem and then move to next elem 
        }

        ListIterator<Integer> lit= ll1.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
            // System.out.print(lit.previous());It is birectional and indexed Iterator
        }

        //method 4
        for(it=ll1.iterator();it.hasNext();){
            System.out.print(it.next()+" ");
        }


        //extramethods
        ll1.addFirst(30);//adding at the front
        ll1.addLast(50);//adding at the back
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.peek());//same function as getFirst()
        //In addition to ArrayList, Linked List has functionalities to perform operations at first and last place directly as it is a doubly linked list

    }
}
