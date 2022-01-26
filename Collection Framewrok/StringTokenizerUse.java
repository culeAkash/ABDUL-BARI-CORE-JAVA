import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.StringTokenizer;

public class StringTokenizerUse {
    public static void main(String[] args) throws Exception {
        
        // String data= "Name=Akash Address=Kolkata Country=India Dept=CSE";

        //String tokenizer is used to seperate tokens in a string seperated by delimiters
        //\n is a inbuilt delimiter

        FileInputStream fis= new FileInputStream("D:/Core Java/CORE JAVA/Collection Framewrok/data.txt");
        byte[] b= new byte[fis.available()];

        fis.read(b);
        String data= new String(b);

        StringTokenizer stk= new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al= new ArrayList<>();

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}


class BitSetUse{
    public static void main(String[] args) {
        //BitSei is a class in java.util package which implements an array containing true and false only and allows to perform all bitwise operations

        BitSet bs1= new BitSet();

        bs1.set(0);//setting true
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        BitSet bs2=new  BitSet();
        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);

        // bs1.flip(2);Negates the bit value

        bs1.and(bs2);
        System.out.println(bs1);

    }
}
