package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc=new Calculator();
        assertEquals(40,myCalc.add(20,20));
    }
    @Test
    public void testmultiply()
    {
        myCalc=new Calculator();
        assertEquals(400,myCalc.multiply(20,20));
    }
    @Test
    public void testsubtract()
    {
        myCalc=new Calculator();
        assertEquals(0,myCalc.subtract(20,20));
    }
    @Test
    public void testdivide()
    {
        myCalc=new Calculator();
        assertEquals(0,myCalc.subtract(20,20));
    }

}
