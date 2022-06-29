public class CamaroteSuperior extends VIP{

    private double adicionalCamarote;

    public CamaroteSuperior(){}

    public CamaroteSuperior(double valor, double adicionalVip,double adicionalCamarote){
        super(valor,adicionalVip);
        this.adicionalCamarote=adicionalCamarote;
    }

    public double calcula_valorCamarote(){
        return getAdicionalVip() + adicionalCamarote;
    }
}
