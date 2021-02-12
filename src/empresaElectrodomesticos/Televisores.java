package empresaElectrodomesticos;

public class Televisores extends Electrodomesticos
{
    private double Pulgadas;
    private String Tdt;

    public Televisores(String Procedencia, String Consumo, double Pulgadas, String Tdt)
    {
        super(Procedencia, Consumo);
        this.Pulgadas=Pulgadas;
        this.Tdt=Tdt;
    }
    public void Saldo()
    {
        SaldoInicial();
        if(Pulgadas>40)
        {
            Precio += (Precio*0.3);
        }
        else
        {
            Precio=Precio;
        }
        if(Tdt == "con")
        {
            Precio += 250000;
        }
        else if(Tdt == "sin")
        {
            Precio=Precio;
        }
        else
        {
            System.out.println("Ingrese una palabra correcta.");
        }
    }

}
