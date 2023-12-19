package Menu_21060190_CastilloPerez;

import System_21060190_CastilloPerez.System_21060190_CastilloPerez;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;
import java.util.ArrayList;
import java.util.Arrays;

public class CargaDatos {
    public static System_21060190_CastilloPerez cargaDatos() {
        //cambiar los Arrays.asList pq yo lo uso distinto (creo)

       //---CHATBOT INICIAL----
        Option_21060190_CastilloPerez op1 = new Option_21060190_CastilloPerez(1, "1) Viajar", 1, 1, Arrays.asList("viajar", "turistear", "conocer"));
        Option_21060190_CastilloPerez op2 = new Option_21060190_CastilloPerez(2, "2) Estudiar", 2, 1, Arrays.asList("estudiar", "aprender", "perfeccionarme"));

        //PROBAR QUE ESTE SOLO AGREGUE UNA OCURRIENCIA
        ArrayList<Option_21060190_CastilloPerez> optionList = new ArrayList<Option_21060190_CastilloPerez>(Arrays.asList(op1, op2));
        Flow_21060190_CastilloPerez f1 = new Flow_21060190_CastilloPerez(1, "Flujo Principal Chatbot inicial", optionList);
        ArrayList<Flow_21060190_CastilloPerez> flowList = new ArrayList<Flow_21060190_CastilloPerez>(Arrays.asList(f1));
        Chatbot_21060190_CastilloPerez cb0 = new Chatbot_21060190_CastilloPerez(0, "Chatbot inicial", "¿Qué te gustaría hacer?", 1, flowList);

       //----CHATBOT SIGUIENTES SEGÚN OP1 Y OP2
        Option_21060190_CastilloPerez op3 = new Option_21060190_CastilloPerez(1, "1) New York, USA", 1, 2, Arrays.asList("USA", "Estados Unidos", "New York"));
        Option_21060190_CastilloPerez op4 = new Option_21060190_CastilloPerez(2, "2) París, Francia", 1, 1, Arrays.asList("Paris", "Eiffel"));
        //esta opcion no tiene mas chatbots
        Option_21060190_CastilloPerez op5 = new Option_21060190_CastilloPerez(3, "3) Torres del Paine, Chile", 1, 1, Arrays.asList("Chile", "Torres", "Paine", "Torres Paine", "Torres del Paine"));
        Option_21060190_CastilloPerez op6 = new Option_21060190_CastilloPerez(4, "4) Volver", 0, 1, Arrays.asList("Regresar", "Salir", "Volver"));

        //chatbot opción usa
        Option_21060190_CastilloPerez op7 = new Option_21060190_CastilloPerez(1, "1) Central Park", 1, 2, Arrays.asList("Central", "Park", "Central Park"));
        Option_21060190_CastilloPerez op8 = new Option_21060190_CastilloPerez(2, "2) Museo Americano", 1, 1, Arrays.asList("Museo", "Antiguedades"));
        Option_21060190_CastilloPerez op9 = new Option_21060190_CastilloPerez(3, "3) Ningún otro atractivo", 1, 3, Arrays.asList("Ninguno"));
        Option_21060190_CastilloPerez op10 = new Option_21060190_CastilloPerez(4, "4) Cambiar destino", 1, 1, Arrays.asList("Cambiar", "Volver", "Salir"));

        Option_21060190_CastilloPerez op11 = new Option_21060190_CastilloPerez(1, "1) Solo", 1, 3, Arrays.asList("Solo"));
        Option_21060190_CastilloPerez op12 = new Option_21060190_CastilloPerez(2, "2) En pareja", 1, 3, Arrays.asList("Pareja"));
        Option_21060190_CastilloPerez op13 = new Option_21060190_CastilloPerez(3, "3) En familia", 1, 3, Arrays.asList("Familia"));
        Option_21060190_CastilloPerez op14 = new Option_21060190_CastilloPerez(4, "4) Agregar más atractivos", 1, 2, Arrays.asList("Volver", "Atractivos"));
        Option_21060190_CastilloPerez op15 = new Option_21060190_CastilloPerez(5, "5) En realidad quiero otro destino", 1, 1, Arrays.asList("Cambiar destino"));

        ArrayList<Option_21060190_CastilloPerez> optionList1 = new ArrayList<Option_21060190_CastilloPerez>(Arrays.asList(op3, op4, op5, op6));
        Flow_21060190_CastilloPerez f20 = new Flow_21060190_CastilloPerez(1, "Flujo 1 Chatbot 1\n¿Dónde te Gustaría ir?", optionList1);
        ArrayList<Option_21060190_CastilloPerez> optionList2 = new ArrayList<Option_21060190_CastilloPerez>(Arrays.asList(op7, op8, op9, op10));
        Flow_21060190_CastilloPerez f21 = new Flow_21060190_CastilloPerez(2, "Flujo 2 Chatbot 1\n¿Qué atractivos te gustaría visitar?", optionList2);
        ArrayList<Option_21060190_CastilloPerez> optionList3 = new ArrayList<Option_21060190_CastilloPerez>(Arrays.asList(op11, op12, op13, op14, op15));
        Flow_21060190_CastilloPerez f22 = new Flow_21060190_CastilloPerez(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", optionList3);
        ArrayList<Flow_21060190_CastilloPerez> flowList1 = new ArrayList<Flow_21060190_CastilloPerez>(Arrays.asList(f20, f21, f22));
        Chatbot_21060190_CastilloPerez cb1 = new Chatbot_21060190_CastilloPerez(1, "Agencia Viajes", "Bienvenido\n¿Dónde quieres viajar?", 1, flowList1);
        Option_21060190_CastilloPerez op16 = new Option_21060190_CastilloPerez(1, "1) Carrera Técnica", 2, 1, Arrays.asList("Técnica"));
        Option_21060190_CastilloPerez op17 = new Option_21060190_CastilloPerez(2, "2) Postgrado", 2, 1, Arrays.asList("Doctorado", "Magister", "Postgrado"));
        Option_21060190_CastilloPerez op18 = new Option_21060190_CastilloPerez(3, "3) Volver", 0, 1, Arrays.asList("Volver", "Salir", "Regresar"));
        ArrayList<Option_21060190_CastilloPerez> optionList4 = new ArrayList<Option_21060190_CastilloPerez>(Arrays.asList(op16, op17, op18));
        Flow_21060190_CastilloPerez f3 = new Flow_21060190_CastilloPerez(1, "Flujo 1 Chatbot 2\n¿Qué te gustaría estudiar?", optionList4);
        ArrayList<Flow_21060190_CastilloPerez> flowList2 = new ArrayList<Flow_21060190_CastilloPerez>(Arrays.asList(f3));
        Chatbot_21060190_CastilloPerez cb2 = new Chatbot_21060190_CastilloPerez(2, "Orientador Académico", "Bienvenido\n¿Qué te gustaría estudiar?", 1, flowList2);
        ArrayList<Chatbot_21060190_CastilloPerez> chatbots = new ArrayList<>(Arrays.asList(cb0, cb1, cb2));
        System_21060190_CastilloPerez system = new System_21060190_CastilloPerez("Chatbots Paradigmas", 0, chatbots);
        User_21060190_CastilloPerez user1 = new User_21060190_CastilloPerez("user1");
        user1.setEsAdministrador(false);
        User_21060190_CastilloPerez user2 = new User_21060190_CastilloPerez("User2");
        user2.setEsAdministrador(true);
        User_21060190_CastilloPerez user3 = new User_21060190_CastilloPerez("User3");
        user3.setEsAdministrador(true);
        system.systemAddUser(user1);
        system.systemAddUser(user2);
        system.systemAddUser(user3);
        return system;
    }
}