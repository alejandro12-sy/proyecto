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

    public static void listarautor() {
        AutorDAO a = new AutorDAO();
        List<Autor> au = a.listarautor();
        System.out.println("Listado de AUTOR");
        for (Autor r : au) {
            System.out.println(r.getIdautor() + "\t"
                    + r.getNombre() + "\t"
                    + r.getApellido()
            );
        }

    }

    public static void listareditorial() {
        EditorialDAO e = new EditorialDAO();
        List<Editorial> ed = e.listareditorial();
        System.out.println("listado de editorial");
        for (Editorial l : ed) {
            System.out.println(l.getIdeditorial() + "\t"
                    + l.getNombre() + "\t"
                    + l.getCodigo() + "\t"
                    + l.getDireccion() + "\t"
                    + l.getUrl() + "\t"
                    + l.getEstado()
            );
        }

    }

    public static void listarlibro() {
        LibroDAO l = new LibroDAO();
        List<Libro> i = l.listarlibro();
        System.out.println("");
        for (Libro o : i) {
            System.out.println(o.getIdlibro() + "\t"
                    + o.getTitulo() + "\t"
                    + o.getIsbn() + "\t"
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

    public static void listarpais() {
        PaisDAO p = new PaisDAO();
        List<Pais> a = p.listarpais();
        System.out.println("");
        for (Pais s : a) {
            System.out.println(s.getIdpais() + "\t"
                    + s.getNombre() + "\t"
                    + s.getEstado()
            );
        }

    }

    public static void listarusuario() {
        UsuarioDAO u = new UsuarioDAO();
        List<Usuario> s = u.listarusuario();
        System.out.println("");
        for (Usuario o : s) {
            System.out.println(o.getIdusuario() + "\t"
                    + o.getNombre() + "\t"
                    + o.getApellido() + "\t"
                    + o.getDni() + "\t"
                    + o.getEstado()
            );
        }
    }

    public static void eliminarautor() {
        listarautor();
        System.out.print("Ingrese el ID del Estudiante a Eliminar: ");
        int id = leer.entero();
        AutorDAO a = new AutorDAO();
        a.eliminarautor(id);
    }

    public static void eliminareditar() {
        listareditorial();
        System.out.print("Ingrese el ID del Estudiante a Eliminar: ");
        int id = leer.entero();
        EditorialDAO a = new EditorialDAO();
        a.eliminareditorial(id);
    }

    public static void eliminarlibro() {
        listarlibro();
        System.out.print("Ingrese el ID del Estudiante a Eliminar: ");
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
        System.out.print("Ingrese el ID del Estudiante a Eliminar: ");
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
        System.out.println("apellido");
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
        System.out.print("Ingrese el ID del Estudiante a Editar: ");
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
        System.out.print("Ingrese el ID del Estudiante a Editar: ");
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
        System.out.print("Ingrese el ID del Estudiante a Editar: ");
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
        System.out.print("Ingrese el ID del Estudiante a Editar: ");
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
        System.out.print("Ingrese el ID del Estudiante a Editar: ");
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
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.autor");
        System.out.println("2.editorial");
        System.out.println("3.libro");
        System.out.println("4.pais");
        System.out.println("5. usuario");
        System.out.println("6. mostar los listados");
                System.out.println("7. salir");
                System.out.println("las opciones son[1-7]");
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
        System.out.println("5. ");

    }

    public static void menulibro() {
        System.out.println("Menu");
        System.out.println("1.listar libro");
        System.out.println("2.eliminarautor");
        System.out.println("3.agregarautor");
        System.out.println("4.editarautor");
        System.out.println("5. ");

    }

    public static void menupais() {

        System.out.println("Menu");
        System.out.println("1.listar pais");
        System.out.println("2.eliminar pais");
        System.out.println("3.agregar pais");
        System.out.println("4.editar pais");
        System.out.println("5. ");

    }

    public static void menuusuario() {

        System.out.println("Menu");
        System.out.println("1.listar usuario");
        System.out.println("2.eliminar usuario");
        System.out.println("3.agregar usuario");
        System.out.println("4.editar usuario");
        System.out.println("5. ");

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
                    menuprincipal();
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
                case 6:

                    break;
                default:

                    break;
            }

        } while (opcion != 6);

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

                    break;
                case 6:

                    break;
                default:

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
                case 6:

                    break;
                default:

                    break;
            }

        } while (opcion != 6);

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
                case 6:

                    break;
                default:

                    break;
            }

        } while (opcion != 6);

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
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("LISTA DE PAIS");
                    listarpais();
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("LISTA DE USUARIOS");
                    listarusuario();
                    
                     System.out.println("--------------------------------------------------------------------------");
                    break;
                    case 7:
                    salir();

                    break;
                default:
                    ERROR();
                    break;
            }

        } while (opcion != 7);

    }

    public static void main(String[] args) {
        inicio();
    }

}
