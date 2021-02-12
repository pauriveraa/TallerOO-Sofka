package empresaElectrodomesticos;

public class Neveras extends Electrodomesticos
{
    private double Capacidad;
    private String Tipo;

    public Neveras(String Procedencia, String Consumo, double Capacidad)
    {
        super(Procedencia, Consumo);
        this.Capacidad = Capacidad;
    }

    public void TipoNevera()
    {
        Tipo = "Nevera";
    }

    public void SaldoNeveras()
    {
        super.SaldoInicial();
        if(Capacidad>120)
        {
            double temp=0;
            temp = (Capacidad-120)/10;
            if(temp == 0)
            {
                Precio=Precio;
            }
            else
            {
                Precio += (temp*(0.05*Precio));
            }
        }
        else
        {
            Precio=Precio;
        }

    }
}
