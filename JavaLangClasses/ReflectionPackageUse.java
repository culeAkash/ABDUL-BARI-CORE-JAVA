import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

// reflection package is used to get the properties of a class
class My{
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}

    public My(int x,int y){}

    public void display(String s1,String s2){}
    public int show(int x,int y){return 0;}
}

public class ReflectionPackageUse {
    public static void main(String[] args) {
        Class c= My.class;//to get info about a class
        //alternative method
        My m= new My();
        c= m.getClass();//info from object

        System.out.println(c.getName());//get name of the class

        Field field[]= c.getDeclaredFields();//give all the fields in c into an array

        Constructor con[]= c.getConstructors();//to get all the constructors of a class

        Method mt[]= c.getMethods();

        for(Method met:mt){
            System.out.println(met);//give local class methods and also the methods of parent classes
        }

        for(Constructor ct:con){
            System.out.println(ct);
        }

        for(Field f:field){
            System.out.println(f);
        }

        //to get parameters inside a method
        Parameter param[]= mt[0].getParameters();
        for(Parameter p:param){
            System.out.println(p);
        }
    }
}
