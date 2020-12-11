/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrol;

import java.util.List;
import modelo.Autor;
import modelo.Editorial;
import modelo.Libro;
import modelo.Pais;
import modelo.Usuario;
import modeloDAO.AutorDAO;
import modeloDAO.EditorialDAO;
import modeloDAO.LibroDAO;
import modeloDAO.PaisDAO;
import modeloDAO.UsuarioDAO;
import utils.leer;

/**
 *
 * @author Alejandro
 */
public class Index {
    
    
    public static void listarautor(){
        AutorDAO a=new AutorDAO();
        List<Autor>au=a.listarautor();
        System.out.println("Listado de AUTOR");
        for (Autor r : au) {
            System.out.println(r.getIdautor()+"\t"+
                    r.getNombre()+"\t"+
                    r.getApellido()
        
            );
        }
        
    }
    public static void listareditorial(){
        EditorialDAO e=new EditorialDAO();
        List<Editorial> ed=e.listareditorial();
        System.out.println("listado de editorial");
        for (Editorial l : ed) {
            System.out.println(l.getIdeditorial()+"\t"+
                    l.getNombre()+"\t"+
                    l.getCodigo()+"\t"+
                    l.getDireccion()+"\t"+
                    l.getUrl()+"\t"+
                    l.getEstado()
                    
                    
                    
                    
            
            );
        }
        
    }
    public static void listarlibro(){
        LibroDAO l=new LibroDAO();
        List<Libro>i=l.listarlibro();
        System.out.println("");
        for (Libro o : i) {
            System.out.println(o.getIdlibro()+"\t"+
                    o.getTitulo()+"\t"+
                    o.getIsbn()+"\t"+
                    o.getPaginas()+"\t"+
                    o.getAño()+"\t"+
                    o.getStock()+"\t"+
                    o.getStock_disponibles()+"\t"+
                    o.getIdautor()+"\t"+
                    o.getIdpais()+"\t"+
                    o.getIdeditorial()
                    
                    
                    
            );
        }
        
    }
    public static void listarpais(){
        PaisDAO p=new PaisDAO();
        List<Pais>a=p.listarpais();
        System.out.println("");
        for (Pais s : a) {
            System.out.println(s.getIdpais()+"\t"+
                    s.getNombre()+"\t"+
                    s.getEstado()
                    
                    
                    
            );
        }
        
    }
    public static void listarusuario(){
        UsuarioDAO u=new UsuarioDAO();
        List<Usuario>s=u.listarusuario();
        System.out.println("");
        for (Usuario o : s) {
            System.out.println(o.getIdusuario()+"\t"+
                    o.getNombre()+"\t"+
                    o.getApellido()+"\t"+
                    o.getDni()+"\t"+
                    o.getEstado()
                    
                    
                    
                    
                    
                    
                    
            );
        }
    }
     public static void salir(){
    }
     public static void menu(){
         System.out.println("Menu");
         System.out.println("1.listarautor");
         System.out.println("2.listar editorial");
          System.out.println("3.listar libro");
         System.out.println("4.listar pasis");
          System.out.println("5.listar usuario");
         
         
         
    }
    public static void inicio(){
        int opcion;
        do {            
            menu();
            opcion=leer.entero();
            switch(opcion){ 
                
                case 1:
                    
                   listarautor();
                    break;
                    case 2:
                        
                        listareditorial();
                         break;
                    case 3:
                       listarlibro();
                        break;
                        
                         case 4:
                       listarpais();
                        break;
                         case 5:
                       listarusuario();
                               
                        break;
                         case 6:
                       
                        break;
                    default:
                        
                        break;
            }   
            
            
            
        } while (opcion!=10);
        
        
    }
    
    
    public static void main(String[] args) {
        inicio();
    }
    
    
}
