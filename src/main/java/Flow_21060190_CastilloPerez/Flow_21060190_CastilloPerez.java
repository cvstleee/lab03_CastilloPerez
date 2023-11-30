package Flow_21060190_CastilloPerez;
import java.util.List;
import Option_21060190_CastilloPerez.Option_21060190_CastilloPerez;

public class Flow_21060190_CastilloPerez implements FlowInterface_21060190_CastilloPerez {
    private int ID;
    private String nameMsg;
    public List<Option_21060190_CastilloPerez> option;

    //RF2: constructor, con herencia
    public Flow_21060190_CastilloPerez(int ID, String nameMsg, List<Option_21060190_CastilloPerez> option){
        this.ID = ID;
        this.nameMsg = nameMsg;
        this.option = option;
    }

    public int getID() {
        return ID;
    }

    //get del option
    public List<Option_21060190_CastilloPerez> getOption() {
        return option;
    }

    //RF3 sin el filtro
    public void flowAddOption(Option_21060190_CastilloPerez optionAgregar) {
        int code = optionAgregar.getCode();
        boolean existeID = false;

        for (Option_21060190_CastilloPerez i : option) {
            int code2 = i.getCode(); // Código de los options ya agregados
            if (code == code2) {
                existeID = true;
                //System.out.println("Ya existe ese option");
            }
        }

        if (!existeID) {
            this.option.add(optionAgregar);
            //System.out.println("Se agregó con éxito");
        }
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
