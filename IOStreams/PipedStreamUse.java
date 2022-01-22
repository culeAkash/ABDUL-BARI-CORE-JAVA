import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.RandomAccessFile;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream os){
        this.os=os;
    }

    public void run(){
        int count=1;
        while(true){
            try{
            os.write(count);
            System.out.flush();
            System.out.println("Producer: "+count);
            Thread.sleep(10);
            count++;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    } 
}

class Consumer extends Thread{
    InputStream is;

    public Consumer(InputStream is){

        this.is=is;
    }

    public void run(){
       int x;
       while(true){
           try{
               x=is.read();
               System.out.println("Consumer: "+x);
               System.out.flush();
               Thread.sleep(10);
           }
           catch(Exception e){
               System.out.println(e);
           }
       } 
    }
}



public class PipedStreamUse {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis= new PipedInputStream();
        PipedOutputStream pos= new PipedOutputStream();
        //These are piped input and output streams and are connected inside the main()

        pis.connect(pos);


        Producer p= new Producer(pos);
        Consumer c= new Consumer(pis);

        p.start();
        c.start();
    }
}

class RandomAccessDemo{
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf= new RandomAccessFile("D:/Core Java/CORE JAVA/IOStreams/Data.txt","rw" );//we opened the Data.txt file as a random access file and mode->rw i.e we want to perform both read and write with same pointer
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        //Now file pointer is on C
        rf.write('c');
        //Even after writing the file pointer moves after replacing C with c and thus next D will get printed
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        //Now it is at F
        rf.skipBytes(4);//skipped 4 bytes
        //Now at J
        System.out.println((char)rf.read());
        rf.seek(2);//Pointer goes to index 2 starting from 0
        //now it is  at c
        System.out.println((char)rf.read());
        //Now at D
        System.out.println(rf.getFilePointer());//get loacation of file pointer
        rf.seek(rf.getFilePointer()+2);
        //3+2=5, now it is on index 5 i.e at F
        System.out.println((char)rf.read());
        rf.close();

    }
}


