public class Funcionario {
    private String nome, dataNasc;
    private double salario;

    public Funcionario() {
    }
    public Funcionario(String nome, String dataNasc, double salario){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public double getSalario() {
        return salario;
    }
}