package misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitWiseOperatorsMisTest {

    static int[] arr;

    @BeforeAll()
    static void initArr(){
        arr = new int[]{10, 20, 20, 50, 50};
    }

    @Test()
    @DisplayName("Is Odd Number")
    public void isOddNumber()
    {
        Assertions.assertTrue(BitWiseOperatorsMis.isOddwithANDOperator(501),"IS Odd Number");
    }

    @Test()
    @DisplayName("Is Not Odd Number")
    public void isNotOddNumber()
    {
        Assertions.assertFalse(BitWiseOperatorsMis.isOddwithANDOperator(6),"IS Odd Number");
    }



    @Test()
    @DisplayName("odd occurence in array")
    public void oddOccurenceinArray()
    {
        Assertions.assertEquals(BitWiseOperatorsMis.isOddOccurenceUsingXOR(arr),10,"IS Odd Number");
    }

    @Test()
    @DisplayName("Divide by 2")
    public void divideNumBy2()
    {
        Assertions.assertEquals(BitWiseOperatorsMis.isOddOccurenceUsingXOR(arr),10,"IS Odd Number");
    }

}