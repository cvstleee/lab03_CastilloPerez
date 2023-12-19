package Flow_21060190_CastilloPerez;
import java.util.List;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;


public class Flow_21060190_CastilloPerez implements FlowInterface_21060190_CastilloPerez {
    /**
     * ID del flow
     */
    private int ID;
    /**
     * nombre/mensaje del flow
     */
    private String nameMsg;
    /**
     * lista de options del flow
     */
    public List<Option_21060190_CastilloPerez> option;

    /**
     * Instancia/constructor del flow
     * @param ID Id del flow
     * @param nameMsg nombre del flow
     * @param option lista de options del flow
     */
    public Flow_21060190_CastilloPerez(int ID, String nameMsg, List<Option_21060190_CastilloPerez> option){
        this.ID = ID;
        this.nameMsg = nameMsg;
        this.option = option;
    }

    /**
     * Obtiene la ID del flow
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtiene el nombre del flow
     * @return nameMesg
     */
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     * Obtiene los options del flow
     * @return option
     */
    public List<Option_21060190_CastilloPerez> getOption() {
        return option;
    }

    /**
     * Cambia el Id del flow
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Cambia el nameMsg del flow
     * @param nameMsg
     */
    public void setNameMsg(String nameMsg) {
        this.nameMsg = nameMsg;
    }

    /**
     * Agrega un option al flow
     * @param optionAgregar option que se quiere agregar
     */
    public void flowAddOption(Option_21060190_CastilloPerez optionAgregar) {
        int code = optionAgregar.getCode();
        boolean existeID = false;

        for (Option_21060190_CastilloPerez i : option) {
            int code2 = i.getCode();
            if (code == code2) {
                existeID = true;
            }
        }

        if (!existeID) {
            this.option.add(optionAgregar);
        }
    }


    /**
     * Imprime los options de cierto flow
     * @param flow flow del que se quieren imprimir los options
     */
    public void printOptions(Flow_21060190_CastilloPerez flow, StringBuilder chatHistory) {
        for (Option_21060190_CastilloPerez opt : flow.getOption()) {
            System.out.println(opt.getMessage() + ", keywords:" + opt.getKeywords());
            chatHistory.append(opt.getMessage()).append(", keywords:").append(opt.getKeywords()).append("\n");
        }
    }

    /**
     * Obtiene un option de cierto flow
     * @param code codigo del option
     * @return Option
     */
    public Option_21060190_CastilloPerez obtenerOption(int code){
        List<Option_21060190_CastilloPerez> optionsFlow = getOption();
        for(Option_21060190_CastilloPerez i: optionsFlow){
            int idObtenido = i.getCode();
            if(idObtenido == code){
                return i;
            }
        }return null;
    }
    @Override
    public String toString() {
        return "flow_21060190_CastilloPerez{" +
                "ID=" + ID +
                ", nameMsg='" + nameMsg + '\'' +
                ", option=" + option +
                '}';
    }
}
