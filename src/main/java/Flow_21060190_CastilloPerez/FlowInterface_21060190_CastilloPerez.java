package Flow_21060190_CastilloPerez;

import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;

/**
 * Interface de Flow
 */
public interface FlowInterface_21060190_CastilloPerez {
    /**
     * Añade un option a un flow
     * @param option un option
     */
     void flowAddOption(Option_21060190_CastilloPerez option);

    /**
     * Imprime los options de cierto flow
     * @param flow un flow
     */
     void printOptions(Flow_21060190_CastilloPerez flow, StringBuilder chatHistory);

    /**
     * Obtiene un option de cierto flow
     * @param code codigo del option
     * @return Option
     */
    Option_21060190_CastilloPerez obtenerOption(int code);
}
