/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator2 {
    public int addStrings(String s, String d) {
        int returnSum = 0;
        String[] sArray;
        if(s.isEmpty()) {
            returnSum = 0;
        } else {
            sArray = s.split(delimiterValue(d));
            for(String g : sArray) {
                returnSum += Integer.parseInt(g);
            }
        }
        return returnSum;
    }
    
    public String delimiterValue(String d) {
        String delimiterString = null;
        if(d.contains("//")) {
            int stringStart = "//".length();
            int stringEnd = d.indexOf("\n");
            String delim = d.substring(stringStart, stringEnd);
            delimiterString = delim;
        } else {
            delimiterString = ",|\n";
        }
        return delimiterString;
    }
}
