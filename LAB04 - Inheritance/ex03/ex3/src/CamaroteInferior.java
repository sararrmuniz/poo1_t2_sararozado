public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(){}

    public CamaroteInferior(double valor,double adicionalVip,String localizacao){
        super(valor,adicionalVip);
        this.localizacao=localizacao;
    }

    public String getLocalizacao() {

        return localizacao;
    }

    public void setLocalizacao(String localizacao) {

        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao(){

        System.out.println("Local: " + getLocalizacao());
    }
}
