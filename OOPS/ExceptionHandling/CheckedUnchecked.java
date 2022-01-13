package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//Checked Exceptions ar xceptions that are needed to be handled at compile time, it forces the programmer to handle the error at once
//Unchecked exceptions are exceptions that arise in run time and the compiler never forces to handle the exception at compile time 


public class CheckedUnchecked{
    static void fun1(){
        // System.out.println(10/0);//at this line an exception will be arised
        // System.out.println("Hi");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }//We can handle the exception to avoid runtime error
        System.out.println("Hi");
    } 

    static void fun4(){
        // FileOutputStream fi= new FileOutputStream("t.txt");
        //This will give a compile time error as there is a possibility that th file mentioned is not in the system or at the given location
        //The compiler will force to handle this exception right here

        try{
            FileInputStream fi= new FileInputStream("t.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    static void fun2(){
        fun4();
    }

    static void fun3(){
        fun2();
    }

    public static void main(String[] args){
        fun2();
    }
}