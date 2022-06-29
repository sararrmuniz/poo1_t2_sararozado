public class VIP extends Ingresso {
    private double adicionalVip;

    public VIP(){}

    public VIP(double valor, double adicionalVip){
        super(valor);
        this.adicionalVip=adicionalVip;
    }

    public double getAdicionalVip() {
        return adicionalVip;
    }
    public void setAdicionalVip(double adicional) {
        this.adicionalVip = adicional;
    }

    public double calcula_ingressoVip()
    {
        return getValor() + adicionalVip;
    }

}
