package misc;

public class BitWiseOperatorsMis {

    /*
    we can find oot odd


     */
    public static boolean isOdd(int num)
    {
      int result = num & 1;
      if(result == 1)
          return true;
      else
          return false;
    }

    public static int divideBy2(int num)
    {
        return num >>= 1;
    }

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

