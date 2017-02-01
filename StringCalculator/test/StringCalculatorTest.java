/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josephfleck
 */
public class StringCalculatorTest {
    
    StringCalculator sc = new StringCalculator();
    
    private final String TEST_STRING_ONE = "0";
    private final int EXPECT_INT_ONE = 0;
    
    private final String TEST_STRING_TWO = "1";
    private final int EXPECT_INT_TWO = 1;
    
    private final String TEST_STRING_THREE = "2";
    private final int EXPECT_INT_THREE = 2;
    
    public StringCalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void testOne(){ assertEquals(EXPECT_INT_ONE, sc.Add(TEST_STRING_ONE)); }
    @Test
    public void testTwo(){ assertEquals(EXPECT_INT_TWO, sc.Add(TEST_STRING_TWO)); }
    @Test
    public void testThree(){ assertEquals(EXPECT_INT_THREE, sc.Add(TEST_STRING_THREE)); }
}
