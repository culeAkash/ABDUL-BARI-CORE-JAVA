import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;

// /Now the source of data is array, which is made of bytes

public class ByteStreamAndCharArray {
    public static void main(String[] args) throws Exception {
        char[] bit= {'a','b','c','d','e','f','g','h','i','j'};
        byte[] b= {'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis= new ByteArrayInputStream(b);//putting the array into the stream

        String str= new String(bis.readAllBytes());
        System.out.println(bis.markSupported());//marker is suppoeerted here

        CharArrayReader car= new CharArrayReader(bit);
        int y;
        while((y=car.read())!=-1){
            System.out.print((char)y);
        }
        System.out.println();

        // int x;
        // while((x=bis.read())!=-1){
        //     System.out.print((char)x);
        // }
        bis.close();

        ByteArrayOutputStream bos= new ByteArrayOutputStream(20);//give length of the stream
        bos.write('a');
        bos.write('b');
        bos.write('c');
        
            //To write in external file
            bos.writeTo(new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Test.txt"));

        byte[] byt= bos.toByteArray();
        for(byte by:byt){
            System.out.print((char)by);
        }
    }
}
