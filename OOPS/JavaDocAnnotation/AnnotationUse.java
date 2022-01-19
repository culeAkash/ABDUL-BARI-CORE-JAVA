package JavaDocAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotations are used to get info about a class
//two types of built-in annotations: 1.Applied to code(have effect on code)
//2. Applies to other annotations

public class AnnotationUse {
    // @SuppressWarnings("deprecation")//to supress warnings
    public static void main(String[] args) {
        // OldClass o1= new OldClass();
        // o1.show();
    }
}

abstract class Parent{
    abstract public void display();
}

class Child extends Parent{

    @Override//to show that i am overriding a method
    public void display(){}
} 

@FunctionalInterface//to show thta it can perform functions as this interface has one method only
interface OldClass{
    public void display();

    // @Deprecated//suggesting a programmer not to use it
    // public void show(){
    //     System.out.println("hi");
    // }
}

// @Retention(RetentionPolicy.CLASS)//now this annotation will be there in class file too
// @Documented //give info about in java docs too
// @Target//to mention the elements where it can be used
// @Repeatable//annotation can be used multiple times
@interface MyAnno{
    String name();
    String project();
    String date() default "today";
}//user-defined annotation


@MyAnno(name="Akash",project="Java Core")
class AnnoDemo{
    int data;

    public static void main(String[] args) {
        int x;
    }
}

//Other built-in annotations are:
//1. retention
//2. Documented
//3. Target
//4. inherited
//5. Repeatable