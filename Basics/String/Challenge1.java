public class Challenge1 {
    
    public static void main(String[] args) {
        //Tell whether this email id is on google or not
        //Find name and domain
        String str= "Akashjais929@gmail.com";

        int index= str.indexOf("@");
        System.out.println(index);

        String domain= str.substring(index+1);
        String userName= str.substring(0, index);
        System.out.println(domain);
        System.out.println(userName);
        System.out.println(domain.startsWith("gmail"));
        
    }
}
