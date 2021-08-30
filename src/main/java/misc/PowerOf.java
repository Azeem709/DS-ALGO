package misc;

public class PowerOf {
    
    
    public static boolean isPowerOfFour(int number){
        System.out.println("Math.log(number)/Math.log(2) = " + Math.log(number)/Math.log(4));
        return Math.log(number)/Math.log(4)%1==0;
        
    }



    public static void main(String ar[]){
        System.out.println("isPowerOfFour() = " + isPowerOfFour(20));
    }
}
