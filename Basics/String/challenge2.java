public class challenge2 {
    
    public static void main(String[] args) {
        
        //Find if a number is binary or not
        //Find if a number is hexagesimal or not
        //Find if a number is is in date format or not

        String str= "101010101";
        String str2= "[01]*";//can becomposed of 0 and 1 only but any number of times
        System.out.println(str.matches(str2));

        str= "A5S67DFH";
        str2= "[A-Z 0-9]+";//can be composed of either 0-9 or A-Z but more than one times
        System.out.println(str.matches(str2));

        str= "14/01/2022";
        str2= "[0-9]{2}/[0-9]{2}/[0-9]{4}";// 2 0-9 then 2 0-9 the 4 0-9
        System.out.println(str.matches(str2));
    }
}
