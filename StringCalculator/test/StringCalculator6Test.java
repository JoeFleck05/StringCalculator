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
public class StringCalculator6Test {
    
    public StringCalculator6Test() {
    }
    
    StringCalculator6 add =  new StringCalculator6();
    final private String STRING_ONE = "//;\n1;2;3";
    final private int EXPECTED_RESULT = 6;
    
    final private String STRING_TWO = "1,2\n3";
    final private int EXPECTED_TWO_RESULT = 6;
    
    @Test
    public void returnSumOfNumbersTest(){ assertEquals(EXPECTED_RESULT, add.Add(STRING_ONE)); }
    
    @Test
    public void returnSumOfNumbersTestTwo(){ assertEquals(EXPECTED_TWO_RESULT, add.Add(STRING_TWO)); }
}
