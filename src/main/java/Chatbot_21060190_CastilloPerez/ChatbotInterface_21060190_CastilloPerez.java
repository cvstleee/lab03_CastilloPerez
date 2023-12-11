package Chatbot_21060190_CastilloPerez;

import Flow_21060190_CastilloPerez.Flow_21060190_CastilloPerez;

/**
 * Interface de chatbot
 */
public interface ChatbotInterface_21060190_CastilloPerez {
    /**
     * Obtiene el flow de cierto chatbot que coincida con una ID
     * @param id Id del flow que se desea obtener del chatbot
     * @param chatbot chatbot que tiene flows
     * @return flow
     */
    public Flow_21060190_CastilloPerez obtenerFlow(int id, Chatbot_21060190_CastilloPerez chatbot);

    /**
     * Agrega un flow a un chatbot
     * @param flowAgregar flow que se quiere agregar
     */
    void chatbotAddFlow(Flow_21060190_CastilloPerez flowAgregar);
}
