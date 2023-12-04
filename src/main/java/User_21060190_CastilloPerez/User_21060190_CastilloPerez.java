package User_21060190_CastilloPerez;
public class User_21060190_CastilloPerez {

    //distintos tipos de usuario
    private String userName;
    private boolean esAdministrador;

    // Constructor

    public User_21060190_CastilloPerez(String userName, boolean esAdministrador) {
        this.userName = userName;
        this.esAdministrador = esAdministrador;
    }

    // Métodos getters y setters

    public String getUserName() {
        return userName;
    }

    public void setNombre(String nombre) {
        this.userName = nombre;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

}
