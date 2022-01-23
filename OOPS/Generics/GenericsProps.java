package Generics;

import java.util.ArrayList;

public class GenericsProps {
    public static void main(String[] args) {
        MyArray ma= new MyArray<>();//If we don't specify the data type it will put it as Object
        // ArrayList<Object> 

        ma.append("Hi");
        ma.append(90);
        ma.display();

        Pair<Integer,String> p= new Pair<>(10, "Akash");
        p.display();
    }
}

class Pair<T,E>{
    private T first;
    private E second;

    Pair(T first,E second){
        this.first=first;
        this.second=second;
    }

    Pair(){}

    void display(){
        System.out.println("First: "+first+"  "+"Second: "+second);
    }

    number<Float> n= new number<>();
    number<Integer> n1= new number<>();
    // number<String> n2= new number<>();  Error as String doesn't inherit from Number class

}

//if we extend a generic class we should declare that class as generic too
class Pair2<T,E> extends Pair<T,E>{

}

//Now it will allow all the classes that are inheriting from Number class
//for interfaces all extends keyword is used in generic param
class number<T extends Number>{
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data=data;
    }
}


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