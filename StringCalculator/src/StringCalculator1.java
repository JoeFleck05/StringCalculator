/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator1 {
    
    public int Add(String s) {
        String[] sArray;
        int returnInt = 0;
        int lengthOfDelimiter = 1;
        if(!s.isEmpty()) {
            if(s.contains("//")){
                int ip = s.indexOf(s, lengthOfDelimiter);
                System.out.println(ip);   
            } else {
                sArray = s.split(",|\n");
                for(String h : sArray) {
                    returnInt += Integer.parseInt(h);
                }
            }
        }
        return returnInt;
    }
    
}
