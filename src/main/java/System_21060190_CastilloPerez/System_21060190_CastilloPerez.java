package System_21060190_CastilloPerez;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;


public class System_21060190_CastilloPerez implements SystemInterface_21060190_CastilloPerez {
    /**
     * fecha actual del sistema
     */
    private LocalDate fechaActual;
    /**
     * nombre del sistema
     */
    private String name;
    /**
     * código del chatbot inicial
     */
    private int InitialChatbotCodeLink;
    /**
     * lista de chatbots del sistema
     */
    public List<Chatbot_21060190_CastilloPerez> chatbots;
    /**
     * historial de la interacción de un usuario
     */
    private String chatHistory;
    /**
     * lista de usuarios dentro de un sistema
     */
    public List <User_21060190_CastilloPerez> users;
    /**
     * usuario con la sesión iniciada
     */
    private String userLog;

    /**
     * Instancia/constructor de un sistema
     * @param name nombre del sistema
     * @param initialChatbotCodeLink código del chatbot inicial del sistema
     * @param chatbots lista de chatbots del sistema
     */
    public System_21060190_CastilloPerez(String name, int initialChatbotCodeLink, List<Chatbot_21060190_CastilloPerez> chatbots) {
        this.fechaActual = LocalDate.now();
        this.name = name;
        this.InitialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.users = new ArrayList<User_21060190_CastilloPerez>();
        this.userLog = "";
    }

    /**
     * Obtiene los usuarios del sistema
     * @return users
     */
    public List<User_21060190_CastilloPerez> getUsers() {
        return users;
    }

    /**
     * Obtiene el usuario logueado del sistema
     * @return userLog
     */

    public String getUserLog() {
        return userLog;
    }

    /**
     * Por alguna razón el menú en la parte del log in no reconoce el get anterior, pero si este
     * */
    public String getUserlog() {
        return userLog;
    }

    /**
     * Obtiene el código del chatbot inicial del sistema
     * @return InitialChatbotCodeLink
     */
    public int getInitialChatbotCodeLink() {
        return InitialChatbotCodeLink;
    }

    /**
     * Obtiene los chatbots del sistema
     * @return chatbots
     */
    public List<Chatbot_21060190_CastilloPerez> getChatbots() {
        return chatbots;
    }

    /**
     * Obtiene cierto chatbot del sistema, según su id, para así imprimirlo en el menú
     * @param id id del chatbot a buscar
     * @param sys sistema donde buscarlo
     * @return chatbot
     */
    public Chatbot_21060190_CastilloPerez obtenerChatbot(int id, System_21060190_CastilloPerez sys){
        //obtengo todos los chatbots del sistema
        List<Chatbot_21060190_CastilloPerez> chatbots = sys.getChatbots();
        for(Chatbot_21060190_CastilloPerez i: chatbots){
            int idObtenido = i.getChatbotID();
            if(idObtenido == id){
                return i;
            }
        }return null;
    }

    /**
     * Agrega un chatbot a cierto sistema
     * @param chatbotAgregar chatbot que se quiere agregar
     */
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

    /**
     * Agrega un usuario al sistema
     * @param userAgregar usuario que se quiere agregar
     */
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


    /**
     * Hace que un usuario inicie sesión
     * @param userName usuario que quiere iniciar sesión
     * @return true o false para usar el tipo de usuario en el menú
     */
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
                    System.out.printf("¿Es administrador?: %b\n", tipo);
                    System.out.printf("Bienvenido/a %s\n", userNameNew);
                }
            }
        } return tipo;
    }

    /**
     * Cierra la sesión del usuario
     */
    //RF11
    public void systemLogout(){
        this.userLog = "";
    }


    /**
     * Permite al usuario común interactuar con los chatbots
     * @param mensaje mensaje inicial, puede ser una id o keyword
     */
    //mensaje puede ser int o string, si es int hay que pasarlo a int en la función
    public void systemTalk(String mensaje){
        if(esNumero(mensaje)){
          //necesito chatbotcode link para igualarlo al id de algún chatbot
        }
    }

    /**
     * función que me confirma si un str es número o no
     * @param cadenaCaracteres mensaje que se quiere comprobar
     * @return true o false
     */
    public static boolean esNumero(String cadenaCaracteres){
        for(char caracter : cadenaCaracteres.toCharArray()){
            if(Character.isDigit(caracter)){
                return true;
            }
        }return false;
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

