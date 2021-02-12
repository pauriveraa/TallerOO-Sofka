package empresaElectrodomesticos;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Electrodomesticos> listas = new ArrayList<Electrodomesticos>();

        Electrodomesticos e = new Electrodomesticos("Nacional", "A");

        Electrodomesticos s = new Televisores("Nacional", "B", 60, true);

        Electrodomesticos n = new Neveras("Importado", "C", 170);

        listas.add(e);
        listas.add(s);
        listas.add(n);

        double TotalT = 0;
        double TotalN = 0;
        double TotalOtros = 0;

        for (Electrodomesticos lista : listas) {
            if (lista instanceof Neveras) {
                TotalN = TotalN + lista.getPrecio();
            } else if (lista instanceof Televisores) {
                TotalT = TotalT + lista.getPrecio();
            } else {
                TotalOtros = TotalOtros + lista.getPrecio();
            }
        }
        System.out.println("Valor total de televisores = " + TotalT);
        System.out.println("Valor total de Neveras = " + TotalN);
        System.out.println("Valor total de otros electrodomésticos = " + TotalOtros);


        System.out.println("Esta es la lista de electrodompesticos comprados" + listas);
    }
}
