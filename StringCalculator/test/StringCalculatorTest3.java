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
public class StringCalculatorTest3 {
    
    private final String STRING_ONE = "0";
    private final int RETURN_ANSWER_1 = 0;
    
    private final String STRING_TWO = "0,2,3";
    private final int RETURN_ANSWER_2 = 5;
    
    
    
    public StringCalculatorTest3() {
    }
    
    StringCalculator3 sc = new StringCalculator3();
    
    @Test
    public void returnSum() { assertEquals(RETURN_ANSWER_2, sc.Add(STRING_TWO)); }
    
}
