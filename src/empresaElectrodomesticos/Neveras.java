package empresaElectrodomesticos;

public class Neveras extends Electrodomesticos {
    private double capacidad;

    public Neveras(String procedencia, String consumo, double capacidad) {
        super(procedencia, consumo);
        this.capacidad = capacidad;
        SaldoNeveras();
    }

    public double SaldoNeveras() {
        super.SaldoInicial();
        if (capacidad > 120) {
            double temp = 0;
            temp = (capacidad - 120) / 10;
            if (temp == 0) {
                System.out.println("No hay adición por capacidad superior.");
            } else {
                super.precio += (temp * (0.05 * super.precio));
            }
        }
        return precio;
    }
}
