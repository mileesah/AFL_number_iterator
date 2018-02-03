package au.com.afl.exercise.service.impl.operators;


import org.junit.Assert;
import org.junit.Test;

public class NumberDivisibleOperatorTest {


    /*
     * Test zero inputs
     */
    @Test()
    public void testDivisibleByZero() {
        int num1 = 13;
        int num2 = 0;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertFalse((Boolean) operator.execute());
    }

    @Test()
    public void testDivisibleWithZero() {
        int num1 = 0;
        int num2 = 3;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertTrue((Boolean) operator.execute());
    }
    /*
     * Test happy path
     */
    @Test()
    public void testDivisibleBy3False() {
        int num1 = 13;
        int num2 = 3;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertFalse((Boolean) operator.execute());
    }

    @Test()
    public void testDivisibleBy3True() {
        int num1 = 15;
        int num2 = 3;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertTrue((Boolean) operator.execute());
    }

    @Test()
    public void testDivisibleBy5True() {
        int num1 = 15;
        int num2 = 5;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertTrue((Boolean) operator.execute());
    }
    /*
     * Test negative inputs
     */
    @Test()
    public void testDivisibleByNegativeNumberStillTrue() {
        int num1 = 15;
        int num2 = -5;
        NumberDivisibleOperator operator = new NumberDivisibleOperator(num1, num2);

        Assert.assertTrue((Boolean) operator.execute());
    }
}
