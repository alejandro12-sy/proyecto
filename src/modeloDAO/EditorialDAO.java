/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Editorial;

/**
 *
 * @author Alejandro
 */
public class EditorialDAO implements CRUD2{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
     Editorial e=new Editorial();
      
    @Override
    public List listareditorial() {
ArrayList<Editorial> edi=new ArrayList<>();
         String consulta =" select * from editorial";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
               Editorial a=new Editorial();
               a.setIdeditorial(rs.getInt("ideditorial"));
               a.setNombre(rs.getString("nombre"));
               a.setCodigo(rs.getString("codigo"));
               a.setDireccion(rs.getString("direccion"));
               a.setUrl(rs.getString("url"));
               a.setEstado(rs.getString("estado"));
                 edi.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return edi;    }

    @Override
    public Editorial buscareditorial(int ideditorial) {
String consulta=" select ' "+" from editorial "+" where ideditorial = "+ideditorial;  
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdeditorial(rs.getInt("ideditorial"));
                e.setNombre(rs.getString("nombre"));
                e.setCodigo(rs.getString("codigo"));
                e.setDireccion(rs.getString("direccion"));
                e.setUrl(rs.getString("url"));
                e.setEstado(rs.getString("estado"));
                              
            }
            
        } catch (Exception e) {
             System.out.println("Error: problemas con el listar");
            System.out.println(e.getMessage());
        }
        
        return  e;    }

    @Override
    public boolean agregareditorial(Editorial editorial) {
String consulta=" insert into "+" editorial (nombre,codigo ,direccion ,url ,estado) "  
                          +" values('"+editorial.getNombre() +"', "
                          +" '"+editorial.getCodigo()+"', "  
                          +" '"+editorial.getDireccion()+"', "
                          +" '"+editorial.getUrl()+"', "
                          +" '"+editorial.getEstado()+"')"
         
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
    public boolean editareditorial(Editorial editorial) {
 String consulta=" update editorial "
                          +" set "
                          +" nombre = '"+editorial.getNombre() +"', "
                          +" codigo = '"+editorial.getCodigo()+"', "
                          +" direccion = '"+editorial.getDireccion()+"', "
                          +" url = '"+editorial.getUrl()+"', "
                          +" estado = '"+editorial.getEstado()+"' "
                          +" where "
                          +" ideditorial ="+editorial.getIdeditorial()
                   
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
    public boolean eliminareditorial(int ideditorial) {
String consulta=" delete from editorial "+" where "+" ideditorial = "+ideditorial;
                          
                           
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
