/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Libro;
import modelo.Pais;

/**
 *
 * @author Alejandro
 */
public interface CRUD4 {
    public List listarpais(); 
  public Pais buscarpais(int idpais);
  public boolean agregarpais(Pais pais); 
  public boolean editarpais(Pais pais);
  public boolean  eliminarpais(int idpais);  
}
