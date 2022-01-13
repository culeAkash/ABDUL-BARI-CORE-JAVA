package ExceptionHandling;

/*
 Exception class is java is the mother class of all the exception classes
 String getmessage() is a method in Exception class which gives info about the Exceptionwhen called
 String toString() also does the same but it gets called only by system.out.print(e) too
 void printStackTrace() gives the stack all flow after the exception is raised
*/



public class ExceptionClassUse {
    public static void main(String[] args) {
        meth1();
    }    

    public static void meth1(){
        int c= meth2(5,0);
        System.out.println(c);
    }

    private static  int meth2(int a, int b) {
        int c=1;;
        try{
         c=a/b;//here the compiler will throw an exception at run time 
        
        }//now if it doesn't throw en exception then ok but if it does the flow will go to the catch block

        // catch(Exception e){
        //     System.out.println(e);
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }//Now this is an unreachable catch block as all the exceptions will get handled by the Exception method in the first catch block
        //Hence the last catch block must be the parent class always



        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //As ArithmeticException is a sub-class of Exception it works fine
        return c;
    }
}
