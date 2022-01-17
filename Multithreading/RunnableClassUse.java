
/**
 * We can aslo implement multithreading using Runnable Interface
 * If our class already extending from a class then we can implement multithreading using Runnable Interface bcoz we cant extend more than one class from a class
 */


//multithreading with methods in different classes
class MyRunnable implements Runnable{
    //The interface runnable only has one abstract method run() to implement
    //the program to be performed in a different thread must be written in the run()

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

class MyRunnableUse{
    public static void main(String[] args) {
        
        //A thread can only run on a Thread Class Object but we can attach the runnable object
        //Spo that the runnable object will also run along the Thread object
        MyRunnable r= new MyRunnable();
        Thread t= new Thread(r);//attached the runnable object to thread object
        t.start();//creates a new thread and executes the run() in that thread
        int i=1;//This will be kept xecuting in the mainn thread without obstructions
        while(true){
            System.out.println(i+" World");
            i++;
        } 
    }
}


//inside sane class
public class RunnableClassUse implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableClassUse r= new RunnableClassUse();
        Thread t= new Thread(r);//attached the runnable object to thread object
        t.start();//creates a new thread and executes the run() in that thread
        int i=1;//This will be kept xecuting in the mainn thread without obstructions
        while(true){
            System.out.println(i+" World");
            i++;
        } 
    }
}
