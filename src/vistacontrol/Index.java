/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrol;

import utils.leer;

/**
 *
 * @author Alejandro
 */
public class Index {
    
    
    public static void listarautor(){
        
        
    }
    public static void listareditorial(){
    }
    public static void listarlibro(){
    }
    public static void listarpais(){
        
    }
    public static void listarusuario(){
    }
     public static void salir(){
    }
     public static void menu(){
    }
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion=leer.entero();
            switch(opcion){ 
                
                case 1:
                    
                   
                    break;
                    case 2:
                        
                         break;
                    case 3:
                        salir();
                        break;
                    default:
                        
                        break;
            }   
            
            
            
        } while (opcion!=3);
        
        
    }
    
    
    public static void main(String[] args) {
        inicio();
    }
    
    
}
