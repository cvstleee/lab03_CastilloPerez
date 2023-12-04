package Menu_21060190_CastilloPerez;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;

public class Menu_21060190_CastilloPerez {
    /**
     * Función para iniciar el menú
     */
    public void start() {
        Scanner input = new Scanner(System.in);
        bienvenida();
        //creación sistema vacío
        System_21060190_CastilloPerez s1 = new System_21060190_CastilloPerez(new ArrayList<User_21060190_CastilloPerez>(), "", "Sistema de Chatbots", 1, new ArrayList<Chatbot_21060190_CastilloPerez>(), "");

        //opción de salida
        int MENU_EXIT_OPTION = 5;

        //guardar opciones
        int opcion1;
        int opcion2;
        int opcion3;

        String usuarioNuevo;


        do {
            printMenu();
            //variable que guarda la primera opción escogida
            opcion1 = input.nextInt();

            switch (opcion1) {
                //caso de la opción 1 del menú 1, login, debo ver el tema de los permisos
                case 1:
                    System.out.println("Ingrese el nombre del usuario que desea iniciar sesión: ");
                    input.nextLine();
                    usuarioNuevo = input.nextLine();
                    s1.systemLogin(usuarioNuevo);
                    break;

                //caso de registrar un usuario, debo pasar a otro menú (menuTipoUsuario)
                case 2:
                    do {
                        //llama a otro menú
                        menuTipoUsuario();
                        opcion2 = input.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese el nombre del usuario a registrar: ");
                                usuarioNuevo = input.nextLine();
                                User_21060190_CastilloPerez usuario1 = new User_21060190_CastilloPerez(usuarioNuevo, false);
                                s1.systemAddUser(usuarioNuevo);
                                break;


                            case 2:
                                System.out.println("Ingrese el nombre del usuario administrador a registrar: ");
                                usuarioNuevo = input.nextLine();
                                //creo el objeto usuario1
                                User_21060190_CastilloPerez usuario2 = new User_21060190_CastilloPerez(usuarioNuevo, true);
                                //lo agrego al sistema
                                s1.systemAddUser(usuarioNuevo);
                                break;

                            case 3:
                                s1.systemLogout();
                                break;

                            case 4:
                                System.out.println("Ha salido del menú usuario");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                        }
                    }
            }
        }
    }

    private void printMenu() {
        System.out.println("Menú inicial\n");
        System.out.print("1. Iniciar sesión \n");
        System.out.print("2. Registrarse \n");
        System.out.print("\nEscoja con qué interactuar: ");
    }

    private void menuTipoUsuario() {
        System.out.println("Menú de registro de usuarios\n");
        System.out.println("1. Usuario normal");
        System.out.println("2. Usuario administrador");
        System.out.print("\nEscoja qué acción realizar: ");
    }

    private void menuChatbots() {
        System.out.println("Menú de drives");
        System.out.println("1. Añadir drive");
        System.out.println("2. Seleccionar drive");
        System.out.println("3. Formatear drive");
        System.out.println("4. Salir del menú de drives");
        System.out.print("\nEscoja qué acción realizar: ");
    }

    private void menuArchivos() {
        System.out.println("Menú de archivos y carpetas");
        System.out.println("1. Cambiar ruta");
        System.out.println("2. Ver archivos");
        System.out.println("3. Añadir carpeta");
        System.out.println("4. Añadir archivo");
        System.out.println("5. Eliminar archivos o carpetas");
        System.out.println("6. Copiar archivos o carpetas");
        System.out.println("7. Mover archivos o carpetas");
        System.out.println("8. Renombrar archivo");
        System.out.println("9. Encriptar archivos");
        System.out.println("10. Desencriptar archivos");
        System.out.println("11. Buscar texto en archivos");
        System.out.println("12. Salir del menú de archivos");

    }

    private void menuAnadirArchivo() {
        System.out.println("Menú de añadir archivo");
        System.out.println("1. Añadir archivo de texto");
        System.out.println("2. Añadir archivo tipo documento");
        System.out.println("3. Añadir archivo de código fuente");
        System.out.println("4. Salir del menú de añadir archivo");
    }

    private void menuPapelera() {
        System.out.println("Menú de papelera");
        System.out.println("1. Ver papelera");
        System.out.println("2. Restaurar de la papelera");
        System.out.println("3. Salir del menú de papelera");
    }

    private void parametrosDir() {
        System.out.println("Los parámetros disponibles para usar en Dir son: ");
        System.out.println("'/a' muestra los elementos ocultos");
        System.out.println("'/s' muestra los subdirectorios");
        System.out.println("'/o N' ordena los archivos ordenados alfabéticamente de manera ascendente");
        System.out.println("'/o -N' ordena los archivos ordenados alfabéticamente de manera ascendente");
        System.out.println("'/o D' ordena los archivos ordenados por fecha de creación de manera ascendente");
        System.out.println("'/o -D' ordena los archivos ordenados por fecha de creación de manera ascendente");

    }
    private void bienvenida() {
        System.out.println("Bienvenido al sistema de chatbots");
    }


}