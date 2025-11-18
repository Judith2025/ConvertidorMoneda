import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

          Scanner scanner = new Scanner(System.in);

        while(true) {

            ConsultaMenu.mostrarMenu();

          System.out.println("Introduce la opcion de la conversion a realizar: ");
              int opcion = scanner.nextInt();
              scanner.nextLine();

          System.out.println("Opción seleccionada: "+opcion);

          switch(opcion){
              case 1:
                  double resultado1 = ConsultaMoneda.ValorMoneda("USD","MXN");
                  System.out.println("$" +resultado1 + " MXN");
                  break;
              case 2:
                  double resultado2 = ConsultaMoneda.ValorMoneda("MXN","USD");
                  System.out.println("$ "+ resultado2 + " USD");
                  break;
              case 3:
                  double resultado3 = ConsultaMoneda.ValorMoneda("USD","BRL");
                  System.out.println("$" +resultado3 + " BRL");
                  break;
              case 4:
                  double resultado4 = ConsultaMoneda.ValorMoneda("BRL","USD");
                  System.out.println("$" +resultado4 + " USD");
                  break;
              case 5:
                  double resultado5 = ConsultaMoneda.ValorMoneda("USD","EUR");
                  System.out.println("$" +resultado5 + " EUR");
                  break;

              case 6:
                  double resultado6 = ConsultaMoneda.ValorMoneda("EUR","USD");
                  System.out.println("$" +resultado6 + " EUR");
                  break;
              case 7:
                  System.out.println("Saliendo del conversor");
                  break;

          }
         if(opcion == 7){
             break;
         }
      }
        scanner.close();

    }
}