public class Horistas extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public Horistas(){}

    public Horistas(String nome, String dataNasc,double salario, double valorHora, int horasTrabalhadas){
        super(nome,dataNasc,salario);
        this.valorHora=valorHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }
    public String toString() {
        return getNome() + ", " + getDataNasc() + "," +  String.format("R$%.2f", getSalario());
    }
}
