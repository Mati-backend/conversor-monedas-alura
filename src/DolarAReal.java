import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DolarAReal {
    public void dolarAReal() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir:");
        int cantidad = scanner.nextInt();

        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("El valor " + cantidad + " [USD] " + "corresponde al valor final de: "
                + "$" + df.format(consultaMoneda.consultaMoneda("USD", "BRL", cantidad)) + " real brasileño");
    }
}
