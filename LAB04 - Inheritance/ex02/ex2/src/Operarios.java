public class Operarios extends Funcionario{
    private double valorProducao;
    private int qtdProduzida;

    public Operarios(){}
    public Operarios(String nome, String dataNasc,double salario,double valorProducao, int qtdProduzida){
        super(nome,dataNasc,salario);
        this.valorProducao=valorProducao;
        this.qtdProduzida=qtdProduzida;
    }
    public String toString() {
        return getNome() + ", " + getDataNasc() + "," +  String.format("R$%.2f", getSalario());
    }
}
