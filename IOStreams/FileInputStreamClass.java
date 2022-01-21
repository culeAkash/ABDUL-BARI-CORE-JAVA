import java.io.FileInputStream;

public class FileInputStreamClass {
    public static void main(String[] args) throws Exception  {
        
        //Using try with resources
        try(FileInputStream fis= new FileInputStream("D:/Core Java/CORE JAVA/IOStreams/Test.txt")){

        //     byte[] b= new byte[fis.available()];//created byte array equal to the number of bytes presnt in the file
            
        //     fis.read(b);//from file it is tored in byte array

        //     String str= new String(b);//byte array converted to string
        //     System.out.println(str);
        // }

        //other method
        int x;
        // do{
        //     x=fis.read();
        //     if(x!=-1){
        //     System.out.print((char)x);
        //     }
        // }
        // while(x!=-1);

        while((x=fis.read())!=-1){
            System.out.print((char)x);
        }
    }

}
}
