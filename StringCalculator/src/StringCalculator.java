/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StringCalculator {
    
    public int Add(String[] n){
        int t;
        int sumOfAllStrings = 0;
       
        for(String numberOf : n){
            t = Integer.parseInt(numberOf);
            sumOfAllStrings += t;
        }
        return sumOfAllStrings;
    }
    
}
