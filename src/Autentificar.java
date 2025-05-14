
public class Autentificar {
    private Usuario usuarioInf = new Usuario();

    public static boolean autentificar(String usuario, String contraseña){
        if (obtener(usuario)!=null){
            Usuario usuarioConsulta = obtener(usuario);
            if (usuarioConsulta.getUsuario().equals(usuario)&&usuarioConsulta.getContraseña().equals(contraseña)){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public static boolean insertar(Usuario usuario){
        return usuarioInf.insertar(usuario);
    }

    public static boolean modificar(Usuario usuario){
        return usuarioInf.modificar(usuario)
    }

    public static boolean eliminar(String usuario){
        return usuarioInf.eliminar(usuario)
    }

    public static Usuario obtener(String usuario){
        return usuarioInf.obtener(usuario)
    }
}
