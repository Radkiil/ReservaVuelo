import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class Sistema {

    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<>();
    }

    public int buscar(String usuario) {
        int n = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usuario)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean insertar(Usuario usuario) {
        if (buscar(usuario.getUsuario()) == -1) {
            usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificar(Usuario usuario) {
        if (buscar(usuario.getUsuario()) != -1) {
            Usuario usuarioaux = obtener(usuario);

            usuarioaux.setUsuario(usuario.getUsuario());
            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setCorreo(usuario.getCorreo());

            return true;
        }
        else
            return false;
    }

    public boolean eliminar(String usuario) {
        if (buscar(usuario) != -1) {
            usuarios.remove(buscar(usuario));
            return true;
        }
        else
            return false;
    }

    public Usuario obtener (String usuario) {
        if (buscar(usuario) != -1) {
            return usuarios.get(buscar(usuario));
        }
        else
            return null;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Vuelo v1 = new Vuelo();
        Vuelo v2 = new Vuelo();
        Vuelo v3 = new Vuelo();

    }

}

