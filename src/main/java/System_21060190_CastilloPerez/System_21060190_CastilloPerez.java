package System_21060190_CastilloPerez;
import java.time.LocalDate;
import java.util.List;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;


public class System_21060190_CastilloPerez {
    private LocalDate fechaActual;
    private String name;
    private int InitialChatbotCodeLink;
    public List<Chatbot_21060190_CastilloPerez> chatbots;
    private String chatHistory;  //o un objeto, o todo en el mismo str
    public List <String> users; //ver como lo hago con el tda users
    private String userLog;
    boolean isLog; //para recorrer lista y ver siun usuario está registrado para loguearse

    public System_21060190_CastilloPerez(List<String> users, String userLog,String name, int initialChatbotCodeLink, List<Chatbot_21060190_CastilloPerez> chatbots, String chatHistory) {
        this.fechaActual = LocalDate.now();
        this.name = name;
        this.InitialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.chatHistory = chatHistory;
        this.users = users;
        this.userLog = userLog;
    }

    public List<String> getUsers() {
        return users;
    }

    public String getUserLog() {
        return userLog;
    }

    //RF8
    public void systemAddChatbot(Chatbot_21060190_CastilloPerez chatbotAgregar){
        int code = chatbotAgregar.getChatbotID();
        boolean existeID = false;

        for (Chatbot_21060190_CastilloPerez i : chatbots) {
            int code2 = i.getChatbotID(); // Código de los options ya agregados
            if (code == code2) {
                existeID = true;
                //System.out.println("Ya existe ese option");
            }
        }

        if (!existeID) {
            this.chatbots.add(chatbotAgregar);
            //System.out.println("Se agregó con éxito");
        }
    }

    //RF9
    public void systemAddUser(String userAgregar) {
        // Convertir la entrada a minúsculas
        String userAgregarNew = userAgregar.toLowerCase();

        boolean existeID = false;

        for (String i : users) {
            if (userAgregarNew.equals(i)){
                existeID = true;
                //System.out.println("Ya existe ese usuario");
            }
        }

        if (!existeID) {
            this.users.add(userAgregarNew);
            //System.out.println("Se agregó con éxito");
        }
    }

    //RF10
    public boolean systemLogin(String userName){
        String userNameNew = userName.toLowerCase();
        String user = getUserLog();
        String userVacio = "";
        if(user.equals(userVacio)){
            for(String i: users) {
                if (userNameNew.equals(i)) {
                    this.userLog = userNameNew;
                    return true;
                }
            }
        }return false;
    }

    //RF11
    public void systemLogout(){
        this.userLog = "";
    }

    @Override
    public String toString() {
        return "System_21060190_CastilloPerez{" +
                "fechaActual=" + fechaActual +
                ", name='" + name + '\'' +
                ", InitialChatbotCodeLink=" + InitialChatbotCodeLink +
                ", chatbots=" + chatbots +
                ", chatHistory='" + chatHistory + '\'' +
                ", users=" + users +
                ", userLog='" + userLog + '\'' +
                ", isLog=" + isLog +
                '}';
    }
}

