
//Class for all mathematical operations


public class MathClassUse {
    public static void main(String[] args) {
        
        System.out.println(Math.abs(-123));//returns absolute value

        System.out.println(StrictMath.abs(-123));//Mopre precise results and compromises with speed,it is slow

        System.out.println(Math.cbrt(27));//cube root 


        // System.out.println(Math.decrementExact(7));//give decremented value i.e 6
        // System.out.println(Math.decrementExact(Integer.MIN_VALUE));But for this we will get exception and will not give maximum value

        int i=Integer.MIN_VALUE;
        i--;
        System.out.println(i);//if we decrement minimum value we will get maximim value

        System.out.println(Math.getExponent(12.345));//gives exponent

        System.out.println(Math.toRadians(90));//gives radian avlue

        System.out.println(Math.floorDiv(50, 9));//gives floor value

        System.out.println(Math.exp(1));//e^1

        System.out.println(Math.log10(100));//log10(100)=2
        System.out.println(Math.log(100));//log(e)(100)

        System.out.println(Math.toDegrees(Math.atan(1)));
        //math.atan(1)=45degress but in radian
        //math.toDegrees() convert to degree format

        System.out.println(Math.random());//gives random number between 0 and 1

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.nextAfter(12, 13));//gives next float number after 12 towards 13
        System.out.println(Math.nextAfter(12, 11));

    }
}
