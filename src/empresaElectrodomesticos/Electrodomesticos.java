package empresaElectrodomesticos;

public class Electrodomesticos {
    protected String Procedencia;
    protected  String Consumo;
    protected  double Precio = 0;

    public Electrodomesticos(String Procedencia, String Consumo)
    {
        this.Procedencia = Procedencia;
        this.Consumo = Consumo;
    }

    public void SaldoInicial()
    {
        if(Procedencia == "Nacional")
        {
            Precio = 250000;
        }
        else if(Procedencia == "Importado")
        {
            Precio = 350000;
        }
        else
        {
            System.out.println("Ingrese una opción correcta.");
        }

        if(Consumo == "A")
        {
            Precio += 450000;
            System.out.println("Tipo consumo A: " + Precio);
        }
        else if (Consumo == "B")
        {
            Precio += 350000;
            System.out.println("Tipo consumo B: " + Precio);
        }
        else if(Consumo == "C")
        {
            Precio += 250000;
            System.out.println("Tipo consumo C: " + Precio);
        }
        else
        {
            System.out.println("Ingrese una opcion correcta.");
        }
    }


}
