package empresaElectrodomesticos;

public class Televisores extends Electrodomesticos
{
    private double pulgadas;
    private boolean tdt;

    public Televisores(String procedencia, String consumo, double pulgadas, boolean tdt)
    {
        super(procedencia, consumo);
        this.pulgadas =pulgadas;
        this.tdt =tdt;
        SaldoTelevisores();
    }

    public double SaldoTelevisores()
    {
        super.SaldoInicial();
        if(pulgadas >40)
        {
            super.precio += (super.precio *0.3);
        }

        if(tdt = true)
        {
            super.precio +=  250000;
        }
        return precio;
    }
}
