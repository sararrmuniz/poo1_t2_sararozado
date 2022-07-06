public class Horista extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(){}

    public Horista(String nome, String dataNasc,double salario, double valorHora, int horasTrabalhadas,String cargo){
        super(nome,dataNasc,salario,cargo);
        this.valorHora=valorHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double calculaSalario(){
        return horasTrabalhadas*valorHora;
    }

    public String toString() {
        return getNome() + ", " + getDataNasc() + ", " +  String.format("R$%.2f", calculaSalario());
    }
}
