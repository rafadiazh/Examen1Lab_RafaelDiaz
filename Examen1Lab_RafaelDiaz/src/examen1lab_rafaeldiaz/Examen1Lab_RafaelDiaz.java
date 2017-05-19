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
        ArrayList<Proyecto> proyectos = new ArrayList();
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
                    usuarios.add(new Usuarios(nombreu, edad, profesion, username, password));
                    break;
                case 2:
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " " + usuarios.get(i));
                    }
                    System.out.println("Que usuario desea modificar?");
                    int modu = sc.nextInt();
                    System.out.println("Que desea modificar? \n1. Username\n2. Password");
                    int op = sc.nextInt();
                    if (op == 1) {
                        System.out.println("Ingrese un nuevo Username");
                        username = sc.next();
                        usuarios.get(modu).setUsername(username);
                    } else {
                        System.out.println("Ingrese una nueva password");
                        password = sc.next();
                        usuarios.get(modu).setPassword(password);
                    }
                    break;
                case 3:
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " " + usuarios.get(i));
                    }
                    System.out.println("Que usuario desea eliminar?");
                    int elim = sc.nextInt();
                    usuarios.remove(elim);
                    break;
                case 4:
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + " " + usuarios.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Ingrese su username");
                    username = sc.next();
                    System.out.println("Ingrese su password");
                    password = sc.next();
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getUsername().equals(username)) {
                            if (usuarios.get(i).getPassword().equals(password)) {
                                System.out.println("**Proyectos**");
                                for (int j = 0; j < usuarios.get(i).getPusuarios().size(); j++) {
                                    System.out.println(i+" "+usuarios.get(i).getPusuarios().get(j));
                                }
                                System.out.println("*****PORTAL*****");
                                System.out.println("1. Crear proyectos\n2. Modificar proyecto\n3. Eliminar proyecto\n4. Logout");
                                int opp = sc.nextInt();
                                switch (opp) {
                                    case 1:
                                        sc = new Scanner(System.in);
                                        System.out.println("Ingrese nombre del proyecto");
                                        nombrep = sc.nextLine();
                                        
                                        for (int j = 0; j < usuarios.size(); j++) {
                                            System.out.println(i+" "+usuarios.get(j));
                                        }
                                        System.out.println("Cuantos colaboradores desea agregar?");
                                        int col= sc.nextInt();
                                        for (int j = 0; j < col; j++) {
                                            System.out.println("Que colaborador desea agregar?");
                                            int numcol = sc.nextInt();
                                            usuarios.get(i).getPusuarios().add(new Proyecto(nombrep));
                                            usuarios.get(i).getPusuarios().get(usuarios.get(i).getPusuarios().size()-1).getUsuarios().add(usuarios.get(numcol));
                                        }
                                        
                                        break;
                                    case 2:
                                        for (int k = 0; k < usuarios.get(i).getPusuarios().size(); k++) {
                                            System.out.println(k+" "+usuarios.get(i).getPusuarios().get(k));
                                            
                                        }
                                        System.out.println("Que proyecto desea modificar?");
                                        int cual = sc.nextInt();
                                        
                                        for (int k1 = 0; k1 < usuarios.get(i).getPusuarios().get(cual).getArchivos().size(); k1++) {
                                            System.out.println(k1+" "+usuarios.get(i).getPusuarios().get(cual).getArchivos().get(k1));
                                            
                                        }
                                        
                                        System.out.println("1. Crear Archivo\n2. Modificar Archivo\n3. Eliminar Archivo\n4. Ingresar Comando\n5. Volver");
                                        int oppp = sc.nextInt();
                                        switch(oppp){
                                            case 1:
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el nombre del Archivo");
                                                nombrea = sc.nextLine();
                                                System.out.println("1. Carpeta\n2. Archivos de texto");
                                                int arc = sc.nextInt();
                                                if (arc==1) {
                                                    
                                                } else {
                                                }
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                break;
                                            case 5:
                                                break;
                                            default:
                                                break;
                                                
                                        }
                                        
                                        break;
                                    case 3:
                                        for (int j = 0; j < usuarios.get(i).getPusuarios().size(); j++) {
                                    System.out.println(i+" "+usuarios.get(i).getPusuarios().get(j));
                                }
                                        System.out.println("Que proyecto desea eliminar?");
                                        int elimpro = sc.nextInt();
                                        usuarios.get(i).getPusuarios().remove(elimpro);
                                        break;
                                    case 4:
                                        System.out.println("Gracias por visitar el github mejorado de Rafa☻");
                                        break;
                                    default:
                                        System.out.println("Esa no es una opcion brother☺");
                                        break;
                                }

                            } else {
                                System.out.println("El password ingresado es incorrecto");
                            }

                        }

                    }
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
