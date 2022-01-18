
// import java.lang.*; is imported during all the programs
//We are going to learn some classes in this package


//Object class is the parent class for all the classes in java
public class ObjectClass {
    public static void main(String[] args) {
        Object o1= new Object();
        System.out.println(o1.toString());
        //Even if we write just the object name it will acall the toString() inside print function
        // Object o2= new Object();
        Object o2=o1;

        System.out.println(o1.equals(o2));//checks whether o1 and o2 refers to a same object
        String s1= "Akash";
        String s2= "Akash";
        String s3= new String("Akash");
        String s4= new String("Akash");
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals(s3)); also give true

        System.out.println(o1.hashCode());//Given using the internal address of an object, unique for all objects
    }
}


//To override Object class methods
class MyObject{
    public String toString(){
        return "My Object";
    }

    public int hashCode(){
        return 100;
    }

    public boolean equals(Object o){//Now two objects will be compared based on their hashcode
        return this.hashCode()==o.hashCode();
    }

    // public void wait(){

    // }//Final method can't be overrided
}

class MyObject2 extends MyObject{//Though it is extending only from MyObject class as MyObject class is by default extends from Object it will also extend from Object
    //Al classes directly or indirectly extends from Object class

}


class MyObjectUse{
    public static void main(String[] args) {
        MyObject obj1= new MyObject();
        MyObject obj2= new MyObject();

        
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.equals(obj2));
    }
}
