package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Menu_21060190_CastilloPerez.Menu_21060190_CastilloPerez;
import Menu_21060190_CastilloPerez.CargaDatos;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;
import Menu_21060190_CastilloPerez.Menu_21060190_CastilloPerez;

public class Main {
    public static void main(String[] args){
        CargaDatos.cargaDatos();
        //carga datos
       /* Option_21060190_CastilloPerez op1 = new Option_21060190_CastilloPerez(1, "Mensaje", 2, 3, new ArrayList<String>());
        Option_21060190_CastilloPerez op2 = new Option_21060190_CastilloPerez(2,"Opción 2",3,5,new ArrayList<String>());
        Flow_21060190_CastilloPerez flow1 = new Flow_21060190_CastilloPerez(1,"Flujo 1", new ArrayList<Option_21060190_CastilloPerez>());
        Flow_21060190_CastilloPerez flow2 = new Flow_21060190_CastilloPerez(2,"Flujo 2", new ArrayList<Option_21060190_CastilloPerez>());
        flow1.flowAddOption(op1);
        //flow1.option.add(op2);
        flow1.flowAddOption(op2);
        flow2.flowAddOption(op2);
        int valorCode = op1.getCode();
        //List<Option_21060190_CastilloPerez> op2 = flow1.getOption();
        Chatbot_21060190_CastilloPerez c1 = new Chatbot_21060190_CastilloPerez(1,"Chatbot 1", "Bienvenidx",2,new ArrayList<Flow_21060190_CastilloPerez>());
        System_21060190_CastilloPerez s1 = new System_21060190_CastilloPerez("Sistema Nuevo", 1,new ArrayList<Chatbot_21060190_CastilloPerez>());
        c1.chatbotAddFlow(flow1);
        c1.chatbotAddFlow(flow2);
        s1.systemAddChatbot(c1);

        User_21060190_CastilloPerez user1 = new User_21060190_CastilloPerez("user1");
        user1.setEsAdministrador(false);
        System.out.println(user1);
        //s1.users.add(user1);
        User_21060190_CastilloPerez user2 = new User_21060190_CastilloPerez("User2");
        user2.setEsAdministrador(true);
        //s1.getUserName();
        s1.systemAddUser(user1);
        s1.systemAddUser(user2);
        s1.systemLogin("usEr2");
        s1.systemLogin("user1");
        //s1.systemLogout();
        //Scanner menu = new Menu_21060190_CastilloPerez(s1); y hacer un constructor en el menú
        System.out.println(s1); */

        Menu_21060190_CastilloPerez menu = new Menu_21060190_CastilloPerez();
        menu.start();

        /*String prueba = "aaaaa";

        boolean ojo = false;

        ojo = System_21060190_CastilloPerez.esNumero(prueba);

        System.out.println(ojo); */

        /*List <Chatbot_21060190_CastilloPerez> chatbotInicial = new ArrayList<>();
        //en video 4 min 11 muestra la carga completa
        system_21060190_CastilloPerez miSistema = new system_21060190_CastilloPerez("Sistema 1", 0, chatbotInicial,);
        */
    }
}
