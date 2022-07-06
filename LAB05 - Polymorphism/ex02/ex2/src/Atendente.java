public class Atendente extends Funcionario{
    private double comissao;
    private int numVendas;
    public Atendente(String nome, String cpf, String rg, int idade, int mat, int numVendas) {
        super(nome,cpf,rg,idade,mat);
        comissao = 0.45f;
        numVendas = 0;
    }
    public void computaVenda() {
        numVendas++;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaSalario() {
        return (salarioBase + numVendas*comissao);
    }

    public String toString(){
        return "Salario Atendente: " + String.format("R$%.2f",calculaSalario()) +"\n";
    }
}
