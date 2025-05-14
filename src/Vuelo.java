import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Vuelo {

    Scanner leer = new Scanner(System.in);

    public int id;
    public String avion;
    public int antiguedad;
    public String origen;
    public String destino;
    public LocalDateTime fechaSalida;
    public LocalDateTime fechaLlegada;
    public int capacidad;
    public boolean visa;

    public Vuelo(){
        System.out.println("Ingresar ID");
        id = leer.nextInt();
        System.out.println("Ingresar modelo avion");
        avion = leer.nextLine();
        System.out.println("Ingresar antiguedad");
        antiguedad = leer.nextLine();
        System.out.println("Ingresar lugar de salida");
        origen = leer.nextLine();
        System.out.println("Ingresar destino);
        destino = leer.nextDouble();
        System.out.println("Ingresar fecha salida");
        fechaSalida= LocalDateTime(leer.nextLine());
        System.out.println("Ingresar fecha llegada");
        fechaLlegada = LocalDateTime(leer.nextLine());
        System.out.println("Ingresar capacidad de pasajeros");
        capacidad = leer.nextLine();
        System.out.println("Tiene visa");
        visa = leer.nextBoolean();
    }

}


