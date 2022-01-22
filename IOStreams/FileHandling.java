import java.io.File;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f= new File("D:/Core Java/CORE JAVA/IOStreams");//reference to the folder 

        String[] list=f.list();//returns names of files inside the reference f as String aaray
        
        for(String str:list){
            System.out.println(str);
        }

        File[] files= f.listFiles();//returns files []
        for(File file:files){
              System.out.print("name: "+file.getName());
              System.out.println("path: "+file.getPath());
        }

        File fi= new File("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        // fi.setReadOnly();//As we have set this file to read only we cant put any new data to it
        fi.setWritable(true);//now we can write in it
        FileOutputStream fos= new FileOutputStream("D:/Core Java/CORE JAVA/IOStreams/Data.txt");
        System.out.println(fi.lastModified());//to get last modified time
        System.out.println(fi.isFile());//to check if it is file
        System.out.println(fi.isDirectory());
        System.out.println(fi.isHidden());
        fos.close();

    }
}
