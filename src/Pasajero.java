import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Pasajero {

    Scanner leer = new Scanner(System.in);

    public String nombre;
    public int cc;
    public String nacionalidad;
    public String direccion;
    public int telefono;
    public String email;
    public boolean equipaje;
    public boolean pasaporte;

    public Pasajero(){
        System.out.println("Ingresar nombre");
        nombre = leer.nextLine();
        System.out.println("Ingresar documento");
        cc = leer.nextInt();
        System.out.println("Ingresar nacionalidad");
        nacionalidad = leer.nextLine();
        System.out.println("Ingresar direccion de residencia");
        direccion = leer.nextLine();
        System.out.println("Ingresar telefono");
        telefono = leer.nextInt();
        System.out.println("Ingresar email");
        email= LocalDateTime(leer.nextLine());
        System.out.println("Lleva equipaje?");
        equipaje = LocalDateTime(leer.nextLine());
        System.out.println("Tiene pasaporte?");
        pasaporte = leer.nextLine();
    }
}
