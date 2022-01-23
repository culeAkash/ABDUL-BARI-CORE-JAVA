package Generics;

import java.util.ArrayList;

public class GenericMethods {

    //generic method
    public static <T extends Number> void show(T[] list){
        for(T x:list){
            System.out.println(x);
        }
    }

    //We can give parameters as generics too
    //<?> => Unbounded wildcard all data types are allowed
    //<? extends Number> ==> Allowes all classes inheriting from Number, cant use Alphabet inside <> so using wildcard
    //<? super class_name> ==> can use class_name class and its super classes

    static void fun(MyArray<? extends A> obj){
        obj.display();
    }

    public static void main(String[] args) {
        // show(new String[]{"hi","go","bye"});Now will give error as only classes inheriting from Number is allowed
        show(new Integer[]{10,20,30});

        MyArray<Integer> ma=new MyArray<>();
        ma.append(10);
        ma.append(20);

        MyArray<B> ma1= new MyArray<>();
        MyArray<C> ma2= new MyArray<>();
        fun(ma1);
        fun(ma2);
        

    }
}


//Wildcards

class MyArray<T>{
    ArrayList<T> arr= new ArrayList<>();
    // private T arr[]= (T[]) new Object[10];
    private int length=0;

    public void append(T val){
        arr.add(val);
        length++;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(arr.get(i)+" ");
        }
    }

}

class A{}
class B extends A{}
class C extends B{}