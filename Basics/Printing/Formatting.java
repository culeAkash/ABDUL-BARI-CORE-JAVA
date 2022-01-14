

/**
 * Format=> %[argument_index$][flags][width][.precision]conversion
 * 
 * argument_index$ ==> The argument number as given in the arguments
 * flags ==> '0'=> To put preceding zeros if width is greater than the width of the argument
 *           '+'=> to show the original number
 *           '('=> shows negative numbers in brackets
 * width ==> To specify the width of the argument while printing
 * .precision ==> To specify the precision of the number
 * conversion ==> %d=> integer
 *                %f=> float
 *                %c=> character
 *                %s=> String 
 */



public class Formatting {

    public static void main(String[] args) {
        
        int x= 10;
        float y= 2.65f;
        char c= 'A';
        String str= "Akash";

        System.out.printf("%2$6.3f %1$05d %4$-20s %3$c", x,y,c,str);
        //First the second argument y gets printed with width 6 and precision 3
        //Second the first argument x gets printed with width 5 and spaces filled with 0
        //third the fourth argument str gets printed with width 20 i.e (20-length of string) blank spaces before the string gets printed,if we use - then after the string spaces will get printed
        //After twenty 15 spaces character gets printed
    }
    
}
