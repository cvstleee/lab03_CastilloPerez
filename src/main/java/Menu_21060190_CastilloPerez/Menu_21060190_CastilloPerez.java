package Menu_21060190_CastilloPerez;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;
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
        int MENU_EXIT_OPTION = 4;

        //guardar opciones
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;
        int opcion6;

        String usuarioNuevo;
        String usuarioNuevo2;

        boolean tipo;

        String userLogueado;
        String idOP;

        //flow stuff

        int flowId;
        String nameMsgFlow;

        //option stuff
        int codeOption;
        String messageOption;
        int chatbotCodeLink;
        int initialFlowCodeLink;
        ArrayList<String> keywords = new ArrayList<>();


        //chatbot stuff
        int chatbotID;
        String nameChatbot;
        String welcomeMessageChatbot;
        int startFlowID;
        List<Flow_21060190_CastilloPerez> flows;

        Chatbot_21060190_CastilloPerez c4 = new Chatbot_21060190_CastilloPerez(0,"Chatbot vacio",null,0,new ArrayList<Flow_21060190_CastilloPerez>());
        Flow_21060190_CastilloPerez f4 = new Flow_21060190_CastilloPerez(0,"flow vacio",new ArrayList<Option_21060190_CastilloPerez>());
        Option_21060190_CastilloPerez op100 = new Option_21060190_CastilloPerez(0,"option vacio",0,0, keywords);

        do {
            printMenu();
            //variable que guarda la primera opción escogida
            opcion1 = input.nextInt();

            switch (opcion1) {
                //caso de la opción 1 del menú 1, login
                case 1:
                    System.out.println("Ingrese el nombre del usuario que desea iniciar sesión: ");
                    input.nextLine();
                    usuarioNuevo = input.nextLine();
                    //verificar aquí si existe el usuario
                    usuarioNuevo2 = usuarioNuevo.toLowerCase();
                    //obtengo el tipo de usuario
                    tipo = s2.systemLogin(usuarioNuevo2);
                    userLogueado = s2.getUserlog();

                    //si se logró loguear un usuario
                    if(!(userLogueado.equals(""))){
                        if (tipo){
                            do {
                                menuAdmi();
                                opcion3 = input.nextInt();

                                switch (opcion3){
                                    //chatbots, otro menú
                                    case 1:
                                        do{
                                            menuChatbot();
                                            opcion4 = input.nextInt();

                                            switch (opcion4){
                                                case 1:
                                                    System.out.println("Para crear un chatbot ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el nombre del chatbot: ");
                                                    input.nextLine();
                                                    nameChatbot = input.nextLine();
                                                    c4.setName(nameChatbot);
                                                    System.out.println("Ingrese la ID del chatbot: ");
                                                    chatbotID = input.nextInt();
                                                    c4.setChatbotID(chatbotID);
                                                    System.out.println("Ingrese el welcomeMsg del chatbot: ");
                                                    input.nextLine();
                                                    welcomeMessageChatbot = input.nextLine();
                                                    c4.setWelcomeMessage(welcomeMessageChatbot);
                                                    System.out.println("Ingrese el startFlowId del chatbot: ");
                                                    startFlowID = input.nextInt();
                                                    c4.setStartFlowID(startFlowID);
                                                    c4.chatbotAddFlow(f4);
                                                    System.out.println("Chatbot creado: " + c4);
                                                    break;

                                                case 2:
                                                    System.out.println("En esta opcion se agrega el chatbot anteriormente creado al sistema con datos prehechos\n");
                                                    s2.systemAddChatbot(c4);
                                                    System.out.println("Sistema actual + el chatbot creado recientemente: " + s2);
                                                    break;
                                            }
                                        }while (opcion4 != 3); //con esto vuelve al inicial

                                    case 2:
                                        //flows, otro menú
                                        do{
                                            menuFlow();
                                            opcion5 = input.nextInt();
                                            switch (opcion5){
                                                case 1:
                                                    System.out.println("Para crear un flow ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el nombre del flow: ");
                                                    input.nextLine();
                                                    nameMsgFlow = input.nextLine();
                                                    f4.setNameMsg(nameMsgFlow);
                                                    System.out.println("Ingrese la ID del flow: ");
                                                    flowId = input.nextInt();
                                                    f4.setID(flowId);
                                                    f4.flowAddOption(op100);
                                                    System.out.println("Flow creado: " + f4);
                                                    break;

                                                case 2:
                                                    c4.chatbotAddFlow(f4);
                                                    System.out.println("En esta opcion se agrega el flow anteriormente creado al chatbot creado por usted anteriormente\n");
                                                    System.out.println("Chatbot + flow creado recientemente: " + c4);
                                                    break;
                                            }
                                        }while(opcion5 != 3);


                                    case 3:
                                        //options, otro menú
                                        do{
                                            menuOption();
                                            opcion6 = input.nextInt();
                                            switch (opcion6){
                                                case 1:
                                                    System.out.println("Para crear un option ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el mensaje del option: ");
                                                    input.nextLine();
                                                    messageOption = input.nextLine();
                                                    op100.setMessage(messageOption);
                                                    System.out.println("Ingrese la ID del option: ");
                                                    codeOption = input.nextInt();
                                                    op100.setCode(codeOption);
                                                    System.out.println("Ingrese el chatbotCodeLink del option: ");
                                                    chatbotCodeLink = input.nextInt();
                                                    op100.setChatbotCodeLink(chatbotCodeLink);
                                                    System.out.println("Ingrese el initialFlowCodeLink del option: ");
                                                    initialFlowCodeLink = input.nextInt();
                                                    op100.setInitialFlowCodeLink(initialFlowCodeLink);
                                                    System.out.println("¿Cuantos keyword desea ingresar?: ");

                                                    int cantidadKey = input.nextInt();
                                                    input.nextLine();
                                                    int i = 1;
                                                    while(i <= cantidadKey){
                                                        System.out.printf("Ingrese el keyword %d del option: ", i);
                                                        String keyword = input.nextLine();
                                                        op100.agregarKeyword(keyword);
                                                        i++;
                                                    }

                                                    System.out.println("Option creado: " + op100);
                                                    break;

                                                case 2:
                                                    System.out.println("En esta opcion se agrega el option anteriormente creado al flow por usted anteriormente\n");
                                                    f4.flowAddOption(op100);
                                                    System.out.println("Flow + option creado recientemente: " + f4);
                                                    break;
                                            }
                                        }while(opcion6 != 3);
                                }
                            }while (opcion3 != MENU_EXIT_OPTION);
                        }
                        if(!tipo){
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

                    }else{
                        System.out.printf("El usuario %s no esta registrado en el sistema, intentelo nuevamente\n",usuarioNuevo);
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
                                System.out.println("Ha salido del menú usuario");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                        }
                    }while (opcion2 != 3);
                case 3:
                    s1.systemLogout();
                    if (s2.getUserLog().equals("")){
                        System.out.println("Ha cerrado sesión exitosamente");
                    }
                    break;
                }break;
           } while (opcion1 != MENU_EXIT_OPTION);
    }

    private void printMenu() {
        System.out.println("Menú inicial\n");
        System.out.print("1. Iniciar sesión \n");
        System.out.print("2. Registrarse \n");
        System.out.println("3. Cerrar sesión");
        System.out.println("4. Salir del menú\n");
        System.out.print("\nEscoja con qué interactuar: ");
    }

    private void menuTipoUsuario() {
        System.out.println("Menú de registro de usuarios\n");
        System.out.println("1. Usuario normal");
        System.out.println("2. Usuario administrador");
        System.out.println("3. Salir del menú de tipo de usuario");
        System.out.print("\nEscoja qué acción realizar: ");
    }

    //podría crear un menú para option, flow y chatbot en vez de tener todo en uno
    private void menuAdmi(){
        System.out.println("Menú de acciones para usuario administrador por objeto\n");
        System.out.println("1. Chatbot");
        System.out.println("2. Flow");
        System.out.println("3. Option");
        System.out.println("4. Volver al menú inicial");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void menuChatbot(){
        System.out.println("Menu chatbot\n");
        System.out.println("1. Crear un chatbot");
        System.out.println("2. Agregar un chatbot al sistema");
        System.out.println("3. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }
    private void menuFlow(){
        System.out.println("Menu flow\n");
        System.out.println("1. Crear un flow");
        System.out.println("2. Agregar un flow a un chatbot");
        System.out.println("3. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void menuOption(){
        System.out.println("Menu option\n");
        System.out.println("1. Crear un option");
        System.out.println("2. Agregar un option a un flow");
        System.out.println("3. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void bienvenida() {
        System.out.println("Bienvenido al sistema de chatbots");
    }

}