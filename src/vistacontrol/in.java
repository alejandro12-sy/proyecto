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
import modelo.Prestamo;
import modelo.Usuario;
import modeloDAO.AutorDAO;
import modeloDAO.EditorialDAO;
import modeloDAO.LibroDAO;
import modeloDAO.PaisDAO;
import modeloDAO.PrestamoDAO;
import modeloDAO.UsuarioDAO;
import utils.leer;

/**
 *
 * @author Alejandro
 */
public class in {
    
     public static void listarprestamo() {
         PrestamoDAO p=new PrestamoDAO();
          List<Prestamo> au = p.listarprestamo();
          System.out.println("Listado de Prestamo");
          for (Prestamo o : au) {
              System.out.println(o.getIdprestamo() + "\t|"
              +o.getFecha_prestamo()+"\t|"
                      +o.getFecha_devolucion()+"\t|"
                      +o.getEstado()+"\t|"
                      +o.getIdusuario()+"\t|"
                      +o.getIdlibro()
              
              
              
              
              
               );
              
              
              
         }
  
          
     }
     public static void listarprestamo2() {
         PrestamoDAO p=new PrestamoDAO();
         
          List<Prestamo> au = p.listarprestamo2();
          System.out.println("Listado de Prestamo2");
          for (Prestamo o : au) {
              System.out.println(o.getIdprestamo() + "\t|"
              +o.getFecha_prestamo()+"\t|"
                      +o.getFecha_devolucion()+"\t|"
                      +o.getEstado()+"\t|"
                      +darFormato5(o.getUsu(), 3)+"\t|"
                      +o.getLibro()
              
              
              
              
              
               );
              
              
              
         }
  
          
     }
     public static void prestamo() {
        int opcion;
        do {
            menuprestamo();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listarprestamo();
                    break;
                case 2:
                    listarprestamo2();

                    break;
                case 3:
                   
                    break;

                case 4:
                    
                    break;
                case 5:
                    
                    break;   
                default:
                        ERROR();
                    break;
            }

        } while (opcion != 5);

    }
     public static void menuprestamo() {
        System.out.println("Menu");
        System.out.println("1.listar prestamo");
        System.out.println("2..listar prestamo2");
        System.out.println("3.agregarautor");
        System.out.println("4.editarautor");
        System.out.println("5.volver al menu principal ");

    }

    public static void listarautor() {
        AutorDAO a = new AutorDAO();
        List<Autor> au = a.listarautor();
        System.out.println("Listado de AUTOR");
        System.out.println("ID\tNombre\t\t\t\tApellido");
        for (Autor r : au) {
            
            System.out.println(r.getIdautor() + "\t|"
                    + darFormato(r.getNombre(), 4) + "\t|"
                    +darFormato( r.getApellido(), 4)
            );
        }

    }

    public static void listareditorial() {
        EditorialDAO e = new EditorialDAO();
        List<Editorial> ed = e.listareditorial();
        System.out.println("listado de editorial");
         System.out.println("ID\tNombre\t\t\tCodigo\t\tDireccion\t\t\t\t\t\t\t\t\t\tUrl\t\t\t\t\t\t\t\tEstado");
        for (Editorial l : ed) {
            System.out.println(l.getIdeditorial() + "\t|"
                    +darFormato2(l.getNombre(), 1)  + "\t|"
                    + darFormato2(l.getCodigo(), 2) + "\t|"
                    +darFormato2(l.getDireccion(), 3) + "\t|"
                    +darFormato2(l.getUrl(), 4)  + "\t|"
                    + l.getEstado()
            );
        }

    }

    public static void listarlibro() {
        LibroDAO l = new LibroDAO();
        List<Libro> i = l.listarlibro();
        
        System.out.println("Listado de libro");
             System.out.println("ID\tTitulo\t\t\t\tIsbn\t\tPaginas\t\tAño\tEstado\tStock\tStock_disponibles\tIdautor\tIdpais\tIdeditorial");
        for (Libro o : i) {
            System.out.println(o.getIdlibro() + "\t"
                    +darFormato3(o.getTitulo() , 1) 
                    + darFormato3(o.getIsbn(), 2) + "\t"
                    + o.getPaginas() + "\t"
                    + o.getAño() + "\t"
                    + o.getStock() + "\t"
                    + o.getStock_disponibles() + "\t"
                    + o.getIdautor() + "\t"
                    + o.getIdpais() + "\t"
                    + o.getIdeditorial()
            );
        }

    }
    public static void listarlibro2() {
        LibroDAO l = new LibroDAO();
        List<Libro> i = l.listarlibro2();
        System.out.println("LISTANDO LA UNION DE TABLAS");
                     System.out.println("ID\tTitulo\t\t\t\tIsbn\t\tPaginas\t\tAño\tEstado\tStock\tStock_disponibles\tIdautor\tIdpais\tIdeditorial");

        int ilongTitulo,ilongIsbn,ilongAutornombre,ilongPais_nombre,ilongEditorial_nombre;
        int ilongTitulomayor = 0,ilongIsbnmayor=0,ilongAutornombremayor=0,ilongPais_nombremayor=0,ilongEditorial_nombremayor=0;
        String slongTitulo,slongIsbn,slongAutornombre,slongPais_nombre,slongEditorial_nombre;           
          
        
          
        
        
        for (Libro o : i) {
           
                  slongTitulo=o.getTitulo(); //el valo de cada campo
                  ilongTitulo = slongTitulo.length(); //obtener la long de cada campo
                  if (ilongTitulo > ilongTitulomayor) { ilongTitulomayor = ilongTitulo;}
                  
                   slongIsbn= o.getIsbn();
                   ilongIsbn= slongIsbn.length();
                   if (ilongIsbn > ilongIsbnmayor) { ilongIsbnmayor = ilongIsbn;}
                    
                   slongAutornombre = o.getAutornombre();
                   ilongAutornombre= slongAutornombre.length();
                    if (ilongAutornombre > ilongAutornombremayor) { ilongAutornombremayor = ilongAutornombre;}
                   
                   slongPais_nombre = o.getPais_nombre();
                   ilongPais_nombre = slongPais_nombre.length();
                    if (ilongPais_nombre > ilongPais_nombremayor) { ilongPais_nombremayor = ilongPais_nombre;}
                   
                   slongEditorial_nombre = o.getEditorial_nombre();
                   ilongEditorial_nombre = slongEditorial_nombre.length();
                    if (ilongEditorial_nombre > ilongEditorial_nombremayor) { ilongEditorial_nombremayor = ilongEditorial_nombre;}
                   
        }             
                     
                     
        for (Libro o : i) {
            System.out.println(o.getIdlibro() + "\t"
                    +darFormato3(o.getTitulo() , ilongTitulomayor) 
                    + darFormato3(o.getIsbn(), ilongIsbnmayor) + "\t"
                    + o.getPaginas() + "\t"
                    + o.getAño() + "\t"
                    + o.getStock() + "\t"
                    + o.getStock_disponibles() + "\t"
                    +darFormato3(o.getAutornombre(), ilongAutornombremayor) + "\t"
                    + darFormato3(o.getPais_nombre(), ilongPais_nombremayor) + "\t"
                    +darFormato3( o.getEditorial_nombre(), ilongEditorial_nombremayor)
            );
        }

    }

    public static void listarpais() {
        PaisDAO p = new PaisDAO();
        List<Pais> a = p.listarpais();
        System.out.println("Listado de Pais");
         System.out.println("ID\tpais\t\t\tEstado");
        for (Pais s : a) {
            System.out.println(s.getIdpais() + "\t"
                    +darFormato(s.getNombre(), 1)  + "\t"
                    + s.getEstado()
            );
        }

    }

    public static void listarusuario() {
        UsuarioDAO u = new UsuarioDAO();
        List<Usuario> s = u.listarusuario();
        System.out.println("Listado de Usuario");
        System.out.println("ID\tpais\t\t\tEstado\t\t\tApellido\t\tDni\t\tEstado");
        
        
        
        
        for (Usuario o : s) {
            System.out.println(o.getIdusuario() + "\t"
                    + darFormato4(o.getNombre(), 1) + "\t"
                    + darFormato4(o.getApellido(), 2) + "\t"
                    + darFormato(o.getDni(), 3) + "\t"
                    + o.getEstado()
            );
        }
    }
    public static String darFormato(String cadena, int campo){
             int longitud;
             
        if ( campo == 1)  {  //getTitulo
            longitud = 20 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
       
        }else if ( campo == 2)  {  //getAutornombre
              longitud =  15-  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 3)  {  //getPais_nombre
              longitud = 15 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 4)  {  //getEditorial_nombre
              longitud = 30 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
              
          }
        return cadena;
          }
    
    
    
    
     public static String darFormato5(String cadena, int campo){
             int longitud;
             
        if ( campo == 1)  {  //getTitulo
            longitud = 20 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
       
        }else if ( campo == 2)  {  //getAutornombre
              longitud =  15-  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 3)  {  //getPais_nombre
              longitud = 25 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 4)  {  //getEditorial_nombre
              longitud = 30 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
              
          }
        return cadena;
          }
    public static String darFormato4(String cadena, int campo){
             int longitud;
             
        if ( campo == 1)  {  //getTitulo
            longitud = 20 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
       
        }else if ( campo == 2)  {  //getAutornombre
              longitud =  25-  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 3)  {  //getPais_nombre
              longitud = 15 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 4)  {  //getEditorial_nombre
              longitud = 30 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
              
          }
        return cadena;
          }
     public static String darFormato3(String cadena, int longitud){
         int restadelong = longitud - cadena.length();
       
              cadena = cadena + " ".repeat(restadelong + 2);
              return cadena;
      /*  if ( campo == 1)  {  //getTitulo
            longitud = 30 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
       
             
              
              
        }else if ( campo == 2)  {  //getAutornombre
              longitud = 20 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 3)  {  //getPais_nombre
              longitud = 15 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 4)  {  //getEditorial_nombre
              longitud = 18 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
              
          }*/
        
          }
    
    
     public static String darFormato2(String cadena, int campo){
             int longitud;
             
        if ( campo == 1)  {  //getTitulo
            longitud = 20 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
       
        }else if ( campo == 2)  {  //getAutornombre
              longitud = 10 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 3)  {  //getPais_nombre
              longitud = 85 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
        }else if ( campo == 4)  {  //getEditorial_nombre
              longitud = 60 -  cadena.length();
            cadena = cadena + " ".repeat(longitud);
              
          }
        return cadena;
          }
    

    public static void eliminarautor() {
        listarautor();
        System.out.print("Ingrese el ID del autor a Eliminar: ");
        int id = leer.entero();
        AutorDAO a = new AutorDAO();
        a.eliminarautor(id);
    }

    public static void eliminareditar() {
        listareditorial();
        System.out.print("Ingrese el ID del editorial a Eliminar: ");
        int id = leer.entero();
        EditorialDAO a = new EditorialDAO();
        a.eliminareditorial(id);
    }

    public static void eliminarlibro() {
        listarlibro();
        System.out.print("Ingrese el ID del libro a Eliminar: ");
        int id = leer.entero();
        LibroDAO l = new LibroDAO();
        l.eliminarlibro(id);
    }

    public static void eliminarpais() {
        listarpais();
        System.out.print("Ingrese el ID del pais a Eliminar: ");
        int id = leer.entero();
        PaisDAO P = new PaisDAO();
        P.eliminarpais(id);
    }

    public static void eliminarusuario() {
        listarusuario();
        System.out.print("Ingrese el ID del usuario a Eliminar: ");
        int id = leer.entero();
        UsuarioDAO u = new UsuarioDAO();
        u.eliminarusuario(id);
    }

    
    public static void agregarautor() {
        String nombre;
        String apellido;
        System.out.println("Agregar ");
        System.out.println("nombre:");
        nombre = leer.cadena();
        System.out.println("apellido:");
        apellido = leer.cadena();
        Autor a = new Autor(nombre, apellido);
        AutorDAO q = new AutorDAO();
        q.agregarautor(a);

    }

    public static void agregareditar() {
        String nombre;
        String codigo;
        String direccion;
        String url;
        String estado;
        System.out.println("Agregar  ");
        System.out.println("nombre:");
        nombre = leer.cadena();
        System.out.println("codigo:");
        codigo = leer.cadena();
        System.out.println("direccion:");
        direccion = leer.cadena();
        System.out.println("url:");
        url = leer.cadena();
        System.out.println("estado:");
        estado = leer.cadena();
        Editorial e = new Editorial(nombre, codigo, direccion, url, estado);
        EditorialDAO a = new EditorialDAO();
        a.agregareditorial(e);

    }

    public static void agregarlibro() {
        String titulo;
        String isbn;
        String paginas;
        String año;
        String stock;
        String stock_disponibles;
        int idautor;
        int idpais;
        int ideditorial;
        System.out.println("Agregar ");
        System.out.println("titulo:");
        titulo = leer.cadena();
        System.out.println("isbn:");
        isbn = leer.cadena();
        System.out.println("paginas:");
        paginas = leer.cadena();

        System.out.println("año:");
        año = leer.cadena();
        System.out.println("stock:");
        stock = leer.cadena();
        System.out.println("stock_disponibles:");
        stock_disponibles = leer.cadena();
        System.out.println("idautor");
        idautor = leer.entero();
        System.out.println("idpais:");
        idpais = leer.entero();
        System.out.println("ideditorial");
        ideditorial = leer.entero();
        Libro l = new Libro(titulo, isbn, paginas, año, stock, stock_disponibles, idautor, idpais, ideditorial);
        LibroDAO a = new LibroDAO();
        a.agregarlibro(l);

    }

    public static void agregarpais() {
        String nombre;
        String estado;
        System.out.println("Agregar ");
        System.out.println("nombre:");
        nombre = leer.cadena();

        System.out.println("estado:");
        estado = leer.cadena();
        Pais P = new Pais(nombre, estado);

        PaisDAO S = new PaisDAO();
        S.agregarpais(P);
    }

    public static void agregarusuario() {
        String nombre;
        String apellido;
        String dni;
        String estado;
        System.out.println("Agregar ");
        System.out.println("nombre");
        nombre = leer.cadena();
        System.out.println("apellido");
        apellido = leer.cadena();

        System.out.println("dni");
        dni = leer.cadena();
        System.out.println("estado");
        estado = leer.cadena();
        Usuario u = new Usuario(nombre, apellido, dni, estado);
        UsuarioDAO s = new UsuarioDAO();
        s.agregarusuario(u);

    }

    public static void editarautor() {
        listarautor();
        System.out.print("Ingrese el ID del autor a Editar: ");
        int id = leer.entero();  //construir un constructor
        String nombre;
        String apellido;
        System.out.println("Editar ");
        System.out.println("nombre:");
        nombre = leer.cadena();
        System.out.println("apellido");
        apellido = leer.cadena();
        Autor a = new Autor(id, nombre, apellido);
        AutorDAO s = new AutorDAO();
        s.editarautor(a);
    }

    public static void editareditar() {
        listareditorial();
        System.out.print("Ingrese el ID del editorial a Editar: ");
        int id = leer.entero();  //construir un constructor
        String nombre;
        String codigo;
        String direccion;
        String url;
        String estado;
        System.out.println("Agregar ");
        System.out.println("nombre:");
        nombre = leer.cadena();
        System.out.println("codigo:");
        codigo = leer.cadena();
        System.out.println("direccion:");
        direccion = leer.cadena();
        System.out.println("url:");
        url = leer.cadena();
        System.out.println("estado:");
        estado = leer.cadena();
        Editorial e = new Editorial(id, nombre, codigo, direccion, url, estado);
        EditorialDAO q = new EditorialDAO();
        q.editareditorial(e);
    }

    public static void editarlibro() {
        listarlibro();
        System.out.print("Ingrese el ID del libro a Editar: ");
        int id = leer.entero();  //construir un constructor
        String titulo;
        String isbn;
        String paginas;
        String año;
        String stock;
        String stock_disponibles;
        int idautor;
        int idpais;
        int ideditorial;
        System.out.println("Agregar ");
        System.out.println("titulo:");
        titulo = leer.cadena();
        System.out.println("isbn:");
        isbn = leer.cadena();
        System.out.println("paginas:");
        paginas = leer.cadena();

        System.out.println("año:");
        año = leer.cadena();
        System.out.println("stock:");
        stock = leer.cadena();
        System.out.println("stock_disponibles:");
        stock_disponibles = leer.cadena();
        System.out.println("idautor");
        idautor = leer.entero();
        System.out.println("idpais:");
        idpais = leer.entero();
        System.out.println("ideditorial");
        ideditorial = leer.entero();
        Libro l = new Libro(id, titulo, isbn, paginas, año, stock, stock_disponibles, idautor, idpais, ideditorial);
        LibroDAO O = new LibroDAO();
        O.editarlibro(l);
    }

    public static void editarpais() {
        listarpais();
        System.out.print("Ingrese el ID del pais a Editar: ");
        int id = leer.entero();  //construir un constructor
        String nombre;
        String estado;
        System.out.println("Agregar ");
        System.out.println("nombre:");
        nombre = leer.cadena();

        System.out.println("estado:");
        estado = leer.cadena();
        Pais P = new Pais(id, nombre, estado);
        PaisDAO a = new PaisDAO();
        a.editarpais(P);
    }

    public static void editarusuario() {
        listarusuario();
        System.out.print("Ingrese el ID del usuario a Editar: ");
        int id = leer.entero();  //construir un constructor
        String nombre;
        String apellido;
        String dni;
        String estado;
        System.out.println("Agregar ");
        System.out.println("nombre");
        nombre = leer.cadena();
        System.out.println("apellido");
        apellido = leer.cadena();

        System.out.println("dni");
        dni = leer.cadena();
        System.out.println("estado");
        estado = leer.cadena();
        Usuario u = new Usuario(id, nombre, apellido, dni, estado);
        UsuarioDAO a = new UsuarioDAO();
        a.editarusuario(u);
    }

    public static void salir() {
        System.out.println("GRACIAS POR INGRESAR A LA BIBLIOTECA VIRTUAL , QUE TENGAS UN GRAN DIA");
    }
     public static void ERROR() {
         System.out.println("ERORRRR NO HAY MAS OPCIONES");
    }
    public static void menuprincipal() {
        System.out.println("*************************");
        System.out.println("*MENU PRINCIPAL         *");
        
        System.out.println("*1.datos autor          *");
        System.out.println("*2.datos editorial      *");
        System.out.println("*3.datos libro          *");
        System.out.println("*4.datos pais           *");
        System.out.println("*5.datos usuario        *");
        System.out.println("*6.mostar los listados  *");
        System.out.println("*7. datos de prestamo   *");
        System.out.println("*8. salir               *");
        System.out.println("*las opciones son[1-8]  *");
        System.out.println("*************************");
    }

    public static void menuautor() {
        System.out.println("Menu");
        System.out.println("1.listarautor");
        System.out.println("2.eliminarautor");
        System.out.println("3.agregarautor");
        System.out.println("4.editarautor");
        System.out.println("5.volver al menu principal ");

    }

    public static void menueditorial() {
        System.out.println("Menu");
        System.out.println("1.listar editorial");
        System.out.println("2.eliminar editorial");
        System.out.println("3.agregar editorial");
        System.out.println("4.editar editorial");
        System.out.println("5.volver al menu principal ");

    }

    public static void menulibro() {
        System.out.println("Menu");
        System.out.println("1.listar libro");
        System.out.println("2.eliminarautor");
        System.out.println("3.agregarautor");
        System.out.println("4.editarautor");
        System.out.println("5.listar libro2");
        System.out.println("6.volver al menu principal ");

    }

    public static void menupais() {

        System.out.println("Menu");
        System.out.println("1.listar pais");
        System.out.println("2.eliminar pais");
        System.out.println("3.agregar pais");
        System.out.println("4.editar pais");
        System.out.println("5.volver al menu principal ");

    }

    public static void menuusuario() {

        System.out.println("Menu");
        System.out.println("1.listar usuario");
        System.out.println("2.eliminar usuario");
        System.out.println("3.agregar usuario");
        System.out.println("4.editar usuario");
        System.out.println("5.volver al menu principal ");

    }

    public static void autor() {
        int opcion;
        do {
            menuautor();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listarautor();
                    break;
                case 2:
                    eliminarautor();

                    break;
                case 3:
                    agregarautor();
                    break;

                case 4:
                    editarautor();
                    break;
                case 5:
                    
                    break;   
                default:
                        ERROR();
                    break;
            }

        } while (opcion != 5);

    }

    public static void editorial() {
        int opcion;
        do {
            menueditorial();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listareditorial();
                    break;
                case 2:

                    eliminareditar();
                    break;
                case 3:
                    agregareditar();
                    break;

                case 4:
                    editareditar();
                    break;
                case 5:

                    break;
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 5);

    }

    public static void libro() {
        int opcion;
        do {
            menulibro();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listarlibro();
                    break;
                case 2:

                    eliminarlibro();
                    break;
                case 3:
                    agregarlibro();

                    break;

                case 4:
                    editarlibro();
                    break;
                case 5:
                    listarlibro2();
                    break;
                 case 6:

                    break;
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 6);

    }

    public static void pais() {
        int opcion;
        do {
            menupais();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listarpais();
                    break;
                case 2:

                    eliminarpais();
                    break;
                case 3:
                    agregarpais();
                    break;

                case 4:
                    editarpais();
                    break;
                case 5:

                    break;
                
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 5);

    }

    public static void usuario() {
        int opcion;
        do {
            menuusuario();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    listarusuario();
                    break;
                case 2:

                    eliminarusuario();
                    break;
                case 3:
                    agregarusuario();
                    break;

                case 4:
                    editarusuario();
                    break;
                case 5:
                    
                    break;
                
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 5);

    }

    public static void inicio() {
        int opcion;
        do {
            menuprincipal();
            opcion = leer.entero();
            switch (opcion) {

                case 1:

                    autor();
                    break;
                case 2:

                    editorial();
                    break;
                case 3:
                    libro();
                    break;

                case 4:
                    pais();
                    break;

                case 5:
                    usuario();

                    break;
                case 6:
                     System.out.println("--------------------------------------------------------------------------");
                    System.out.println("LISTA DE AUTOR");
                    listarautor();
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("LISTA DE EDITORIALES");
                    listareditorial();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("LISTA DE LIBROS");
                    listarlibro();
                    System.out.println("LISTA DE LIBROS2");
                    listarlibro2();
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("LISTA DE PAIS");
                    listarpais();
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("LISTA DE USUARIOS");
                    listarusuario();
                     System.out.println("LISTA DE PRESTAMO");
                    listarprestamo();
                     System.out.println("LISTA DE PRESTAMO");
                    listarprestamo2();
                    
                    
                     System.out.println("--------------------------------------------------------------------------");
                    break;
                    case 7:
                   prestamo();
                    case 8:
                    salir();
                    break;
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 8);

    }

    public static void main(String[] args) {
        inicio();
    }

}
