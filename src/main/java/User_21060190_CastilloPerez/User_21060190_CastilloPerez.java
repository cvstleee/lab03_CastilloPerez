package User_21060190_CastilloPerez;
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;
import java.util.Locale;
import java.util.List;

public class User_21060190_CastilloPerez {
    /**
     * nombre del usuario
     */
    private String userName;
    /**
     * true si es administrador, false si no
     */
    private boolean esAdministrador;


    /**
     * Constructor del usuario
     * @param userName nombre del usuario
     */
    public User_21060190_CastilloPerez(String userName) {
        this.userName = userName.toLowerCase();
        this.esAdministrador = false;
    }


    /**
     * Obtiene el nombre del usuario
     * @return nombre del usuario
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Obtiene el valor de esAdministrador
     * @return true o false
     */
    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    /**
     * Cambia el valor del esAdministrador
     * @param esAdministrador puede ser true o false
     */
    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    @Override
    public String toString() {
        return "User_21060190_CastilloPerez{" +
                "userName='" + userName + '\'' +
                ", esAdministrador=" + esAdministrador +
                '}';
    }
}
