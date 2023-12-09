package Option_21060190_CastilloPerez;
import java.util.List;
public class Option_21060190_CastilloPerez implements OptionInterface_21060190_CastilloPerez {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;


    //y si hago el case sensitive cuando recién vaya a usar las keywords?

    /**
     * Constructor del option
     * @param code
     * @param message
     * @param chatbotCodeLink
     * @param initialFlowCodeLink
     * @param keywords
     */
    public Option_21060190_CastilloPerez(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords){
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    //get id
    public int getCode() {
        return code;
    }

    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    public String getMessage() {
        return message;
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



