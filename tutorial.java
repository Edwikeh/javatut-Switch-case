package swhitchcasetut;

import extra.Console;

/**
 *
 * @author Edwikeh
 * 2016. November 27
 *  I'm using javalib. You can download here: www.edwikeh.net/javalib.jar
 */

public class SwhitchCaseTUT {


    public static void main(String[] args) {
        
        int month = Console.readInt("Month : ");
        
        switch(month) {
            case 1 : System.out.println("January"); ; break;
            case 2 : System.out.println("February"); break;
            case 3 : System.out.println("March"); break;
            default : System.out.println("Invalid number");
            // etc.
                
                
        }
        
        System.out.print(month);
        
    }
    
}
