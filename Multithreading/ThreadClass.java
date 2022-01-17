

class MyRun implements Runnable{
    public void run(){}
}

class MyThreadNew extends Thread{
     public MyThreadNew(String name){
         super(name);
         setPriority(MAX_PRIORITY);
     }//To give the name to the Thread class

    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +" MyThread");
            //it is really fast we can delay it by using sleep method
            try{
                 Thread.sleep(1000);//This will put the thread to sleep for 1000 milisecond and then run for ome time and then again for 1000 miliseconds
                 //It throws Interrupted Exception that must be catched
             }
             catch(InterruptedException e){
                 System.out.println(e);
                 //As we interrpted the thread from main thread during sleep it catched the Interrupt Exception, we called it one time only
             }
            
        }
    }
}



public class ThreadClass {
    public static void main(String[] args) throws Exception {
        // Thread t= new Thread();//Constructor to create a new thread
        // Thread t= new Thread(new MyRun(),"Run");//constructor with runnable object and thread name

        MyThreadNew t= new MyThreadNew("My Thread 1");

        // t.setDaemon(true);//when main methods terminates daemon thread also gets terminated executed or not



        //Methods of Thread Class
       System.out.println("ID "+ t.getId());//id given my jvm
       System.out.println("Name "+t.getName());
       System.out.println("priority "+t.getPriority());//gets priority
       System.out.println("State "+t.getState());
       t.start();
       System.out.println("State "+t.getState());//Before calling start it was new now it is runnable state
       System.out.println("Alive "+t.isAlive());//To see if the thread is alive or not

       t.interrupt();//This will cause an interruption to the thread

       //the main thread has limit functionalities in it but the other thread has infinite loop, so main thread gets executed before it, but doesn't goes to termination as it waits for the other thread to end

        Thread mainThread= Thread.currentThread();//To get the current thread
         mainThread.join();//Now though the other thread is daemon thread it will also wait for that thread

        int count=1;
        while(true){
            System.out.println(count++ +" Main");
            Thread.yield();//Gives more time to other threads
        }


    }
}
