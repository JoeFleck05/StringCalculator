/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator5 {
    public int Add(String s) {
        int returnSum = 0;
        String[] sArray = null;
        int startingInt = 0;
        int endingInt = 0;
        String delimiter = null;
        
        if (s.contains("\n")) {
            sArray = s.split("\n");
            startingInt = sArray[0].length() - 1;
            delimiter = sArray[0].substring(startingInt);
            s = sArray[1];
        } else {
            delimiter = ",|\n";
        }
        
        sArray = s.split(delimiter);
        for(String newString : sArray) {
            returnSum += Integer.parseInt(newString);
        }
        return returnSum;
    }
    
}
