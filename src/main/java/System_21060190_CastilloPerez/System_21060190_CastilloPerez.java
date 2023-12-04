package System_21060190_CastilloPerez;
import java.time.LocalDate;
import java.util.List;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;


public class System_21060190_CastilloPerez {
    private LocalDate fechaActual;
    private String name;
    private int InitialChatbotCodeLink;
    public List<Chatbot_21060190_CastilloPerez> chatbots;
    private String chatHistory;  //o un objeto, o todo en el mismo str
    public List <User_21060190_CastilloPerez> users;
    private String userLog;
    boolean isLog; //para recorrer lista y ver siun usuario está registrado para loguearse

    public System_21060190_CastilloPerez(List<User_21060190_CastilloPerez> users, String userLog,String name, int initialChatbotCodeLink, List<Chatbot_21060190_CastilloPerez> chatbots, String chatHistory) {
        this.fechaActual = LocalDate.now();
        this.name = name;
        this.InitialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.chatHistory = chatHistory;
        this.users = users;
        this.userLog = userLog;
    }

    public List<User_21060190_CastilloPerez> getUsers() {
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
  public void systemAddUser(User_21060190_CastilloPerez userAgregar) {
        // Convertir la entrada a minúsculas
        String userAgregarNew = userAgregar.toLowerCase();

        boolean existeID = false;

        for (User_21060190_CastilloPerez i : users) {
            //obtener usuarios ya registrados de la clase user
            String usuarioRegistrado = i.getUserName();
            if (userAgregarNew.equals(usuarioRegistrado)){
                existeID = true;
                //System.out.println("Ya existe ese usuario");
            }
        }

        if (!existeID) {
            boolean admi = userAgregar.isEsAdministrador();
            this.users.add(userAgregarNew, admi);
            //System.out.println("Se agregó con éxito");
        }
    }
/*
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
*/
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

