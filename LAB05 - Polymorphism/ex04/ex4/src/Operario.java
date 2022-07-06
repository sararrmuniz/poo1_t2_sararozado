public class Operario extends Funcionario{
    private double valorProducao;
    private int qtdProduzida;

    public Operario(){}
    public Operario(String nome, String dataNasc,double salario,double valorProducao, int qtdProduzida,String cargo){
        super(nome,dataNasc,salario,cargo);
        this.valorProducao=valorProducao;
        this.qtdProduzida=qtdProduzida;
    }
    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double calculaSalario(){
        return (valorProducao*qtdProduzida);
    }

    public String toString() {
        return getNome() + ", " + getDataNasc() + ", " +  String.format("R$%.2f",calculaSalario());
    }
}
