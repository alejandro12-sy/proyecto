/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;

/**
 *
 * @author Alejandro
 */
public class AutorDAO implements CRUD{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
      Autor e=new Autor();
      
    @Override
    public List listarautor() {
ArrayList<Autor> autors=new ArrayList<>();
         String consulta =" select * from autor";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
               Autor a=new Autor();
               a.setIdautor(rs.getInt("idautor"));
               a.setNombre(rs.getString("nombre"));
               a.setApellido(rs.getString("apellido"));
               
                 autors.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return autors;    }

    @Override
    public Autor buscarautor(int idautor) {
String consulta=" select ' "+" from autor "+" where idautor = "+idautor;  
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdautor(rs.getInt("idautor"));
                e.setNombre(rs.getString("nombre"));
                e.setApellido(rs.getString("apellido"));
                              
            }
            
        } catch (Exception e) {
             System.out.println("Error: problemas con el listar");
            System.out.println(e.getMessage());
        }
        
        return  e;    }

    @Override
    public boolean agregarautor(Autor autor) {
String consulta=" insert into "+" autor (nombre, apellido) "  
                          +" values('"+autor.getNombre() +"', "
                        
                          +" '"+autor.getApellido()+"')"
         
         ;
//         String consulta=" insert into "+" pais (nombre,estado) "  
//                          +" values('"+pais.getNombre() +"', "
//                         
//                         
//                          +" '"+pais.getEstado()+"')"
//         
//         ;
         
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
    public boolean editarautor(Autor autor) {
 String consulta=" update autor "
                          +" set "
                          +" nombre = '"+autor.getNombre() +"', "
                        
                       
                          +" apellido = '"+autor.getApellido()+"' "
                          +" where "
                          +" idautor ="+autor.getIdautor()
                   
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
    public boolean eliminarautor(int idautor) {
String consulta=" delete from autor "+" where "+" idautor = "+idautor;
                          
                           
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
    
    
}
