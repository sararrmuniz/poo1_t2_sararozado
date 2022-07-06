public class Funcionario {
    private String nome;
    private String dataNasc;
    private double salario;

    private String cargo;

    public Funcionario() {
    }
    public Funcionario(String nome, String dataNasc, double salario,String cargo){
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.salario=salario;
        this.cargo=cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
