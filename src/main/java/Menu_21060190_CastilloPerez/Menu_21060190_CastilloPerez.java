package Menu_21060190_CastilloPerez;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Flow;

import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
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
        System_21060190_CastilloPerez s1 = new System_21060190_CastilloPerez("Sistema de Chatbots", 1, new ArrayList<Chatbot_21060190_CastilloPerez>());

        //system con datos
        System_21060190_CastilloPerez s2 = CargaDatos.cargaDatos();
        //opción de salida
        int MENU_EXIT_OPTION = 5;

        //guardar opciones
        int opcion1;
        int opcion2;
        int opcion3;

        String usuarioNuevo;
        String usuarioNuevo2;

        boolean tipo;

        int code;
        int initialFlowCodeLink;
        int chatbotCodeLink;
        String keyword;
        String msg;

        String idOP;


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
                    usuarioNuevo2 = usuarioNuevo.toLowerCase();
                    //obtengo el tipo de usuario
                    tipo = s2.systemLogin(usuarioNuevo2);
                    System.out.printf("Bienvenido/a %s\n", usuarioNuevo2);

                    if (tipo){
                        do {
                            menuAdmi();
                            opcion3 = input.nextInt();

                            switch (opcion3){
                                case 1:
                                    System.out.println("Ingrese la código de la opción que desea agregar: ");
                                    code = input.nextInt();
                                    System.out.println("Ingrese el mensaje de la opción que desea agregar: ");
                                    msg = input.nextLine();
                                    System.out.println("Ingrese el chatbotCodeLink de la opción que desea agregar: ");
                                    chatbotCodeLink = input.nextInt();
                                    System.out.println("Ingrese el initialFlowCodeLink de la opción que desea agregar: ");
                                    initialFlowCodeLink = input.nextInt();
                                    System.out.println("Ingrese una keyword de la opción que desea agregar: ");
                                    input.nextLine();
                                    keyword = input.nextLine();
                                    //ahora como las agrego ?
                            }
                        }while (opcion3 != MENU_EXIT_OPTION);
                    } //caso usuario común
                    else{
                        Chatbot_21060190_CastilloPerez chatbotAux = s2.obtenerChatbot(0,s2);
                        System.out.println(chatbotAux.getName());
                        System.out.println(chatbotAux.getWelcomeMessage());
                        Flow_21060190_CastilloPerez flowAux = chatbotAux.obtenerFlow(chatbotAux.getStartFlowID(), chatbotAux);
                        System.out.println(flowAux.getNameMsg());
                        //menú inicial
                        flowAux.printOptions(flowAux);
                        System.out.println("Escriba el n° de la opción que desea: ");

                        //pq el int tiene que entrar como string al systemTalk
                        input.nextLine();
                        idOP = input.nextLine();

                        //quiero que el systemTalk solo haga interacciones
                        s2.systemTalk(idOP);




                        /**
                         * Login/Logout
                         * Interactuar con el chatbot (system-talk)
                         * Consultar por la síntesis de un chatbot que le pertenece (system-synthesis)
                         * Simular el diálogo entre dos chatbots del sistema (system-simulate)
                         * */
                    }


                //caso de registrar un usuario, debo pasar a otro menú (menuTipoUsuario)
                case 2:
                    do {
                        //llama a otro menú
                        menuTipoUsuario();
                        opcion2 = input.nextInt();
                        //ESTO NO LO IMPRIME AAAAA
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese el nombre del usuario a registrar: ");
                                input.nextLine();
                                usuarioNuevo = input.nextLine();
                                User_21060190_CastilloPerez usuarioObj = new User_21060190_CastilloPerez(usuarioNuevo);
                                usuarioObj.setEsAdministrador(false);
                                s1.systemAddUser(usuarioObj);
                                break;


                            case 2:
                                System.out.println("Ingrese el nombre del usuario administrador a registrar: ");
                                input.nextLine();
                                usuarioNuevo = input.nextLine();
                                usuarioNuevo2 = usuarioNuevo.toLowerCase();
                                //creo el objeto usuario1
                                User_21060190_CastilloPerez usuarioObj2 = new User_21060190_CastilloPerez(usuarioNuevo2);
                                usuarioObj2.setEsAdministrador(true);
                                //lo agrego al sistema
                                s1.systemAddUser(usuarioObj2);
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
                    }while (opcion2 != 4);
                }
           } while (opcion1 != MENU_EXIT_OPTION);
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
        System.out.println("3. Cerrar sesión");
        System.out.println("4. Salir del menú de tipo de usuario");
        System.out.print("\nEscoja qué acción realizar: ");
    }

    //podría crear un menú para option, flow y chatbot en vez de tener todo en uno
    private void menuAdmi(){
        System.out.println("Menú de acciones para usuario administrador\n");
        System.out.println("1. Crear opción");
        System.out.println("2. Crear flujo");
        System.out.println("3. Crear Chatbot");
        System.out.println("4. Mostrar opciones ya creadas");
        System.out.println("5. Mostrar flujos ya creados");
        System.out.println("6. Mostrar Chatbots ya creados");
        System.out.println("7. Agregar una opción a un flujo");
        System.out.println("7. Agregar un flujo a un Chatbot");
    }

    private void bienvenida() {
        System.out.println("Bienvenido al sistema de chatbots");
    }

}