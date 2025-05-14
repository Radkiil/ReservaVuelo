import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class  Sistema {

    private String usuario;
    private String contraseña;
    private String nombre;
    private String correo;

    public Sistema{
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Vuelo v1 = new Vuelo();
        Vuelo v2 = new Vuelo();
        Vuelo v3 = new Vuelo();
    }
}

