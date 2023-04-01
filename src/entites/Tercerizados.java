package entites;

public class Tercerizados extends Empregado{

    private Double dipezaAdc;

    public Tercerizados(String nome, Integer horas, Double valorPorHora, Double dipezaAdc) {
        super(nome, horas, valorPorHora);
        this.dipezaAdc = dipezaAdc;
    }

    public Double getDipezaAdc() {
        return dipezaAdc;
    }

    public void setDipezaAdc(Double dipezaAdc) {
        this.dipezaAdc = dipezaAdc;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + (dipezaAdc*1.1);
    }

}
