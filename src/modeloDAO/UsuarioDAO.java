/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Usuario;

/**
 *
 * @author Alejandro
 */
public class UsuarioDAO implements CRUD5{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
      Usuario e=new Usuario();
      
    @Override
    public List listarusuario() {
ArrayList<Usuario> autors=new ArrayList<>();
         String consulta =" select * from usuario";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
               Usuario a=new Usuario();
               a.setIdusuario(rs.getInt("idusuario"));
               a.setNombre(rs.getString("nombre"));
               a.setApellido(rs.getString("apellido"));
               a.setDni(rs.getString("dni"));
               a.setEstado(rs.getString("estado"));
                 autors.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return autors;    }

    @Override
    public Usuario buscarusuario(int idusuario) {
String consulta=" select ' "+" from usuario "+" where idusuario = "+idusuario;
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdusuario(rs.getInt("idusuario"));
                e.setNombre(rs.getString("nombre"));
                e.setApellido(rs.getString("apellido"));
                e.setDni(rs.getString("dni"));
              
                e.setEstado(rs.getString("estado"));
                              
            }
            
        } catch (Exception e) {
             System.out.println("Error: problemas con el listar");
            System.out.println(e.getMessage());
        }
        
        return  e;    }

    @Override
    public boolean agregarusuario(Usuario usuario) {
String consulta=" insert into "+" usuario (nombre, apellido, dni,estado) "  
                          +" values('"+usuario.getNombre() +"', "
                          +" '"+usuario.getApellido()+"', "  
                          +" '"+usuario.getDni()+"', "
                          
                          +" '"+usuario.getEstado()+"')"
         
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
    public boolean editarusuario(Usuario usuario) {
 String consulta=" update estudiante "
                          +" set "
                          +" nombre = '"+usuario.getNombre() +"', "
                          +" apellido = '"+usuario.getApellido()+"', "
                          
                          +" dni = '"+usuario.getDni()+"', "
                          
                          +" estado = '"+usuario.getEstado()+"' "
                          +" where "
                          +" idusuario ="+usuario.getIdusuario()
                   
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
    public boolean eliminarusuario(int idusuario) {
 String consulta=" delete from usuario "+" where "+" idusuario = "+idusuario;
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
            
            
        } catch (Exception error) {
             System.out.println("Error: problemas con el error");
            System.out.println(error.getMessage());
            return false;
        }
        
        return  true;    }
    
}
