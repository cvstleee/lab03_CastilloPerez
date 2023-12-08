package User_21060190_CastilloPerez;
import System_21060190_CastilloPerez.System_21060190_CastilloPerez;
import java.util.Locale;
import java.util.List;

public class User_21060190_CastilloPerez {

    //distintos tipos de usuario
    private String userName;
    private boolean esAdministrador;

    //private List<User_21060190_CastilloPerez> listaUsuarios;

    // Constructor

    public User_21060190_CastilloPerez(String userName) {
        this.userName = userName.toLowerCase();
        this.esAdministrador = false;
    }




    /*public User_21060190_CastilloPerez(String userName) {
        int verificador = verificarUsuarioUnico(userName);
        if (verificador == 1){
            this.userName = userName;
            listaUsuarios.add(this);
        }else{
            System.out.println("El usuario ya existe en el sistema\n");
        }
        this.esAdministrador = false;
    }

    public int verificarUsuarioUnico (String usuario) {
        boolean existeUser = false;
        for (User_21060190_CastilloPerez usuarioExistente : listaUsuarios) {
            String usuarioRegistrado = usuarioExistente.getUserName();
            if (usuarioRegistrado.equals(usuario)) {
                //caso de que si existe
                existeUser = true;

            }
        } if (!existeUser) {
            //caso de que no existe
            return 1;
        }
        return 0;
    }*/

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

    @Override
    public String toString() {
        return "User_21060190_CastilloPerez{" +
                "userName='" + userName + '\'' +
                ", esAdministrador=" + esAdministrador +
                '}';
    }
}
