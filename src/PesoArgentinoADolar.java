import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PesoArgentinoADolar {
    public void pesoArgentinoADolar() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea convertir:");
        int cantidad = scanner.nextInt();

        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("El valor de " + cantidad + " pesos argentinos " + "corresponde el valor final de: " + "$" + df.format(consultaMoneda.consultaMoneda("ARS"
                , "USD", cantidad)) + " [USD]" );
    }
}
