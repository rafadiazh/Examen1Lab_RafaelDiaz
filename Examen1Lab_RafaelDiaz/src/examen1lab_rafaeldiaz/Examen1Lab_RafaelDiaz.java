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
    static int commits=0;
    static String comando;
    //archivos
    static String nombrea;
    static int tamano;
    //Archivos de texto
    static String texto;
    static int archive;

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
                    sc = new Scanner(System.in);
                    System.out.println("Ingrese su edad");
                    edad = sc.nextInt();
                    sc = new Scanner(System.in);
                    System.out.println("ingrese su profesion");
                    profesion = sc.nextLine();
                    sc = new Scanner(System.in);
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
                    sc = new Scanner(System.in);
                    System.out.println("Ingrese su username");
                    username = sc.next();
                    sc = new Scanner(System.in);
                    System.out.println("Ingrese su password");
                    password = sc.next();
                    sc = new Scanner(System.in);
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
                                        sc = new Scanner(System.in);
                                        for (int j = 0; j < usuarios.size(); j++) {
                                            System.out.println(j+" "+usuarios.get(j));
                                        }
                                        System.out.println("Cuantos colaboradores desea agregar?");
                                        int col= sc.nextInt();
                                        if(col>usuarios.size()){
                                        for (int j = 0; j < col; j++) {
                                            System.out.println("Que colaborador desea agregar?");
                                            int numcol = sc.nextInt();
                                            usuarios.get(i).getPusuarios().add(new Proyecto(nombrep));
                                            usuarios.get(i).getPusuarios().get(usuarios.get(i).getPusuarios().size()-1).getUsuarios().add(usuarios.get(numcol));
                                            usuarios.get(numcol).getPusuarios().add(usuarios.get(i).getPusuarios().get(usuarios.get(i).getPusuarios().size()-1));
                                        }
                                        }else{
                                            System.out.println("No hay suficientes colaboradores broo");
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
                                                    usuarios.get(i).getPusuarios().get(cual).getArchivos().add(new Carpetas());
                                                } else {
                                                    sc = new Scanner(System.in);
                                                    System.out.println("Ingrese texto que desea guardar");
                                                    texto = sc.nextLine();
                                                    sc = new Scanner(System.in);
                                                    usuarios.get(i).getPusuarios().get(cual).getArchivos().add(new Atexto(texto));
                                                }
                                                break;
                                            case 2:
                                                for (int q = 0; q < usuarios.get(i).getPusuarios().get(cual).getArchivos().size(); q++) {
                                                    System.out.println(q+" "+usuarios.get(i).getPusuarios().get(cual).getArchivos().get(q));
                                                }
                                                System.out.println("Que archivo desea modificar?");
                                                archive = sc.nextInt();
                                                System.out.println(usuarios.get(i).getPusuarios().get(cual).getArchivos().get(archive));
                                                
                                                        
                                                break;
                                            case 3:
                                                System.out.println("Que archivo desea eliminar?");
                                                    int elimarc = sc.nextInt();
                                                    usuarios.get(i).getPusuarios().get(cual).getArchivos().remove(elimarc);
                                                break;
                                            case 4:
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese comando");
                                                comando = sc.nextLine();
                                                sc = new Scanner(System.in);
                                                if (comando.equals("meow push")) {
                                                    System.out.println("Pushed exitosamente");
                                                    commits ++;
                                                    usuarios.get(i).getPusuarios().get(cual).setCommits(commits);
                                                } else {
                                                    System.out.println("Comando invalido");
                                                }
                                                break;
                                            case 5:
                                                
                                                if (usuarios.get(i).getPusuarios().get(cual).getArchivos().size()>0) {
                                                    System.out.println(usuarios.get(i).getPusuarios().get(cual).getArchivos().get(archive-1));
                                                } else {
                                                    System.out.println("Ya no puede regresar");
                                                }
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
