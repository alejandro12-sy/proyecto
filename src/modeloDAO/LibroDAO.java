/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Libro;

/**
 *
 * @author Alejandro
 */
public class LibroDAO implements CRUD3{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
     Libro e=new Libro();
      
    @Override
    public List listarlibro() {
ArrayList<Libro> autors=new ArrayList<>();
         String consulta =" select * from libro";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
                 Libro a=new Libro();
               a.setIdlibro(rs.getInt("idlibro"));
               a.setTitulo(rs.getString("titulo"));
               a.setIsbn(rs.getString("isbn"));
               a.setPaginas(rs.getString("paginas"));
               a.setAño(rs.getString("año"));
               a.setStock(rs.getString("stock"));
               a.setStock_disponibles(rs.getString("stock_disponibles"));
               a.setIdautor(rs.getInt("idautor"));
               a.setIdpais(rs.getInt("idpais"));
               a.setIdeditorial(rs.getInt("ideditorial"));
               
                 autors.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return autors;    }

    @Override
    public Libro buscarlibro(int idlibro) {
String consulta=" select ' "+" from libro "+" where idlibro = "+idlibro;  
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdlibro(rs.getInt("idlibro"));
                e.setTitulo(rs.getString("titulo"));
                e.setIsbn(rs.getString("isbn"));
                e.setPaginas(rs.getString("paginas"));
                
                e.setAño(rs.getString("años"));
                e.setStock(rs.getString("stock"));
                e.setStock_disponibles(rs.getString("stock_disponibles"));
                e.setIdautor(rs.getInt("idautor"));
                e.setIdpais(rs.getInt("idpais"));
                e.setIdeditorial(rs.getInt("ideditorial"));
                              
            }
            
        } catch (Exception e) {
             System.out.println("Error: problemas con el listar");
            System.out.println(e.getMessage());
        }
        
        return  e;    }

    @Override
    public boolean agregarlibro(Libro libro) {
String consulta=" insert into "+" libro (titulo, isbn, paginas, año,stock,stock_disponibles,idautor,idpais,ideditorial) "  
                          +" values('"+libro.getTitulo() +"', "
                          +" '"+libro.getIsbn()+"', "  
                          +" '"+libro.getPaginas()+"', "
                          +" '"+libro.getAño()+"', "
                            +" '"+libro.getStock()+"', "  
                          +" '"+libro.getStock_disponibles()+"', "
                          +" '"+libro.getIdautor()+"', "
                           +" '"+libro.getIdpais()+"', "
        
        
        
                          +" '"+libro.getIdeditorial()+"')"
        
        
         
         ;
         
         
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
            
            
        } catch (Exception error) {
             System.out.println("Error: problemas con el INSET");
            System.out.println(error.getMessage());
            return false;
        }
        
        return  true;    }

    @Override
    public boolean editarlibro(Libro libro) {
 String consulta=" update libro "
                          +" set "
                          +" titulo = '"+libro.getTitulo() +"', "
                          +" isbn = '"+libro.getIsbn()+"', "
                          +" paginas = '"+libro.getPaginas()+"', "
                          +" año = '"+libro.getAño()+"', "
                          +" stock= '"+libro.getStock()+"' ,"
                            +"stock_disponibles = '"+libro.getStock_disponibles()+"' ,"
                              +"idautor = '"+libro.getIdautor()+"' ,"
                              +"idpais = '"+libro.getIdpais()+"' ,"
                           +" ideditorial= '"+libro.getIdeditorial()+"' "
         
         
         
                          +" where "
                          +" idlibro ="+libro.getIdlibro()
                   
                   ;
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
            
            
        } catch (Exception error) {
             System.out.println("Error: problemas en la EDICION");
            System.out.println(error.getMessage());
            return false;
        }
        
        return  true;    }

    @Override
    public boolean eliminarlibro(int idlibro) {
String consulta=" delete from libro "+" where "+" idlibro = "+idlibro;
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
            
            
        } catch (Exception error) {
             System.out.println("Error: problemas con el error");
            System.out.println(error.getMessage());
            return false;
        }
        
        return  true;      }

    @Override
    public List listarlibro2() {
ArrayList<Libro> autors=new ArrayList<>();
         String consulta ="SELECT l.idlibro as idlibro,l.titulo as titulo,l.isbn as isbn,l.paginas as paginas, "
                + "l.año as ano,l.stock as stock,l.stock_disponibles as stock_disp,a.nombre as autornombre ,"
                 + "p.nombre pais_nombre ,e.nombre editorial_nombre FROM libro l, autor a ,pais p ,editorial e WHERE a.idautor=l.idlibro and a.idautor =p.idpais and a.idautor=e.ideditorial ORDER BY l.idlibro ";
//          private String autornombre;
//     private String pais_nombre;
//     private String editorial_nombre;
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
                 Libro a=new Libro();
               a.setIdlibro(rs.getInt("idlibro"));
               a.setTitulo(rs.getString("titulo"));
               a.setIsbn(rs.getString("isbn"));
               a.setPaginas(rs.getString("paginas"));
               a.setAño(rs.getString("ano"));
               a.setStock(rs.getString("stock"));
               a.setStock_disponibles(rs.getString("stock_disp"));
               a.setAutornombre(rs.getString("autornombre"));
               a.setPais_nombre(rs.getString("pais_nombre"));
               a.setEditorial_nombre(rs.getString("editorial_nombre"));
               
                 autors.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return autors;       }
    
}
