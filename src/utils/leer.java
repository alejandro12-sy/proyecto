/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class leer {
    public static Scanner cc=new Scanner(System.in);
    
    public static String cadena(){
        return cc.nextLine();
        
    }
    public static int entero(){  
     return    Integer.valueOf(cadena());
     
    }
    
    public static double decimal(){
     return Double.valueOf(cadena());
     
    }
    public static  char letra(){
     return cadena().charAt(0);
        
    }
            
    
            
    
}
