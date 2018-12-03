
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josephfleck
 */
public class StreamExample {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","a2","b1","b2","c2","c1");
        List<String> s = getStreamListExample(list);        
        System.out.println("Stream Example: " + s);
    }
    
    public static List<String> getStreamListExample(List<String> list){
        List<String> myList = list;
    
        myList.stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
        
        return myList;
    }
}
