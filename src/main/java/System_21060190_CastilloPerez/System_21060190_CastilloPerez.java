package System_21060190_CastilloPerez;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
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

    public System_21060190_CastilloPerez(String name, int initialChatbotCodeLink, List<Chatbot_21060190_CastilloPerez> chatbots) {
        this.fechaActual = LocalDate.now();
        this.name = name;
        this.InitialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.users = new ArrayList<User_21060190_CastilloPerez>();
        this.userLog = "";
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
        boolean existeUser = false;
        //obtengo el nombre del usuario que se desea agregar
        String usuarioPorAgregar = userAgregar.getUserName();

        //esta parte me está quebrando el programa aaaaa
        for (User_21060190_CastilloPerez i : users) {
            //obtener usuarios ya registrados de la clase user
            String usuarioRegistrado = i.getUserName();
            if (usuarioPorAgregar.equals(usuarioRegistrado)){
                existeUser = true;
                //System.out.println("Ya existe ese usuario");
            }
        }

        if (!existeUser) {
            this.users.add(userAgregar);
            //System.out.println("Se agregó con éxito");
        }
    }

    //RF10
    public boolean systemLogin(String userName){
        boolean tipo = false;
        String userNameNew = userName.toLowerCase();
        String user = getUserLog();
        String userVacio = "";
        if(user.equals(userVacio)){
            for(User_21060190_CastilloPerez i: users) {
                String usuarioRegistrado = i.getUserName();
                if (userNameNew.equals(usuarioRegistrado)) {
                    this.userLog = userNameNew;
                    tipo = i.isEsAdministrador();
                    System.out.printf("Tipo de usuario: %b\n", tipo);
                }
            }
        } return tipo;
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
                '}';
    }
}

