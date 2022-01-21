import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        try{

        FileOutputStream fos= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Test.txt");//created new file

        String str= "Learn Java Programming";
        try{
        // fos.write(str.getBytes());
        //other method
        byte[] b= str.getBytes();
        for(byte by:b){
            fos.write(by);
        }
        //if we want java programming only
        fos.write(b,6,str.length()-6);
        fos.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }


}
}
