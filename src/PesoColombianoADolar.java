import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PesoColombianoADolar {

    public void pesoColombianoADolar() throws IOException, InterruptedException {
        // Implementación de la conversión de pesos colombianos a dólares

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("El valor de " + cantidad + " Pesos Colombianos, " + "corresponde al valor final de: "
                + "$" + df.format(consultaMoneda.consultaMoneda("COP", "USD", cantidad)) + " [USD]");
    }
}
