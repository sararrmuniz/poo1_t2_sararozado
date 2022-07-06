public class Vendedor extends Funcionario{
    private double valorFixo, comissao;
    private int numeroVendas;

    public Vendedor(){}

    public Vendedor(String nome, String dataNasc,double valorFixo, double salario, double comissao, int numeroVendas,String cargo){
        super(nome,dataNasc,salario,cargo);
        this.comissao=comissao;
        this.numeroVendas=numeroVendas;
        this.valorFixo=valorFixo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public double calculaSalario(){
        return (valorFixo + (comissao*numeroVendas));
    }

    public String toString() {
        return getNome() + ", " + getDataNasc() + ", " +  String.format("R$%.2f", calculaSalario());
    }
}
