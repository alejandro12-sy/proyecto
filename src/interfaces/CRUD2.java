/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Editorial;


/**
 *
 * @author Alejandro
 */
public interface CRUD2 {
    public List listareditorial(); 
  public Editorial buscareditorial(int ideditorial);
  public boolean agregareditorial(Editorial editorial); 
  public boolean editareditorial(Editorial editorial);
  public boolean  eliminareditorial(int ideditorial);  
}
