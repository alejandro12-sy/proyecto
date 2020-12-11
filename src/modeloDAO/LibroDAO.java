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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarlibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarlibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarlibro(int idlibro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
