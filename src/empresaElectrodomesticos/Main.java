package empresaElectrodomesticos;

public class Main {

    public static void main(String[] args) {
        Electrodomesticos e = new Electrodomesticos("Nacional", "A");
        e.SaldoInicial();

        Televisores s= new Televisores("Nacional", "B", 60, "con");
        s.Saldo();
    }
}
