package ExceptionHandling;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Any data outside the calling stack is considered as resource
 * After using the resource, we must have to free the resource or else it will fill up the entire space
 * Heap is also a resource as all the objects are created inside the heap but its free-ness is handled by java in built garbage collector
 * But other resources must be handled manually 
 */




public class TryWithResources {
    
    public static void main(String[] args) throws Exception{
        meth1();
        try{
        meth2();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    static void meth2() throws Exception {
        // FileReader f= new FileReader("t.txt");
        FileReader f= new FileReader("ExceptionIntro.java");
        
        Scanner sc= new Scanner(System.in);
        try{
            int a= sc.nextInt();
            //file use
        int b= sc.nextInt();
        System.out.println(a/b);

        }
        finally{
            sc.close();
            f.close();
        }

        //New syntax
        //Try with resources
        // try(FileReader f= new FileReader("ExceptionIntro.java");Scanner sc= new Scanner(System.in)){
        //     int a= sc.nextInt();
        //     //file use
        // int b= sc.nextInt();
        // System.out.println(a/b);
        //by this the resources inside the try always get closeedbefore try's termination

        //Now exception or not the file will get closed because of the finally block
    }

    private static void meth1() throws Exception{
        FileReader f= new FileReader("file.txt");//It gives a checked exception so it must be handled here or this method must throw the exception to the caller method
        Scanner sc= new Scanner(System.in);

        //file use
        //Suppose here comes an exception and the flow will get returned to the caller method and the file memory never gets freed, so finally is used here with try block

        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a/b);
        f.close();
        sc.close();
    }
}
