package System_21060190_CastilloPerez;

import Chatbot_21060190_CastilloPerez.Chatbot_21060190_CastilloPerez;
import User_21060190_CastilloPerez.User_21060190_CastilloPerez;

public interface SystemInterface_21060190_CastilloPerez {

    /**
     * Obtiene cierto chatbot del sistema, según su id, para así imprimirlo en el menú
     * @param id id del chatbot a buscar
     * @param sys sistema donde buscarlo
     * @return chatbot
     */
    Chatbot_21060190_CastilloPerez obtenerChatbot(int id, System_21060190_CastilloPerez sys);

    /**
     * Agrega un chatbot a cierto sistema
     * @param chatbotAgregar chatbot que se quiere agregar
     */
    void systemAddChatbot(Chatbot_21060190_CastilloPerez chatbotAgregar);

    /**
     * Agrega un usuario al sistema
     *
     * @param userAgregar usuario que se quiere agregar
     * @return
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
}
