/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class StringCalculator1Test {
    
    StringCalculator1 sc = new StringCalculator1();
    
    private final String VALUES_1 = "1,23,4";
    private final int EXPECTED_RETURN_1 = 28;
    
    private final String VALUES_2 = "";
    private final int EXPECTED_RETURN_2 = 0;
    
    private final String VALUES_3 = "1\n2,3";
    private final int EXPECTED_RETURN_3 = 6;
    
    private final String VALUES_4 =  "//;\n1;2";
    private final int EXPECTED_RETURN_4 = 3;
    
    public StringCalculator1Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void returnSumOfNumbers() { assertEquals(EXPECTED_RETURN_1,sc.Add(VALUES_1)); }
    @Test
    public void returnZeroForEmptyString() { assertEquals(EXPECTED_RETURN_2, sc.Add(VALUES_2)); }
    @Test
    public void newLineTest() { assertEquals(EXPECTED_RETURN_3, sc.Add(VALUES_3)); }
    @Test
    public void differentDelimiterTest() { assertEquals(EXPECTED_RETURN_4, sc.Add(VALUES_4)); }
}
