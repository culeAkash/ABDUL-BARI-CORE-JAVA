public class Challenge3 {
    
    public static void main(String[] args) {
        
        //Replace all special characters from a string
        //remove extra spaces from the string
        //Find number of words in a string

        String str= "a!@#35^&rtE()(";
        String s= "[^a-zA-Z0-9]";

        str=str.replaceAll(s,"");
        System.out.println(str);

        str= "abc   def    fgh    ijk";
        System.out.println(str.replaceAll("\\s+", " "));

        String words[]=str.split("\\s+");
        System.out.println(words.length);

    }
}
