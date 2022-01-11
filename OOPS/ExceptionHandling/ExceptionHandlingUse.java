package ExceptionHandling;

/**
 * Exception Handling can be done by three methods if there is more than one exception:
 * 1. Multiple catch blocks if there is a possibility of multiple exceptions
 * 2. Nested try-catch blocks
 * 3. Finally block
 */

class MultipleCatch{

    public MultipleCatch(){
        try{
            int A[]= {10,0,5,8,3};
            int r= A[0]/A[1];
            System.out.println(r);//ArithmeticException (Dividing by zero)
            System.out.println(A[10]);//Array Index out of bound exception
        }
        catch(ArithmeticException e){//catch block to handle Arithmetic exception
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){//catch block to handle ArrayIndex out of bound exception
            System.out.println(e);
        }
        //If there is any possiblity that the catch blocks have any hierarchy between them, then the
        //catch block coming first must be the sub-class in the hierarchy
    }
}

class NestedTry_Catch{
    
    public NestedTry_Catch(){

        try{
            int A[]= {10,8,5,0,3};

            try{
                int r= A[0]/A[3];
                System.out.println(r);
            }
            catch(ArithmeticException e){//catch block to resolve Arithmetic exception
                System.out.println(e);
            }
            System.out.println(A[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){//catch block to handle Array index out of Bound exception
            System.out.println(e);
        }
    }
}

class Try_Catch_Finally{
    public Try_Catch_Finally(){

    try{
        int A[]= {10,0,5,8,3};
        int r= A[0]/A[1];
        System.out.println(r);//ArithmeticException (Dividing by zero)
        System.out.println(A[10]);//Array Index out of bound exception
    }
    catch(ArithmeticException e){//catch block to handle Arithmetic exception
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e){//catch block to handle ArrayIndex out of bound exception
        System.out.println(e);
    } finally{
        System.out.println("Program finished");//Irrespective of try-catch block finally block will always get executed, it is mainly used for clean-up
    }
}
}
   

public class ExceptionHandlingUse {
    public static void main(String[] args) {
        
        MultipleCatch m= new MultipleCatch();
        NestedTry_Catch n= new NestedTry_Catch();
        Try_Catch_Finally tc= new Try_Catch_Finally();

    }    
}
