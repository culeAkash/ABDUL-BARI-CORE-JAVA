package Generics;

import java.util.ArrayList;

public class GenericExamples {
    public static void main(String[] args) {
        Data<Integer> d= new Data<>();
        d.setData(10);//Only integer can be given as data

        System.out.println(d.getData());

        MyArray<Integer> ma= new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.display();
    }
}

class Data<T>{
   //We want to give data type as a parameter to this class so it can hold all data types but only one ata time, so we declare it as generic
   private T obj;
   
   T getData(){
       return this.obj;
   }

   void setData(T data){
       this.obj=data;
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