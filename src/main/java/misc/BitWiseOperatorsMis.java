package misc;


public class BitWiseOperatorsMis {

     BitWiseOperatorsMis(){}


    /**
     * We can check number for odd useing bitwise AND operator with the input number
     * if number is odd it will produce 1
     * ex input number 5
     *   binary     = 0 1 0 1
     *     AND      = 0 0 0 1
     *    Result(1) = 0 0 0 1
     * @param num
     * @return
     */
    public static boolean isOddwithANDOperator(int num)
    {
      int result = num & 1;
      if(result == 1)
          return true;
      else
          return false;
    }


    /**
     * XOR operator(^)(returns TRUE if both bits are different)
     * @param
     * * @return
     */
    public static int isOddOccurenceUsingXOR(int inputArr[]){
        int result = 0;
        for(int i=0;i<inputArr.length;i++){
            result ^= inputArr[i];
        }
        return result;
    }


    /**
     * Right shift operator can be used to divide by 2
     * @param num
     * @return
     */
    public static int divideBy2(int num)
    {
        return num >>= 1;
    }


    /**
     * left shift operator can be used to multiply number with 2
     * @param num
     * @return
     */
    public static int multiplyBy2(int num)
    {
        return num <<= 1;
    }


    public static void bin(Integer n)
    {
        if (n > 1)
            bin(n>>1);

        System.out.printf("%d", n & 1);
    }
}

