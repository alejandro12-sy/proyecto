/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUDprestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Editorial;
import modelo.Prestamo;

/**
 *
 * @author Alejandro
 */
public class PrestamoDAO implements CRUDprestamo{
ConectaBd cn = new ConectaBd();
     Connection con;
    PreparedStatement pst;
      ResultSet rs;
      Prestamo e=new Prestamo();
    @Override
    public List listarprestamo() {
      ArrayList<Prestamo> edi=new ArrayList<>();
         String consulta =" select * from prestamo";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
               Prestamo a=new Prestamo();
               a.setIdprestamo(rs.getInt("idprestamo"));
               a.setFecha_prestamo(rs.getString("fecha_prestamo"));
               a.setFecha_devolucion(rs.getString("fecha_devolucion"));
               a.setEstado(rs.getString("estado"));
               a.setIdusuario(rs.getInt("idusuario"));
                a.setIdlibro(rs.getInt("idlibro"));
              
                 edi.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return edi;   
        
        
    }

    @Override
    public List listarprestamo2() {
ArrayList<Prestamo> edi=new ArrayList<>();
         String consulta =" SELECT p.idprestamo as idprestamo ,p.fecha_prestamo as fecha_prestamo ,p.fecha_devolucion as fecha_devolucion,p.estado  as estado,u.nombre as usu ,l.titulo as libro " 
         +"FROM prestamo p,usuario u,libro l  WHERE u.idusuario=p.idprestamo and u.idusuario=l.idlibro ORDER BY p.idprestamo";
         
         try {
           con=cn.getConnection();
             pst=con.prepareStatement(consulta);
             rs=pst.executeQuery(); 
             while (rs.next()) {                 
              
               Prestamo a=new Prestamo();
               a.setIdprestamo(rs.getInt("idprestamo"));
               a.setFecha_prestamo(rs.getString("fecha_prestamo"));
               a.setFecha_devolucion(rs.getString("fecha_devolucion"));
               a.setEstado(rs.getString("estado"));
               a.setUsu(rs.getString("usu"));
                a.setLibro(rs.getString("libro"));
              
                 edi.add(a);
             }
             
             
             
             
        } catch (SQLException e) {
             System.out.println("Error: problemas con el listar");
              System.out.println(e.getMessage());
        }
         return edi;     }

    @Override
    public Prestamo buscarprestamo(int idprestamo) {
//       String consulta=" select ' "+" from prestamo "+" where idprestamo = "+idprestamo;  
//                          
//                           
//        try {
//            con = cn.getConnection();
//            pst = con.prepareStatement(consulta);
//            rs = pst.executeQuery();
//            while (rs.next()) {                
//                e.setIdautor(rs.getInt("idautor"));
//                e.setNombre(rs.getString("nombre"));
//                e.setApellido(rs.getString("apellido"));
//                  e.setIdautor(rs.getInt("idautor"));
//                e.setNombre(rs.getString("nombre"));
//                e.setApellido(rs.getString("apellido"));             
//            }
//            
//        } catch (Exception e) {
//             System.out.println("Error: problemas con el listar");
//            System.out.println(e.getMessage());
//        }
//        
//        return  e;   
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public boolean agregarprestamo(Prestamo prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarprestamo(Prestamo prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminprestamo(int idprestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
