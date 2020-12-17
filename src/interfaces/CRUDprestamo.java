/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Prestamo;

/**
 *
 * @author Alejandro
 */
public interface CRUDprestamo {
     public List listarprestamo(); 
     public List listarprestamo2(); 
  public Prestamo buscarprestamo(int idprestamo);
  public boolean agregarprestamo(Prestamo prestamo); 
  public boolean editarprestamo(Prestamo prestamo);
  public boolean  eliminprestamo(int idprestamo);  
    
    
}
