import java.io.IOException;
import java.util.Scanner;

public class RealADolar {
    public void realADolar() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        double cantidad = scanner.nextDouble();

        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        System.out.println("El valor de " + cantidad + " Real Brasileño, " + "corresponde al valor final de: "
                + "$" + consultaMoneda.consultaMoneda("BRL", "USD", cantidad) + " [USD]");
    }
}
