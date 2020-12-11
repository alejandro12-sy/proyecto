/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD4;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;
import modelo.Pais;

/**
 *
 * @author Alejandro
 */
public class PaisDAO implements CRUD4{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
      Pais e=new Pais();
      
    @Override
    public List listarpais() {
ArrayList<Pais> autors=new ArrayList<>();
         String consulta =" select * from pais";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
                Pais a=new Pais();
               a.setIdpais(rs.getInt("idpais"));
               a.setNombre(rs.getString("nombre"));      
               a.setEstado(rs.getString("estado"));
                 autors.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return autors;    }

    @Override
    public Pais buscarpais(int idpais) {
String consulta=" select ' "+" from pais "+" where idpais = "+idpais; 
                          
                           
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                e.setIdpais(rs.getInt("idpais"));
                e.setNombre(rs.getString("nombre"));           
                e.setEstado(rs.getString("estado"));
                              
            }
            
        } catch (Exception e) {
             System.out.println("Error: problemas con el listar");
            System.out.println(e.getMessage());
        }
        
        return  e;    }

    @Override
    public boolean agregarpais(Pais pais) {
String consulta=" insert into "+" pais (nombre,estado) "  
                          +" values('"+pais.getNombre() +"', "
                         
                         
                          +" '"+pais.getEstado()+"')"
         
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
    public boolean editarpais(Pais pais) {
 String consulta=" update pais "
                          +" set "
                          +" nombre = '"+pais.getNombre() +"', "
                        
                          +" estado = '"+pais.getEstado()+"' "
                          +" where "
                          +" idpais ="+pais.getIdpais()
                   
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
    public boolean eliminarpais(int idpais) {
 String consulta=" delete from pais "+" where "+" idpais = "+idpais; 
                          
                           
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
