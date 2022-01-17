

/**
 * Thread class is the original class which has the mechanism to execute multithreading
 * If the class we created not extending any other class we can directly extend Thread class to execute multithreading
 */


 //Multithreading in twoo different classes

 //Thread class
 class MyThread extends Thread{

    //After extending from thread class we have to overwrite the run() method

    //Thr program we want to run in a new thread is to be written in the run()
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
 }

 //Main class
 class MyThreadUse{
     public static void main(String[] args) {
         // We have a create an object of the thread class and as MyThread extends thread class we will create its object and hence use the over written method

         MyThread t= new MyThread();
         t.start();//To start the new thread, internally it calls the run() method in a new thread
         int i=1;
         while(true){
             System.out.println(i+" World");
             i++;
         }
         //Both the run and remaining main() runs simultaneously
         //run() in the new thread and main() in the main thread
         //The cpu willl run each program for some time and the run the other but so fast that they feel like simultaneouos
     }
 }



//Muktithreading in single class

public class ThreadClassUse extends Thread {

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }

     public static void main(String[] args) {
        ThreadClassUse t= new ThreadClassUse();
        t.start();//To start the new thread, internally it calls the run() method in a new thread
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
    }
}

    

    
}
