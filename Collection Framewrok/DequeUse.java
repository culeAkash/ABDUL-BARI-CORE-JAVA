import java.util.ArrayDeque;

public class DequeUse {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        //Deque is a data structure in which we can add or delete data from the first and last both

        dq.offerLast(10);//Adding to the rear
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.forEach((x)->System.out.print(x+" "));

        dq.offerFirst(1);
        dq.offerFirst(2);//adding to first
        dq.offerFirst(3);
        dq.offerFirst(4);

        // 4-3-2-1-10-20-30-40
        //All elemnts are inserted in constant time

        //Using as stack
        dq.offerLast(10);
        dq.pollLast();

        //Using as Queue
        dq.offerLast(20);
        dq.pollFirst();


        
    }
}
