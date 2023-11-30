package Chatbot_21060190_CastilloPerez;
import java.util.List;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;

public class Chatbot_21060190_CastilloPerez {
    private int chatbotID;
    private String name;
    private String welcomeMessage;
    private int startFlowID;
    public List<Flow_21060190_CastilloPerez> flows;

    //RF4
    public Chatbot_21060190_CastilloPerez(int chatbotID, String name, String welcomeMessage, int startFlowID, List<Flow_21060190_CastilloPerez>flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = flows;
    }

    public int getChatbotID() {
        return chatbotID;
    }

    //RF5
    public void chatbotAddFlow(Flow_21060190_CastilloPerez flowAgregar) {
        int code = flowAgregar.getID();
        boolean existeID = false;

        for (Flow_21060190_CastilloPerez i : flows) {
            int code2 = i.getID(); // Código de los options ya agregados
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
