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
public class StringCalculator4Test {
    
    public StringCalculator4Test() {
    }
    
    StringCalculator4 sc4 = new StringCalculator4();
    
    private final String STR_ONE = "0,1,2";
    private final String DELIMITER = "";
    private final int EXPECTED_RESULT = 3;
    
    private final String STR_TWO = "1,2\n3";
    private final int EXPECTED_TWO = 6;
    
    private final String STR_THREE = "//;\n1;2;3";
    private final String DELIMITER_THREE = "//";
    private final int EXPECTED_THREE = 6;
    
    @Test
    public void testOne() { assertEquals(EXPECTED_RESULT, sc4.Add(STR_ONE,DELIMITER)); }
    
    @Test
    public void testTwo() { assertEquals(EXPECTED_TWO, sc4.Add(STR_TWO,DELIMITER)); }
    
    @Test
    public void testThree() { assertEquals(EXPECTED_THREE, sc4.Add(STR_THREE,DELIMITER_THREE)); }
}
