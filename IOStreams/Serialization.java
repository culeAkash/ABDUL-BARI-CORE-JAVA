import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;


 class PrintStreamDemo {
   public static void main(String[] args) throws Exception {
       FileOutputStream fis= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
       PrintStream ps= new PrintStream(fis);
       //print stream is used to print the dta into the file as Strings

       Student s= new Student();//Student object
       s.rollNo=1;
       s.name="Akash";
       s.dept="ECE";

       ps.println(s.rollNo);//writing the objectt's data into Data.txt
       ps.println(s.name);
       ps.println(s.dept);

    //    System.out=> This is nothing but PrintStream object and we call all the methods that are in PrintTream by this too
    ps.close();
    fis.close();

   } 
}

class MyRead{
    public static void main(String[] args) throws Exception{
        FileInputStream fis= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        BufferedReader br= new BufferedReader(new InputStreamReader(fis));

        Student s= new Student();
        s.rollNo=Integer.parseInt(br.readLine());//as rollNo is int type we have typecast it
        s.name=br.readLine();
        s.dept=br.readLine();//It reads the lines of files as strings

        //We want the data to be stored into the file with its data type not convrted to string so that we can access it later too by its own data type so we dont have to typecast it
        //For this serialization is used
        br.close();
        fis.close();

    }
}

class Student{
    int rollNo;
    String name;
    String dept;
    float avg;
}

class DataStreamsWrite{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        DataOutputStream dos= new DataOutputStream(fos);
        //It is used to store data in their respective data types

        Student s= new Student();
        s.rollNo=1;
        s.name="Akash";
        s.dept="ECE";
        s.avg=85.0f;

        dos.writeInt(s.rollNo);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);//to store in file in string data type
        dos.writeFloat(s.avg);
        //binary file is created
        dos.close();
        fos.close();
    }
}

class DataStreamRead{
    public static void main(String[] args) throws Exception {
        FileInputStream fis= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        DataInputStream dis= new DataInputStream(fis);

        //The order in which we have written the data in dataOUtputStream, we have to read the data in the same order by DataInputStream

        //data by Dos is stored in binary format and while retrieving changed to its respective data type
        Student s= new Student();
        s.rollNo= dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        s.avg= dis.readFloat();

        System.out.println(s.rollNo+" "+s.name+" "+s.dept+" "+s.avg);
        dis.close();
        fis.close();
    }//In this method we are writing data as their data types, but we have to write the object's all properties seperately, we want to store the object as whole, here comes in serialization
}

//Serialization: It is a process of storing the state of an onbect and retreiving the object taking care of all its properties

//Serialization is done Object Streams
public class Serialization{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);

        Student1 s=new Student1(1,"Akash",85.0f,"ECE");
        oos.writeObject(s);//writes the entire object to the file
        //This achieves serialization
        //writes in binary format
        oos.close(); 
        deSerialization();
    }

    private static void deSerialization() throws Exception {
        FileInputStream fis= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);

        // System.out.println(ois.readObject());
        Student1 s= (Student1)ois.readObject();
        System.out.println(s);
        ois.close();

    }
}

class Student1 implements Serializable{
    private int rolNo;
    private String name;
    private String dept;
    private float avg;
    public static int data=10;//to show that doesn't gets troed with the object
    public transient int t;

    //After serializing we cant change the class it has unique srial number and during de serialization if both serial numbers dont match it will give exception
    public Student1(){

    }
    public Student1(int r,String n,float a,String d){
        rolNo=r;
        name=n;
        avg=a;
        dept=d;
        data=500;
        t=500;
    }

    public String toString(){
        return "\nStudent Details:\n"+
               "\nRollNumber: "+rolNo+
               "\nName: "+name+
               "\nAverage: "+avg+
               "\nDept: "+dept+
               "\nDat: "+data+
               "\nTransient: "+t+"\n";
    }//If syso is called gives the Object in this formt
}