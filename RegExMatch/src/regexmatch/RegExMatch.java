/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author kcgarcia
 */
public class RegExMatch {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isTrue(String str){
    
        return str.matches("[tT]rue");
    }
    
    public static boolean containsFalse(String str){
        
        return str.matches(".*false.*");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("somethingsomethingfalsesomethingsomething"));
        System.out.println(containsFalse("randomstring"));
        Scanner sc = new Scanner(new FileReader("input.txt"));
        while(sc.hasNext()){
            System.out.println(isTrue(sc.nextLine()));
        }
    }
    
}
