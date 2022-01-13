package ExceptionHandling;

import java.util.concurrent.ExecutionException;

/**
 * If an exception is arised in a function if it is not handled in that method
 * Then, it gets flown to the method aclling it and so on until it reaches the main method
 * After which it goes to the JVM where a in-built exception handler will be there which will crash the program
 * 
 * throws==> keyword is used to specify the method which tend to throw an error
 * throw==> keyword is used to throw exception when needed 
 */


class ExceptionFlow{

    static void meth2(){
        int a = meth3(10,0);//Exception will be flown to here where again it's not handled and again will get passed to the caller(main)
        System.out.println(a);
    }

    static int meth3(int i, int j) {
        int c= i/j;//Throws an exception here but as it is not he=andled in this method it will flow to meth2()
        return c;
    }

    public static void main(String[] args) {
        meth2();    //at last the exception will flow to here and if not handled flow to jvm
    }
}




public class ThrowThrows {
    public static void main(String[] args) throws NegativeDimensionException {
        // try{
        //     meth4();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        //It can alos pass the exception to jvm where the code will crash
    }

     static void meth4() throws NegativeDimensionException {
         //Now the xception flow reaches here 
         //It has two options: a) handle here, b) throw onto next caller

        //  a)
        //  try{
        //  int a= area(4,-5);
        //  System.out.println(a);
        //  }
        //  catch(Exception e){
        //      System.out.println(e);
        //  }

        // b)
        // It can again pass the exception to next caller
        int a= area(10, -1);
        // System.out.println(9); code wont reach here
    }

     static int area(int l, int b) throws NegativeDimensionException {
        //Now by logic if any of length or breadth is negative we have to tell the user to give the value again, so here we have to make an exception of our own
        if(l<0 || b<0){
            // try{
            // throw new NegativeDimensionException();//This will be trated as a checked exception by compiler and it must be handled through the method flow
            // }
            // catch(Exception e){
            //     System.out.println(e);
            // }
            //if we decide not to handle the exception here we have to throw the exception from this method to the caller method
            throw new NegativeDimensionException();
        }
        return l*b;
    }
}


//Declared new exception 

//New Exception syntax
class NegativeDimensionException extends Exception{

    @Override
    public String toString(){
        return "Negative Dimension is not allowed, please type again";
    }
}
