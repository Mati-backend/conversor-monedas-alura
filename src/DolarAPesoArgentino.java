import java.io.IOException;
import java.util.Scanner;

public class DolarAPesoArgentino {

    public void dolarAPesoArgenino() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea convertir:");
        int cantidad = scanner.nextInt();

        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

            System.out.println("El valor " + cantidad + " [USD] " + "corresponde el valor final de: " + "$" + consultaMoneda.consultaMoneda(
                    "USD", "ARS", cantidad) + " pesos argentinos" );
    }
}
