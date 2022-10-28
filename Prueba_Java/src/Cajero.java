import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {

        Tarjeta tarjeta = new Tarjeta();
        Scanner input = new Scanner(System.in);
        String respuesta;
        int iOpcion;
        do{
            do{
                System.out.println("######## Menu - CAJERO ########");
                System.out.println("Opcion 1: Consultar Saldo");
                System.out.println("Opcion 2: Realizar Retiro de Dinero");
                System.out.println("Opcion 3: Abonar Dinero");
                System.out.println("##########################################");
                System.out.print("Digite el n° de Opcion a escoger: ");
                System.out.println("");
                //
                iOpcion = Integer.parseInt(input.nextLine());
            }while (iOpcion<1 || iOpcion>3);
            switch (iOpcion) {
                case 1:
                    tarjeta.consultarSaldo();
                    break;
                case 2: System.out.print("Digite monto a abonar: ");
                    double abono = Double.parseDouble(input.nextLine());
                    tarjeta.abonarSaldo(abono);
                    break;
                case 3: System.out.print("Digite monto a retirar: ");
                    double retiro = Double.parseDouble(input.nextLine());
                    tarjeta.retiroSaldo(retiro);
                    break;
            }
            System.out.println("Desea realizar otra transaccion?!(s/n): ");
            respuesta = input.nextLine();
            System.out.println("------------------------------------------------------");
        }while (respuesta.equals("s") || respuesta.equals("S"));

    }

}
