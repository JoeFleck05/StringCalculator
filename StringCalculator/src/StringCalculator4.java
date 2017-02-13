/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator4 {
    
    public int Add(String s, String delimiter) {
        int returnSum = 0;
        int lengthBeginningDelimiter = 0;
        String[] splitOneArr = null;
        String[] stringArray = null;
        int endingIndex = 0;
        String theEnd = "\n";
        
        if(s.contains(delimiter)) {
            lengthBeginningDelimiter = delimiter.length();
            splitOneArr = s.split(theEnd);
            lengthBeginningDelimiter = splitOneArr[0].length();
            endingIndex = theEnd.length();
            String theDelimiter = s.substring(endingIndex + 1,lengthBeginningDelimiter);
            stringArray = splitOneArr[1].split(theDelimiter);
        } else {
            stringArray = s.split(",|\n");
        }
        
        for(String str : stringArray) {
            returnSum += Integer.parseInt(str);
        }
        return returnSum;        
    }
    
}
