import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public void menuPrincipal() throws IOException, InterruptedException {

        DolarAPesoArgentino dolarAPesoArgentino = new DolarAPesoArgentino();
        PesoArgentinoADolar pesoArgentinoADolar = new PesoArgentinoADolar();
        DolarAReal dolarAReal = new DolarAReal();
        RealADolar realADolar = new RealADolar();
        DolarAPesoColombiano dolarAPesoColombiano = new DolarAPesoColombiano();
        PesoColombianoADolar pesoColombianoADolar = new PesoColombianoADolar();

        try{
            Scanner scanner = new Scanner(System.in);
            int opcion = 0;

            while (opcion !=7){

                System.out.println("*****************************+++++++***");

                System.out.println("\bBienvenidos al Conversor de Monedas");
                System.out.println("\b1) Dólar =>> Peso Argentino ");
                System.out.println("2) Peso Argentino =>> Dólar ");
                System.out.println("3) Dólar =>> Real Brasileño ");
                System.out.println("4) Real Brasileño =>> Dólar");
                System.out.println("5) Dólar =>> Peso Colombiano");
                System.out.println("6) Peso Colombiano =>> Dólar");
                System.out.println("7) Salir");
                System.out.println("\bPor favor elija una opción válida: ");
                opcion = scanner.nextInt();

                System.out.println("***************************************");

                switch (opcion) {
                    case 1: dolarAPesoArgentino.dolarAPesoArgenino();
                    break;
                    case 2: pesoArgentinoADolar.pesoArgentinoADolar();
                    break;
                    case 3: dolarAReal.dolarAReal();
                    break;
                    case 4: realADolar.realADolar();
                    break;
                    case 5: dolarAPesoColombiano.dolarAPesoColombiano();
                    break;
                    case 6: pesoColombianoADolar.pesoColombianoADolar();
                    break;
                    case 7:
                        System.out.println("Gracias por utilizar nuestra App. ¡Hasta Luego!");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Opción no válida");
        }
    }
}
