import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUse {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq= new PriorityQueue<>();//by default the priority queue has comparator, which gives less value more priority  

        PriorityQueue<Integer> pq= new PriorityQueue<>(new MyComp());//works according to MyComp()
        pq.add(10);
        pq.add(20);
        pq.add(40);
        pq.add(30);

        System.out.println(pq.peek());
        pq.remove();
        pq.remove();
        System.out.println(pq.peek());
        pq.offer(5);
        pq.offer(15);

        pq.forEach((n)->System.out.println(n));
    }
}

//TO change the comparaator
class MyComp implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }//change to max pq i.e maximum element gets max priority
}
