package empresaElectrodomesticos;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList <Electrodomesticos> lista = new ArrayList<Electrodomesticos>();

        Electrodomesticos e = new Electrodomesticos("Nacional", "A");
        e.SaldoInicial();
        e.TipoGeneral();

        Televisores s= new Televisores("Nacional", "B", 60, "con");
        s.SaldoTelevisores();
        s.TipoTelevisor();

        Neveras n = new Neveras("Importado", "C", 170);
        n.SaldoNeveras();
        n.TipoNevera();

        lista.add(e);
        lista.add(s);
        lista.add(n);

        /*
        System.out.println(e.toString());
        System.out.println(s.toString());
        System.out.println(n.toString());
        */
        System.out.println("Esta es la lista de electrodompesticos comprados" + lista);





    }
}
