package Menu_21060190_CastilloPerez;
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

        //system con datos
        System_21060190_CastilloPerez system = CargaDatos.cargaDatos();
        //opción de salida
        int MENU_EXIT_OPTION = 4;

        //guardar opciones
        int opcion1;
        int opcion2;
        int opcion7;
        int opcion3;
        int opcion4;
        int opcion5;
        int opcion6;

        String usuarioNuevo;
        String usuarioNuevo2;

        boolean tipo;

        String userLogueado;
        String idOP;

        //flow

        int flowId;
        String nameMsgFlow;

        //option
        int codeOption;
        String messageOption;
        int chatbotCodeLink;
        int initialFlowCodeLink;
        ArrayList<String> keywords = new ArrayList<>();


        //chatbot
        int chatbotID;
        String nameChatbot;
        String welcomeMessageChatbot;
        int startFlowID;
        List<Flow_21060190_CastilloPerez> flows;

        Chatbot_21060190_CastilloPerez c4 = new Chatbot_21060190_CastilloPerez(10,"Chatbot vacio",null,0,new ArrayList<Flow_21060190_CastilloPerez>());
        Chatbot_21060190_CastilloPerez c5 = new Chatbot_21060190_CastilloPerez(11,"Chatbot vacio 2",null,0,new ArrayList<Flow_21060190_CastilloPerez>());
        Flow_21060190_CastilloPerez f4 = new Flow_21060190_CastilloPerez(10,"flow vacio",new ArrayList<Option_21060190_CastilloPerez>());
        Flow_21060190_CastilloPerez f5 = new Flow_21060190_CastilloPerez(11,"flow vacio 2",new ArrayList<Option_21060190_CastilloPerez>());
        Option_21060190_CastilloPerez op100 = new Option_21060190_CastilloPerez(10,"option vacio",10,11, keywords);
        Option_21060190_CastilloPerez op200 = new Option_21060190_CastilloPerez(11,"option vacio 2",11,10, keywords);

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
                    usuarioNuevo2 = usuarioNuevo.toLowerCase();
                    //obtengo el tipo de usuario
                    tipo = system.systemLogin(usuarioNuevo2);
                    userLogueado = system.getUserlog();

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
                                                    System.out.println("Para crear el chatbot 1 ingrese los datos en el orden que se le indica\n");
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
                                                    System.out.println("Chatbot creado: " + c4);
                                                    break;

                                                case 2:
                                                    System.out.println("En esta opcion se agrega el chatbot 1 anteriormente creado al sistema con datos prehechos\n");
                                                    system.systemAddChatbot(c4);
                                                    System.out.println("Sistema actual + el chatbot creado recientemente: " + system);
                                                    break;

                                                case 3:
                                                    System.out.println("Para crear el chatbot 2 ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el nombre del chatbot: ");
                                                    input.nextLine();
                                                    nameChatbot = input.nextLine();
                                                    c5.setName(nameChatbot);
                                                    System.out.println("Ingrese la ID del chatbot: ");
                                                    chatbotID = input.nextInt();
                                                    c5.setChatbotID(chatbotID);
                                                    System.out.println("Ingrese el welcomeMsg del chatbot: ");
                                                    input.nextLine();
                                                    welcomeMessageChatbot = input.nextLine();
                                                    c5.setWelcomeMessage(welcomeMessageChatbot);
                                                    System.out.println("Ingrese el startFlowId del chatbot: ");
                                                    startFlowID = input.nextInt();
                                                    c5.setStartFlowID(startFlowID);
                                                    System.out.println("Chatbot creado: " + c5);
                                                    break;

                                                case 4:
                                                    System.out.println("En esta opcion se agrega el chatbot 2 anteriormente creado al sistema con datos prehechos\n");
                                                    system.systemAddChatbot(c5);
                                                    System.out.println("Sistema actual + el chatbot creado recientemente: " + system);
                                                    break;
                                            }
                                        }while (opcion4 != 5);
                                    break;
                                    case 2:
                                        //flows
                                        do{
                                            menuFlow();
                                            opcion5 = input.nextInt();
                                            switch (opcion5){
                                                case 1:
                                                    System.out.println("Para crear el flow 1 ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el nombre del flow: ");
                                                    input.nextLine();
                                                    nameMsgFlow = input.nextLine();
                                                    f4.setNameMsg(nameMsgFlow);
                                                    System.out.println("Ingrese la ID del flow: ");
                                                    flowId = input.nextInt();
                                                    f4.setID(flowId);
                                                    System.out.println("Flow creado: " + f4);
                                                    break;

                                                case 2:
                                                    System.out.println("Para crear el flow 2 ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el nombre del flow: ");
                                                    input.nextLine();
                                                    nameMsgFlow = input.nextLine();
                                                    f5.setNameMsg(nameMsgFlow);
                                                    System.out.println("Ingrese la ID del flow: ");
                                                    flowId = input.nextInt();
                                                    f5.setID(flowId);
                                                    System.out.println("Flow creado: " + f5);
                                                    break;

                                                case 3:
                                                    c4.chatbotAddFlow(f4);
                                                    System.out.println("En esta opcion se agrega el flow 1 al chatbot 1 creado por usted anteriormente\n");
                                                    System.out.println("Chatbot + flow creado recientemente: " + c4);
                                                    break;

                                                case 4:
                                                    c5.chatbotAddFlow(f4);
                                                    System.out.println("En esta opcion se agrega el flow 1 al chatbot 2 creado por usted anteriormente\n");
                                                    System.out.println("Chatbot + flow creado recientemente: " + c5);
                                                    break;

                                                case 5:
                                                    c4.chatbotAddFlow(f5);
                                                    System.out.println("En esta opcion se agrega el flow 2 al chatbot 1 creado por usted anteriormente\n");
                                                    System.out.println("Chatbot + flow creado recientemente: " + c4);
                                                    break;

                                                case 6:
                                                    c5.chatbotAddFlow(f5);
                                                    System.out.println("En esta opcion se agrega el flow 2 al chatbot 2 creado por usted anteriormente\n");
                                                    System.out.println("Chatbot + flow creado recientemente: " + c5);
                                                    break;

                                            }
                                        }while(opcion5 != 7);


                                    case 3:
                                        //options
                                        do{
                                            menuOption();
                                            opcion6 = input.nextInt();
                                            switch (opcion6){
                                                case 1:
                                                    System.out.println("Para crear el option 1 ingrese los datos en el orden que se le indica\n");
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
                                                    System.out.println("En esta opcion se agrega el option 1 al flow 1 creado por usted anteriormente\n");
                                                    f4.flowAddOption(op100);
                                                    System.out.println("Flow + option creado recientemente: " + f4);
                                                    break;

                                                case 3:
                                                    System.out.println("En esta opcion se agrega el option 1 al flow 2 creado por usted anteriormente\n");
                                                    f5.flowAddOption(op100);
                                                    System.out.println("Flow + option creado recientemente: " + f5);
                                                    break;

                                                case 4:
                                                    System.out.println("Para crear el option 2 ingrese los datos en el orden que se le indica\n");
                                                    System.out.println("Ingrese el mensaje del option: ");
                                                    input.nextLine();
                                                    messageOption = input.nextLine();
                                                    op200.setMessage(messageOption);
                                                    System.out.println("Ingrese la ID del option: ");
                                                    codeOption = input.nextInt();
                                                    op200.setCode(codeOption);
                                                    System.out.println("Ingrese el chatbotCodeLink del option: ");
                                                    chatbotCodeLink = input.nextInt();
                                                    op200.setChatbotCodeLink(chatbotCodeLink);
                                                    System.out.println("Ingrese el initialFlowCodeLink del option: ");
                                                    initialFlowCodeLink = input.nextInt();
                                                    op200.setInitialFlowCodeLink(initialFlowCodeLink);
                                                    System.out.println("¿Cuantos keyword desea ingresar?: ");

                                                    int cantidadKey2 = input.nextInt();
                                                    input.nextLine();
                                                    int j = 1;
                                                    while(j <= cantidadKey2){
                                                        System.out.printf("Ingrese el keyword %d del option: ", j);
                                                        String keyword = input.nextLine();
                                                        op200.agregarKeyword(keyword);
                                                        j++;
                                                    }

                                                    System.out.println("Option creado: " + op200);
                                                    break;

                                                case 5:
                                                    System.out.println("En esta opcion se agrega el option 2 anteriormente creado al flow 1\n");
                                                    f4.flowAddOption(op200);
                                                    System.out.println("Flow + option creado recientemente: " + f4);
                                                    break;

                                                case 6:
                                                    System.out.println("En esta opcion se agrega el option 2 anteriormente creado al flow 2\n");
                                                    f5.flowAddOption(op200);
                                                    System.out.println("Flow + option creado recientemente: " + f5);
                                                    break;
                                            }
                                        }while(opcion6 != 7);


                                    case 4:
                                        system.systemTalk("0");
                                        input.nextLine();
                                        while (true) {
                                            System.out.println("Escriba el n° de la opción que desea o uno de sus keywords: ");
                                            idOP = input.nextLine();
                                            system.getChatHistory().append("Eligió la opción: ").append(idOP).append("\n").append("\n");

                                            if(system.obtenerIdOptionByKeyword(idOP) != -1 || system.esNumero(idOP)){
                                                system.setChatbotAndFlowActual(idOP);
                                                system.systemTalk(idOP);
                                                System.out.println("¿Desea continuar? (si/no): ");
                                                String continuar = input.nextLine();

                                                if (!continuar.equalsIgnoreCase("si")) {
                                                    system.getChatHistory().append("El usuario salió del menú de interacciones\n");
                                                    break;
                                                }
                                            }else{
                                                System.out.println("No existen ocurrencias de esa keyword, por favor intente otra vez\n");
                                            }
                                        }
                                        break;

                                    case 5:
                                        System.out.printf("El/la usuario %s tuvo las siguientes interacciones: \n\n", system.getUserLog());
                                        System.out.println(system.getChatHistory());
                                        break;
                                }
                            }while (opcion3 != 6);
                        }
                        if(!tipo){
                            do{
                                menuComun();
                                opcion7 = input.nextInt();
                                switch(opcion7){
                                    case 1:
                                        system.systemTalk("0");
                                        input.nextLine();
                                        // Ciclo principal
                                        while (true) {
                                            System.out.println("Escriba el n° de la opción que desea o uno de sus keywords: ");
                                            idOP = input.nextLine();
                                            system.getChatHistory().append("Eligió la opción: ").append(idOP).append("\n").append("\n");

                                            if(system.obtenerIdOptionByKeyword(idOP) != -1 || system.esNumero(idOP)){
                                                system.setChatbotAndFlowActual(idOP);
                                                system.systemTalk(idOP);
                                                System.out.println("¿Desea continuar? (si/no): ");
                                                String continuar = input.nextLine();

                                                if (!continuar.equalsIgnoreCase("si")) {
                                                    system.getChatHistory().append("El usuario salió del menú de interacciones\n");
                                                    break;
                                                }
                                            }else{
                                                System.out.println("No existen ocurrencias de esa keyword, por favor intente otra vez\n");
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.printf("El/la usuario %s tuvo las siguientes interacciones: \n\n", system.getUserLog());
                                        System.out.println(system.getChatHistory());
                                        break;
                                }
                            }while (opcion7 != 3);
                        }
                    }else{
                        System.out.printf("El usuario %s no esta registrado en el sistema, intentelo nuevamente\n",usuarioNuevo);
                    }
                break;
                case 2:
                    do {
                        menuTipoUsuario();
                        opcion2 = input.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese el nombre del usuario a registrar: ");
                                input.nextLine();
                                usuarioNuevo = input.nextLine();
                                User_21060190_CastilloPerez usuarioObj = new User_21060190_CastilloPerez(usuarioNuevo);
                                usuarioObj.setEsAdministrador(false);
                                boolean seAgregoUser = system.systemAddUser(usuarioObj);
                                if(!seAgregoUser){
                                    System.out.printf("Se agrego al usuario %s con exito\n", usuarioObj);
                                }else{
                                    System.out.println("El usuario ya existe en el sistema, intente con otro nombre\n");
                                }
                                break;


                            case 2:
                                System.out.println("Ingrese el nombre del usuario administrador a registrar: ");
                                input.nextLine();
                                usuarioNuevo = input.nextLine();
                                usuarioNuevo2 = usuarioNuevo.toLowerCase();
                                User_21060190_CastilloPerez usuarioObj2 = new User_21060190_CastilloPerez(usuarioNuevo2);
                                usuarioObj2.setEsAdministrador(true);
                                boolean seAgregoUser2 = system.systemAddUser(usuarioObj2);
                                if(!seAgregoUser2){
                                    System.out.printf("Se agrego al usuario %s con exito\n", usuarioObj2);
                                }else{
                                    System.out.println("El usuario ya existe en el sistema, intente con otro nombre\n");
                                }
                                break;

                            case 3:
                                System.out.println("Ha salido del menú usuario");
                                break;
                            default:
                                System.out.println("Ingrese una opción válida");
                        }
                    }while (opcion2 != 4);
                    break;
                case 3:
                    system.systemLogout();
                    if (system.getUserLog().equals("")){
                        System.out.println("Ha cerrado sesión exitosamente");
                    }
                    break;
                }
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

    private void menuAdmi(){
        System.out.println("Menú de acciones para usuario administrador por objeto\n");
        System.out.println("1. Chatbot");
        System.out.println("2. Flow");
        System.out.println("3. Option");
        System.out.println("4. Interactuar con los chatbots existentes");
        System.out.println("5. Historial de lo realizado");
        System.out.println("6. Volver al menú inicial");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void menuChatbot(){
        System.out.println("Menu chatbot\n");
        System.out.println("1. Crear chatbot 1");
        System.out.println("2. Agregar chatbot 1 al sistema");
        System.out.println("3. Crear chatbot 2");
        System.out.println("4. Agregar chatbot 2 al sistema");
        System.out.println("5. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }
    private void menuFlow(){
        System.out.println("Menu flow\n");
        System.out.println("1. Crear flow 1");
        System.out.println("2. Crear flow 2");
        System.out.println("3. Agregar flow 1 a chatbot 1");
        System.out.println("4. Agregar flow 1 a chatbot 2");
        System.out.println("5. Agregar flow 2 a chatbot 1");
        System.out.println("6. Agregar flow 2 a chatbot 2");
        System.out.println("7. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void menuOption(){
        System.out.println("Menu option\n");
        System.out.println("1. Crear option 1");
        System.out.println("2. Agregar option 1 a flow 1");
        System.out.println("3. Agregar option 1 a flow 2");
        System.out.println("4. Crear option 2");
        System.out.println("5. Agregar option 2 a flow 1");
        System.out.println("6. Agregar option 2 a flow 2");
        System.out.println("7. Volver al menú de acciones");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void menuComun(){
        System.out.println("Menu usuario común\n");
        System.out.println("1. Interactuar con chatbots");
        System.out.println("2. Historial de lo realizado");
        System.out.println("3. Volver al menú inicial");
        System.out.println("\nEscoja qué acción a realizar: ");
    }

    private void bienvenida() {
        System.out.println("Bienvenido al sistema de chatbots");
    }

}