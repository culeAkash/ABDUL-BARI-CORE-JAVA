

/**
 * Wrapper class hierarchy=>
 * Object:
 *      =>Number:
 *              =>Byte
 *              =>Short
 *              =>Integer
 *              =>long
 *              =>Float
 *              =>Double
 *      =>Character
 *      =>Boolean    
 */




public class WrapperClasses {
    public static void main(String[] args) {
        // int i=10;
        //this is a primitive(in-built) data type and not an object
        // i. can't be used to call any methods, so to use it as an object wrapper classes for all primitives are there in Java.lang package

        // Integer i= new Integer(10);//Deprecated method
        Integer i=  Integer.valueOf(10);
        Integer j=10;

        Byte b= 15;
        Byte c= Byte.valueOf("15");
        // Byte bb=15;
        // Byte d= Byte.valueOf(bb);

        Short e= Short.valueOf("123");

        Float g=12.3f;//directly assigning also uses valueOf()
        Float h= Float.valueOf("123.5");
        
        Double k= Double.valueOf("1.2");

        Character l= Character.valueOf('A');

        Boolean m= Boolean.valueOf("true");
        System.out.println(m);


        byte bb=15;//This is a primitive data type
        Byte d= Byte.valueOf(bb);//d is a wrapper to the primitive bb type and convert it o an object
        //this is called boxing


        float x=h.floatValue();//It converts Object h to primitve x, its called unboxing
        float y=h;//It also calls the floatValue() to set the object as primitive,it is auto unboxing

        int p=10;
        Integer q= Integer.valueOf(p);//boxing
        Integer r=p;//Auto-boxing

        int s=q.intValue();//unboxing
        int t=q;//auto unboxing
        




    }
}


class IntegerWrapperUse{
    public static void main(String[] args) {
        int a=15;//primitive variable
        Integer b=a;//auto boxing
        Integer c=15;
        Integer d= Integer.valueOf(15);
        Integer e= Integer.valueOf(15);
        System.out.println(d==e);

        System.out.println(b.equals(a));//We can use primitive to compare
        System.out.println(a==c);
        System.out.println(a==b);

        //static methods
        System.out.println(Integer.valueOf("123"));//converts String to Integer value
        Integer i= Integer.valueOf("1010", 2);//binary number conversion
        i=Integer.valueOf("A7",16);//hexadecimal
        System.out.println(i);

        Integer j= Integer.parseInt("135");//same as valueOf()
        System.out.println(j);
    }
}


class WrapperClassesUse{
    public static void main(String[] args) {
        
        float a= 12.4f;
        Float b=12.4f/0;

        System.out.println(b.isInfinite());//to check if the number is infinite or not
        System.out.println(b==Float.POSITIVE_INFINITY);
        System.out.println(b==Float.NEGATIVE_INFINITY);//if number is negative then it will give true

        b=(float)Math.sqrt(-1);
        // b= (float)Math.sqrt(9);
        System.out.println(b.isNaN());
        // System.out.println(b!=Float.NaN);Dont use this


        Character c= 'A';
        System.out.println(Character.toUpperCase('a'));
    }
}


class StringClassesUse {
    public static void main(String[] args) {
        String s1= new String("Hello");

        StringBuffer s2= new StringBuffer("Hello");
        StringBuilder s3= new StringBuilder("Hello");

        s1.concat(" World");//returns new string
        s2.append(" World");//same string get modified
        s3.append(" World");

        System.out.println(s1);//s1 not changes
        System.out.println(s2);
        System.out.println(s3);
    }
}