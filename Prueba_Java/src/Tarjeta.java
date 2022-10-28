public class Tarjeta {

    private double saldo = 3800;

    public Tarjeta() {
    }

    public double getSaldo() {
        return saldo;
    }

    /* METODOS */

    public void consultarSaldo(){
        System.out.println("El saldo actual de la cuenta es: " + getSaldo());
    }

    public void abonarSaldo(double abono){
        if(abono < 0){
            System.out.println("No se puede realizar un ingreso negativo");
        }
        else {
            System.out.println("Depositando..........");
            System.out.println("Saldo Anterior: " + this.saldo);
            saldo = saldo + abono;
            System.out.println("Saldo actual: " + getSaldo());
        }
    }

    public void retiroSaldo(double retiro){
        if(getSaldo() - retiro < 0){
            System.out.println("Saldo no suficiente para poder retirar");
        }
        else {
            System.out.println("Retirando..........");
            saldo = saldo - retiro;
            System.out.println("Tu saldo actual es: " + getSaldo());
        }
    }

}
