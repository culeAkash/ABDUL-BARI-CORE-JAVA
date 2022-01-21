import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class StudentChallenge1 {
    public static void main(String[] args) throws Exception {
        
        FileOutputStream fos= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/t1.txt");
        FileOutputStream fos1= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/t2.txt");
        
        FileInputStream fis1= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/t1.txt");
        FileInputStream fis2= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/t2.txt");

        FileOutputStream fos2= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Dest.txt");

        
        

        SequenceInputStream sis= new SequenceInputStream(fis1,fis2);

        int by;
        while((by=sis.read())!=-1){
            fos2.write(by);
        }

        String str= "JAVA TEST FILE";
        fos.write(str.getBytes());

        // byte[] b= new byte[fis1.available()];
        // fis1.read(b);
        // String str1= new String(b);
        // str1= str1.toLowerCase();
        // fos1.write(str1.getBytes());

        fos.close();
        fos1.close();
        fis1.close();
        fis2.close();

    }
}
