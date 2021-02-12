package empresaElectrodomesticos;

public class Electrodomesticos {
    protected String procedencia;
    protected  String consumo;
    public  double precio;

    public Electrodomesticos(String procedencia, String consumo)
    {
        this.procedencia = procedencia;
        this.consumo = consumo;
        SaldoInicial();
    }

    public double getPrecio() {
        return precio;
    }

    public double SaldoInicial()
    {
        if(procedencia == "Nacional")
        {
            precio = 250000;
        }
        else if(procedencia == "Importado")
        {
            precio = 350000;
        }
        else
        {
            System.out.println("Ingrese una opción correcta.");
        }

        if(consumo == "A")
        {
            precio += 450000;
            System.out.println("Tipo consumo A: " + precio);
        }
        else if (consumo == "B")
        {
            precio += 350000;
            System.out.println("Tipo consumo B: " + precio);
        }
        else if(consumo == "C")
        {
            precio += 250000;
            System.out.println("Tipo consumo C: " + precio);
        }
        else
        {
            System.out.println("Ingrese una opcion correcta.");
        }
        return precio;
    }
}
