package LambdaExpressions;


/**
 * Lambda Expressions are used to implement functional interfaces, interfaces with only one methods without writing excess code and without implementing it in other class
 */



public class LambdaDemo {
    public static void main(String[] args) {
        //implementation without lambda expression
        // My m= new My();
        // m.display();

        //We can also implement the interface using anonymous class
        MyLambda m= new MyLambda() {
          public int display(int a,int b){
              System.out.println("Hello World");
              return 1;
          }  
        };//We didn't had to implement it in seperate class

        //Now by lambda expression
        // MyLambda ml= ()->{//As there is only one function in interface we dont have to give the name of function, creating ananonymous method only
        //     System.out.println("Hello World");
        // };
        // ml.display();

        //for parameterised
        MyLambda ml= (a,b)->{
            return a+b;
        };
        System.out.println(ml.display(20, 30));
    }
}

@FunctionalInterface
interface MyLambda{
    // public void display();
    //If it is a parameterised function
    public int display(int a,int b);
}

class My implements MyLambda{
    @Override
    public int display(int a,int b){
        System.out.println("Hello World");
        return 1;
    }
}
