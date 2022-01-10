package AccessModifiers.Access2;

import AccessModifiers.Access1.P1;

public class Q1 {
    


    // public static void main(String[] args) {
    //     P1 p= new P1();
    //     p.x; 
    // }
    //No properties of P1 can be accessed in this class as none of them are public and this class is not extending from P1
}

 class Q2 extends P1{
    
    }
    
class Test{
    public static void main(String[] args) {
       
        
    }
}
