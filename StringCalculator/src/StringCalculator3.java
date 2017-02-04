/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator3 {
    public int Add(String s) {
        int returnSum = 0;
        if(!s.isEmpty()) {
            String[] sArray = s.split(",");
            for(String sa : sArray) {
                returnSum += Integer.parseInt(sa);
            }
        } else {
            
        }
        
        return returnSum;
    }
}
