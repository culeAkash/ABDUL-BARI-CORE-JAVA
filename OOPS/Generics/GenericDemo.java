package Generics;
public class GenericDemo <T>{
    T[] data;

    public static void main(String[] args) {
        //Before Generics, generalisation was achieved by Object class in java
        Object obj= new String("HI");
        //as object class is the parent class of all classes
        // obj=new Integer(19);
        String str=(String)obj; //we can't directly put the object into String we have to typecast it
        //Even so we took Intgere type it will not show error in compile time but will give error at run time

        //For array
        Object obj1[]= new Object[3];//Array of object type can store all data types
        //Now we want to store only String
        obj1[0]="Kuki";
        obj1[1]="Akash";
        obj1[2]=10;//We did mistake here but compiler wont give error

        for(int i=0;i<=2;i++){
            String str1= (String)obj1[i];//Here obj[2] is an integer,so can't be converted to string but it will show during runtime only
        }
        /**
         * Drawbacks:
         * No Type Safety=> Other data types can also get assigned without any error int Object[] as it can store all types of data to achieve generalisation
         * Typecasting=> During retrieving data we have to typecast
         * No compile time error=> Even if we put false data the compiler won't give error and throws error during run time only
         */

         //Generics
         GenericDemo<String> gd1= new GenericDemo<>();//decalred the array inside gd1 as string array now only string can be placed init
         gd1.data=new String[3];

         GenericDemo<Integer>gd2= new GenericDemo<>();
         gd2.data=new Integer[3];//Only integer type can be stored
         //type-safety is achieved

         gd1.data[0]="Hi";
        //  gd1.data[1]=1;//Gives error
        //Compile type checking

        String str2= gd1.data[0];//No typecasting
    }
}
