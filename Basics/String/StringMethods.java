public class StringMethods {
    
public static void main(String[] args) {
    

    String str1= "Akash";
    String str2= new String("Akash");
    String str3= "Danish";

    System.out.println(str1.length());//length of string

    String str4=str2.toUpperCase();
    //it doesn't modify the str2 but returns a new string as strings in java are immutable and this new string is created in heap
    System.out.println(str4);
    str4= str2.toLowerCase();
    System.out.println(str4);

    str3= "     Welcome     ";
    System.out.println(str3);
    str3= str3.trim();//removes all preceding and trailing zeros
    System.out.println(str3);

    str3= "Akash Jaiswal";
    str4= str3.substring(6);
    System.out.println(str4);
    str3= str3.substring(0,6);
    System.out.println(str3+" "+str4);

    str3= str3.replace("Akash", "Kuki");
    System.out.println(str3+" "+str4);

    System.out.println(str3.startsWith("K"));
    System.out.println(str3.endsWith("i"));


    System.out.println(str4.indexOf("J"));

    str1= "Akash";
    str2= "Akash";
    str3= new String("Akash");

    System.out.println(str1.equals(str2));
    System.out.println(str2.equals(str3));
    System.out.println(str1==str3);//This method only comapres the reference
    System.out.println(str1==str2);

    str2= "Hussain";
    
    System.out.println(str1.compareTo(str2));//returns ascii difference
    
}    

}
