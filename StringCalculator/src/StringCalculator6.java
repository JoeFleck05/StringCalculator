/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator6 {
    
    public int Add(String s) {
        int returnVal = 0;
        String delimiter = "";
        int startIndex = 0;
        int endIndex = 0;
        String[] delimiterArray = null;
        
        if(s.contains("//")) {
            delimiterArray = s.split("\n");
            startIndex = delimiterArray[0].length() - 1;
            delimiter = delimiterArray[0].substring(startIndex);
        }else {
            delimiter = ",|\n";
        }
        
        String[] stringArray = delimiterArray[1].split(delimiter);
        for(String str : stringArray) {
            returnVal += Integer.parseInt(str);
        }
        return returnVal;
    }
}
