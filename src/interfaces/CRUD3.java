/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Libro;

/**
 *
 * @author Alejandro
 */
public interface CRUD3 {
    public List listarlibro(); 
  public Libro buscarlibro(int idlibro);
  public boolean agregarlibro(Libro libro); 
  public boolean editarlibro(Libro libro);
  public boolean  eliminarlibro(int idlibro);  
}
