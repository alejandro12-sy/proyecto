/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

import modelo.Usuario;

/**
 *
 * @author Alejandro
 */
public interface CRUD5 {
    public List listarusuario(); 
  public Usuario buscarusuario(int idusuario);
  public boolean agregarusuario(Usuario usuario); 
  public boolean editarusuario(Usuario usuario);
  public boolean  eliminarusuario(int idusuario);  
}
