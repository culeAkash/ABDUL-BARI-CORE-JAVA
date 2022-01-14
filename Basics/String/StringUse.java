
public class StringUse {
    
    public static void main(String[] args) {
        
        //String ia in-built class in java

        String str1= "Akash";
        String str2= "Akash";//If both are same string instead of creating a new literal the str2 again reference to the same string in pool
        //By this syntax we create string literals in the String pool and str1 an str2 reference to the same literal in the string pool

        System.out.println(str1);
        System.out.println(str2);

        // Method 2

        char c[]= {'A','K','A','S','H'};

        String str3= new String(c);
        System.out.println(str3);

        //Method 3
        byte [] b= {65,66,67,68};
        String str4= new String(b);
        System.out.println(str4);

        //Method 4
        String str5= new String("Akash");
        //by this method, a new object is constructed in heap and the literal "Akash" is created in String pool
        String str6= new String("Akash");
        //By this method an altogether new object is created in the heap even if both are same,although no new literal is created in the String pool
        if(str5==str6){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
