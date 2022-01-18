
//Two ways to execute Synchronization
class MyData {

   synchronized public void display(String str) {

        // synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        // }
    }

}
//We can either write the critical section inside the synchronixed block
//We can declare the whole method as synchrom=nized to execute synchronization

class MyThread1 extends Thread {// to execute multithreading
    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    public void run() {// ovverrided method to perform multithreading
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {

    MyData d;

    public MyThread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("World");
    }
}

public class Monitor {
    public static void main(String[] args) {
        MyData d = new MyData();// same object is passed to both the threads to use, making it a shared object
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
        // As both the threads access the display() simultaneously mixup will happen if
        // not synchronized

        // to avoid this problem we must allow one thread to finish it function and then
        // next thread must be allowed to use the resource

        // Synchrom=nization must be used to achieve this
    }
}
