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
public class StringCalculator2Test {
    StringCalculator2 sc = new StringCalculator2();
    
    private final String DELIMITER = "//;\n";
    private final String STRING_ONE = "1;3";
    private final int EXPECT_SUM = 4;
    
    private final String STRING_TWO = "";
    private final int EXPECT_SUM_TWO = 0;
    public StringCalculator2Test() {
    }
    @Test
    public void testOne() { assertEquals(EXPECT_SUM, sc.addStrings(STRING_ONE,DELIMITER)); }
    @Test
    public void testTwo() { assertEquals(EXPECT_SUM_TWO, sc.addStrings(STRING_TWO,DELIMITER)); }
    
}
