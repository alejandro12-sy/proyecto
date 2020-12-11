/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Autor {
    private int idautor;
    private String nombre;
    private String apellido;

    public Autor() {
    }

    public Autor(int idautor, String nombre, String apellido) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
