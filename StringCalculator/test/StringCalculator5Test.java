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
public class StringCalculator5Test {
    
    public StringCalculator5Test() {
    }
    
    private final String VALUES_ONE = "1\n3,2";
    private final int EXPECTED_RESULT_ONE = 6;
    
    private final String VALUES_TWO = "//;\n1;2";
    private final int EXPECTED_RESULT_TWO = 3;
    
    StringCalculator5 s = new StringCalculator5();
    
    @Test
    public void firstTest() { assertEquals(EXPECTED_RESULT_ONE, s.Add(VALUES_ONE) ); }
    
    @Test
    public void secondTest() { assertEquals(EXPECTED_RESULT_TWO, s.Add(VALUES_TWO) ); }
}
