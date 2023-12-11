package Option_21060190_CastilloPerez;
import java.util.List;

public class Option_21060190_CastilloPerez {
    /**
     * código de un option
     */
    private int code;
    /**
     * mensaje del option
     */
    private String message;
    /**
     * código que enlaza un option a un chatbot
     */
    private int chatbotCodeLink;
    /**
     * código que enlaza un option a un flow
     */
    private int initialFlowCodeLink;
    /**
     * palabras que tienen el mismo fin del code
     */
    private List<String> keywords;

    /**
     * Instancia/constructur del option
     * @param code código del option
     * @param message mensaje del option
     * @param chatbotCodeLink código del chatbot
     * @param initialFlowCodeLink código del flow
     * @param keywords palabras clave del option
     */
    public Option_21060190_CastilloPerez(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords){
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    /**
     * Obtiene el código del option
     * @return code
     */
    public int getCode() {
        return code;
    }

    /**
     * Obtiene el chatbotCodeLink del option
     * @return chatbotCodeLink
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Obtiene el initialFlowCodeLink del option
     * @return initialFlowCodeLink
     */
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * Obtiene el mensaje del option
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Cambia el código del option
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Cambia el mensaje del option
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Cambia el chatbotCodeLink del option
     * @param chatbotCodeLink
     */
    public void setChatbotCodeLink(int chatbotCodeLink) {
        this.chatbotCodeLink = chatbotCodeLink;
    }

    /**
     * Cambia el initialFlowCodeLink del option
     * @param initialFlowCodeLink
     */

    public void setInitialFlowCodeLink(int initialFlowCodeLink) {
        this.initialFlowCodeLink = initialFlowCodeLink;
    }

    /**
     * Cambia la lista de keywords del option
     * @param keywords
     */
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }


    /**
     * Agrega un keyword a la lista de keywords de cierto option
     * @param keyword
     */
    public void agregarKeyword(String keyword){
        this.keywords.add(keyword);
    }
    @Override
    public String toString() {
        return "Option_21060190_CastilloPerez{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", chatbotCodeLink=" + chatbotCodeLink +
                ", initialFlowCodeLink=" + initialFlowCodeLink +
                ", keywords=" + keywords +
                '}';
    }
}



