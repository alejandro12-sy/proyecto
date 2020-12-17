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
public class Libro {
    private int idlibro;
    private String titulo;
    private String isbn;
    private String paginas;
     private String año;
     private String stock;
     private String stock_disponibles;
     private String autornombre;
     private String pais_nombre;
     private String editorial_nombre;
     private int idautor;
     private int idpais;
     private int ideditorial;

    public Libro() {
    }

    public Libro( String titulo, String isbn, String paginas, String año, String stock, String stock_disponibles, int idautor, int idpais, int ideditorial) {
        
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.año = año;
        this.stock = stock;
        this.stock_disponibles = stock_disponibles;
        this.idautor = idautor;
        this.idpais = idpais;
        this.ideditorial = ideditorial;
    }

    public Libro( String titulo, String isbn, String paginas, String año, String stock, String stock_disponibles, String autornombre, String pais_nombre, String editorial_nombre) {
        
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.año = año;
        this.stock = stock;
        this.stock_disponibles = stock_disponibles;
        this.autornombre = autornombre;
        this.pais_nombre = pais_nombre;
        this.editorial_nombre = editorial_nombre;
    }
    
    

    public Libro(int idlibro, String titulo, String isbn, String paginas, String año, String stock, String stock_disponibles, int idautor, int idpais, int ideditorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.año = año;
        this.stock = stock;
        this.stock_disponibles = stock_disponibles;
        this.idautor = idautor;
        this.idpais = idpais;
        this.ideditorial = ideditorial;
    }
    
     
     
     
    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock_disponibles() {
        return stock_disponibles;
    }

    public void setStock_disponibles(String stock_disponibles) {
        this.stock_disponibles = stock_disponibles;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getAutornombre() {
        return autornombre;
    }

    public void setAutornombre(String autornombre) {
        this.autornombre = autornombre;
    }

    public String getPais_nombre() {
        return pais_nombre;
    }

    public void setPais_nombre(String pais_nombre) {
        this.pais_nombre = pais_nombre;
    }

    public String getEditorial_nombre() {
        return editorial_nombre;
    }

    public void setEditorial_nombre(String editorial_nombre) {
        this.editorial_nombre = editorial_nombre;
    }
     
     
                    
}
