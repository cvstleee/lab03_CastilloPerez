package System_21060190_CastilloPerez;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;
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
    private StringBuilder chatHistory;
    /**
     * lista de usuarios dentro de un sistema
     */
    public List <User_21060190_CastilloPerez> users;
    /**
     * usuario con la sesión iniciada
     */
    private String userLog;


    /**
     * id del chatbot actual del sistema
     */
    private int chatbotActual;
    /**
     * id del flow actual del sistema
     */
    private int flowActual;

    /**
     * id del chatbot anterior
     */
    private int chatbotAnterior;
    /**
     * id del flow anterior
     */
    private int flowAnterior;

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
        this.chatbotActual = 0;
        this.flowActual = 0;
        this.chatHistory = new StringBuilder();
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
     * Obtiene el chatHistory del sistema
     * @return chatHistory
     */
    public StringBuilder getChatHistory() {
        return chatHistory;
    }

    /**
     * Obtiene el id del chatbot actual
     * @return id
     */
    public int getChatbotActual() {
        return chatbotActual;
    }

    /**
     * Cambia el id del chatbot actual
     * @return nada
     */
    public void setChatbotActual(int chatbotActual) {
        this.chatbotActual = chatbotActual;
    }

    /**
     * Obtiene el id del flow actual
     * @return id
     */
    public int getFlowActual() {
        return flowActual;
    }

    /**
     * Cambia el id del flow actual
     * @return nada
     */
    public void setFlowActual(int flowActual) {
        this.flowActual = flowActual;
    }

    /**
     * Obtiene cierto chatbot del sistema, según su id, para así imprimirlo en el menú
     * @param id id del chatbot a buscar
     * @return chatbot
     */
    public Chatbot_21060190_CastilloPerez obtenerChatbot(int id){
        //obtengo todos los chatbots del sistema
        List<Chatbot_21060190_CastilloPerez> chatbots = getChatbots();
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
     *
     * @param userAgregar usuario que se quiere agregar
     * @return true si ya existe en el sistema y false si no y lo agrega
     */
  public boolean systemAddUser(User_21060190_CastilloPerez userAgregar) {
      boolean existeUser = false;
      //obtengo el nombre del usuario que se desea agregar
      String usuarioPorAgregar = userAgregar.getUserName();
      for (User_21060190_CastilloPerez i : users) {
          //obtener usuarios ya registrados de la clase user
          String usuarioRegistrado = i.getUserName();
          if (usuarioPorAgregar.equals(usuarioRegistrado)) {
              existeUser = true;
              return existeUser;
              //System.out.println("Ya existe ese usuario en el sistema, intente con otro nombre\n");
          }
      }

      if (!existeUser) {
          this.users.add(userAgregar);
          //System.out.println("Se agrego con exito al sistema\n");
      }return existeUser;
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
    public void systemLogout(){
        this.userLog = "";
    }


    /**
     * Cambia el chatbot y flow actual del sistema
     * @param idOptionEscogido int de la opción escogida para buscar el chatbot y flow actuales
     */
    public void setChatbotAndFlowActual(String idOptionEscogido) {
        int idOption;
        if(esNumero(idOptionEscogido)){
            idOption = Integer.parseInt(idOptionEscogido);
        }else{
            idOption = obtenerIdOptionByKeyword(idOptionEscogido);
        }
        if(idOption != -1){
            chatbotAnterior = getChatbotActual();
            Chatbot_21060190_CastilloPerez chAux = obtenerChatbot(getChatbotActual());
            flowAnterior = getFlowActual();
            Flow_21060190_CastilloPerez flowAux = chAux.obtenerFlow(getFlowActual());
            Option_21060190_CastilloPerez opAux = flowAux.obtenerOption(idOption);
            setChatbotActual(opAux.getChatbotCodeLink());
            setFlowActual(opAux.getInitialFlowCodeLink());
        }
    }

    /**
     * Obtiene la id del option que contiene a cierta keyword
     * @param keyword keyword que se desea buscar
     * @return devuelve la id si lo encuentra y un -1 si no existe
     */
    public int obtenerIdOptionByKeyword(String keyword){
        chatbotAnterior = getChatbotActual();
        Chatbot_21060190_CastilloPerez chAux = obtenerChatbot(getChatbotActual());
        flowAnterior = getFlowActual();
        Flow_21060190_CastilloPerez flowAux = chAux.obtenerFlow(getFlowActual());

        for (Option_21060190_CastilloPerez option : flowAux.getOption()) {
            for (String optionKeyword : option.getKeywords()) {
                if (optionKeyword.equalsIgnoreCase(keyword)) {
                    return option.getCode();
                }else{
                    return -1;
                }
            }
        }return -1;
    }


    /**
     * Permite al usuario común interactuar con los chatbots
     * @param mensaje mensaje inicial, puede ser una id o keyword
     */
    public void systemTalk(String mensaje){
        if(esNumero(mensaje)){
            int idOption = Integer.parseInt(mensaje);
            //chatbot inicial
            if(idOption == getInitialChatbotCodeLink()){
                Chatbot_21060190_CastilloPerez chatbotAux = obtenerChatbot(idOption);
                setChatbotActual(chatbotAux.getChatbotID());
                System.out.println(chatbotAux.getName());
                chatHistory.append(chatbotAux.getName()).append("\n");
                Flow_21060190_CastilloPerez flowAux = chatbotAux.obtenerFlow(chatbotAux.getStartFlowID());
                setFlowActual(flowAux.getID());
                System.out.println(flowAux.getNameMsg());
                chatHistory.append(flowAux.getNameMsg()).append("\n");
                System.out.println(chatbotAux.getWelcomeMessage());
                chatHistory.append(chatbotAux.getWelcomeMessage()).append("\n");
                //menú inicial
                flowAux.printOptions(flowAux, chatHistory);
            }else {
                if(flowAnterior == flowActual && chatbotAnterior == chatbotActual) {
                    System.out.println("No existen más opciones, por favor volver al menú del usuario ingresando 'no' a la consola");
                }else {
                    Chatbot_21060190_CastilloPerez chatbotAux = obtenerChatbot(getChatbotActual());
                    System.out.println(chatbotAux.getName());
                    chatHistory.append(chatbotAux.getName()).append("\n");
                    Flow_21060190_CastilloPerez flowAux = chatbotAux.obtenerFlow(getFlowActual());
                    System.out.println(flowAux.getNameMsg());
                    chatHistory.append(flowAux.getNameMsg()).append("\n");
                    flowAux.printOptions(flowAux, chatHistory);
                    System.out.println("Ingrese la opcion que desea: ");
                }
            }
        }else{
            if(flowAnterior == flowActual && chatbotAnterior == chatbotActual) {
                System.out.println("No existen más opciones, por favor volver al menú inicial ingresando 'no' a la consola");
            }else {
                Chatbot_21060190_CastilloPerez chatbotAux = obtenerChatbot(getChatbotActual());
                System.out.println(chatbotAux.getName());
                chatHistory.append(chatbotAux.getName()).append("\n");
                Flow_21060190_CastilloPerez flowAux = chatbotAux.obtenerFlow(getFlowActual());
                System.out.println(flowAux.getNameMsg());
                chatHistory.append(flowAux.getNameMsg()).append("\n");
                flowAux.printOptions(flowAux, chatHistory);
                System.out.println("Ingrese la opcion que desea: ");
            }
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

