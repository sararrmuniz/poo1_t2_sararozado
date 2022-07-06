public class Funcionario extends Pessoa{
    protected int matricula;
    protected double salarioBase;
    public Funcionario(String nome, String cpf, String rg, int idade, int mat) {
        super(nome,cpf,rg,idade);
        matricula = mat;
        salarioBase = 1000;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calculaSalario() {
        return salarioBase;
    }

}

