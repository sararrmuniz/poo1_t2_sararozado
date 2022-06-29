public class Vendedor extends Funcionario{

    private double valorFixo, comissao;
    private int numeroVendas;

    public Vendedor(){}

    public Vendedor(String nome, String dataNasc,double salario, double valorFixo, double comissao, int numeroVendas){
        super(nome,dataNasc,salario);
        this.valorFixo=valorFixo;
        this.comissao=comissao;
        this.numeroVendas=numeroVendas;
    }

   public String toString() {
       return getNome() + ", " + getDataNasc() + "," +  String.format("R$%.2f", getSalario());
   }
}
