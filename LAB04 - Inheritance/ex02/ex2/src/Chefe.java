public class Chefe extends Funcionario{
    public Chefe(){}
    public Chefe(String nome, String dataNasc,double salario){
        super(nome,dataNasc,salario);
    }
    public String toString() {
        return getNome() + ", " + getDataNasc() + "," +  String.format("R$%.2f", getSalario());
    }
}