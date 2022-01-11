package ExceptionHandling;

/**
 * Exceptions are run time errors
 * They can be done by the user: 1. By bad input
 *                               2. Missing resources
 * We can guide the user to use the program properly when any runtime error is raised, this is called Exception Handling
 */

public class ExceptionIntro {
    public static void main(String[] args) {
        int a,b,c;
        // a=5;
        // b=0;
        // System.out.println(a);
        // c=a/b;//Upto here the program runs smoothly ad after and after this also the code should run fine
        // //TO make this happen we should use Exception Handling 
        // System.out.println(c);
        // System.out.println("Program ended");
        // // System.out.println("Bye!");
        try{
            a=5;
            b=2;
            // System.out.println("a");
            c=a/b;
            System.out.println("Result is "+c);
        }//First the code inside the try block is executed if there is any error then the compiler will jump to catch block
        //If no error in try blcok it will execute the try block and wont jump to catch block
        //In both the cases the the program will run after try-catch block without any interruption
        catch(ArithmeticException e){
            System.out.println("Divide by zero "+e);
        }
    }
}
