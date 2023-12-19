package System_21060190_CastilloPerez;

import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;

public interface SystemInterface_21060190_CastilloPerez {

    /**
     * Obtiene cierto chatbot del sistema, según su id, para así imprimirlo en el menú
     * @param id id del chatbot a buscar
     * @return chatbot
     */
    Chatbot_21060190_CastilloPerez obtenerChatbot(int id);

    /**
     * Agrega un chatbot a cierto sistema
     * @param chatbotAgregar chatbot que se quiere agregar
     */
    void systemAddChatbot(Chatbot_21060190_CastilloPerez chatbotAgregar);

    /**
     * Agrega un usuario al sistema
     *
     * @param userAgregar usuario que se quiere agregar
     * @return true si ya existe en el sistema y false si no y lo agrega
     */
    boolean systemAddUser(User_21060190_CastilloPerez userAgregar);

    /**
     * Hace que un usuario inicie sesión
     * @param userName usuario que quiere iniciar sesión
     * @return true o false para usar el tipo de usuario en el menú
     */
    boolean systemLogin(String userName);

    /**
     * Cierra la sesión del usuario
     */
    void systemLogout();

    /**
     * Permite al usuario común interactuar con los chatbots
     * @param mensaje mensaje inicial, puede ser una id o keyword
     */
    void systemTalk(String mensaje);

    /**
     * Cambia el chatbot y flow actual del sistema
     * @param idOptionEscogido int de la opción escogida para buscar el chatbot y flow actuales
     */
    void setChatbotAndFlowActual(String idOptionEscogido);

    /**
     * Obtiene la id del option que contiene a cierta keyword
     * @param keyword keyword que se desea buscar
     * @return devuelve la id si lo encuentra y un -1 si no existe
     */

    int obtenerIdOptionByKeyword(String keyword);
}
