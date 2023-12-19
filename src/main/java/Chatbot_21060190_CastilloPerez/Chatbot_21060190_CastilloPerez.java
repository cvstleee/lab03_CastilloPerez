package Chatbot_21060190_CastilloPerez;
import java.util.List;
import java.util.concurrent.Flow;

import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;

public class Chatbot_21060190_CastilloPerez implements ChatbotInterface_21060190_CastilloPerez {
    /**
     * ID del chatbot
     */
    private int chatbotID;
    /**
     * nombre del chatbot
     */
    private String name;
    /**
     * mensaje de bienvenida del chatbot
     */
    private String welcomeMessage;
    /**
     * código del flow inicial
     */
    private int startFlowID;
    /**
     * lista de flows
     */
    private List<Flow_21060190_CastilloPerez> flows;

    /**
     * Instancia/constructor del chatbot
     * @param chatbotID Id del chatbot
     * @param name nombre del chatbot
     * @param welcomeMessage mensaje de bienvenida del chatbot
     * @param startFlowID código del flow inicial
     * @param flows lista de flows
     */
    public Chatbot_21060190_CastilloPerez(int chatbotID, String name, String welcomeMessage, int startFlowID, List<Flow_21060190_CastilloPerez>flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = flows;
    }

    /**
     * Obtiene la ID del chatbot
     * @return chatbotID
     */
    public int getChatbotID() {
        return chatbotID;
    }

    /**
     * Obtiene el startFlowID del chatbot
     * @return startFlowID
     */
    public int getStartFlowID() {
        return startFlowID;
    }


    /**
     * Obtiene el nombre del chatbot
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el mensaje de bienvenida del chatbot
     * @return welcomeMessage
     */
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Obtiene la lista de flows del chatbot
     * @return flows
     */
    public List<Flow_21060190_CastilloPerez> getFlows() {
        return flows;
    }

    /**
     * Cambia el nombre del chatbot
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Cambia el ID del chatbot
     * @param chatbotID
     */
    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    /**
     * Cambia el welcomeMessage del chatbot
     * @param welcomeMessage
     */
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    /**
     * Cambia el startFlowID del chatbot
     * @param startFlowID
     */
    public void setStartFlowID(int startFlowID) {
        this.startFlowID = startFlowID;
    }


    /**
     * Obtiene el flow de cierto chatbot que coincida con una ID
     * @param id Id del flow que se desea obtener del chatbot
     * @return flow o null en caso de no existir
     */
    public Flow_21060190_CastilloPerez obtenerFlow(int id){
        //obtengo todos los flows de ese chatbot en la 2da entrada
        List<Flow_21060190_CastilloPerez> flowsChatbot = getFlows();
        for(Flow_21060190_CastilloPerez i: flowsChatbot){
            int idObtenido = i.getID();
            if(idObtenido == id){
                return i;
            }
        }return null;
    }


    /**
     * Agrega un flow a un chatbot
     * @param flowAgregar flow que se quiere agregar
     */
    public void chatbotAddFlow(Flow_21060190_CastilloPerez flowAgregar) {
        int code = flowAgregar.getID();
        boolean existeID = false;

        for (Flow_21060190_CastilloPerez i : flows) {
            int code2 = i.getID();
            if (code == code2) {
                existeID = true;
                //System.out.println("Ya existe ese option");
            }
        }

        if (!existeID) {
            this.flows.add(flowAgregar);
            //System.out.println("Se agregó con éxito");
        }
    }

    @Override
    public String toString() {
        return "Chatbot_21060190_CastilloPerez{" +
                "chatbotID=" + chatbotID +
                ", name='" + name + '\'' +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                ", startFlowID=" + startFlowID +
                ", flows=" + flows +
                '}';
    }
}
