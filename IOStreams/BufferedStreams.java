import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

//Buffered Streams dont connect to the source directly, it gets attached to a stream and through which it transmits data with co-ordination between source and destination

public class BufferedStreams {
    public static void main(String[] args) throws Exception {
        //BufferedInputStream
        FileReader fis= new FileReader("D:/Core Java/CORE JAVA/IOStreams/Test.txt");

        // BufferedInputStream bis= new BufferedInputStream(fis);//bis is connected to fis
        BufferedReader bis= new BufferedReader(fis);

        //BufferedInputStream and BufferedReader are same, but if we have characters we can use BufferedReader


        System.out.println("file "+fis.markSupported());
        // System.out.println("Buffer "+bis.markSupported());



        //Implementing mark
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);//It will mark from the letter r
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();//restart from letter r
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        // System.out.println("String: "+bis.readLine());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println("String: "+bis.readLine());//reads line from the input








        // int x;
        // while((x=bis.read())!=-1){
        //     System.out.print((char)x);
        // }

    }
}
