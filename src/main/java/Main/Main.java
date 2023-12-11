package Main;
import Menu_21060190_CastilloPerez.Menu_21060190_CastilloPerez;
import Menu_21060190_CastilloPerez.CargaDatos;

public class Main {
    public static void main(String[] args){
        CargaDatos.cargaDatos();

        Menu_21060190_CastilloPerez menu = new Menu_21060190_CastilloPerez();
        menu.start();
    }
}
