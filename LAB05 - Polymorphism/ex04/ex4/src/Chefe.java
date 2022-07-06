public class Chefe extends Funcionario{
    public Chefe(){}
    public Chefe(String nome, String dataNasc,double salario,String cargo){
        super(nome,dataNasc,salario,cargo);
    }
    public double calculaSalario(){
        return getSalario();
    }
    public String toString() {
        return getNome() + ", " + getDataNasc() + ", " +  String.format("R$%.2f", calculaSalario());
    }
}
