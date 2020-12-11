/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author Alejandro
 */
public interface CRUD {
    public List listarautor(); 
  public Autor buscarautor(int idautor);
  public boolean agregarautor(Autor autor); 
  public boolean editarautor(Autor autor);
  public boolean  eliminarautor(int idautor);  
}
