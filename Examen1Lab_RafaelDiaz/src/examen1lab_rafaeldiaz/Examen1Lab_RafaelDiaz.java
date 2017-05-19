
package examen1lab_rafaeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Examen1Lab_RafaelDiaz {

    static Scanner sc = new Scanner(System.in);
    //usuarios
    static String nombreu;
    static int edad;
    static String profesion;
    static String username;
    static String password;
    //proyecto
    static String nombrep;
    static int commits;
    //archivos
    static String nombrea;
    static int tamano;
    //Archivos de texto
    static String texto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Usuarios> usuarios = new ArrayList();
        int opcion;
        do {
            System.out.println("*****MENU*****");
            System.out.println("1. Registrar Usuario\n2. Modificar Usuario\n3. Eliminar Usuario\n4. Listar Usuarios\n5. Login\n6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc = new Scanner(System.in);
                    System.out.println("Ingrese su nombre");
                    nombreu = sc.nextLine();
                    System.out.println("Ingrese su edad");
                    edad = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println("ingrese su profesion");
                    profesion = sc.nextLine();
                    System.out.println("Ingrese su username");
                    username = sc.next();
                    System.out.println("Ingrese su contraseña");
                    password = sc.next();
                    usuarios.add(new Usuarios(nombreu,edad,profesion, username,password));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("El numero ingresado no es una opcion!");
                    break;
            }
        } while (opcion != 6);
    }

}
