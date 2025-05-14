import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Reserva {

    Scanner leer = new Scanner(System.in);

    public int idReserva;
    public int asientosReservados;
    public int[] idAsientos;
    public int precio;
    public String metodoDePago;
    public boolean aprobado;
    public boolean checkIn;

    public Reserva(){
        System.out.println("Ingresar el numero de asientos que desea comprar");
        asientosReservados = leer.nextInt();
        System.out.println("Ingresar precio total");
        precio = leer.nextInt();
        System.out.println("Ingresar metodo de pago");
        metodoDePago = leer.nextLine();
        System.out.println("Ya realizo el check In");
        checkIn = leer.nextInt();


        idAsientos.lenght = asientosReservados;
    }

}