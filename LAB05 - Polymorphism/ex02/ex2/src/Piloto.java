public class Piloto extends Funcionario{
    private int numHoras;
    public Piloto(String nome, String cpf, String rg, int idade, int mat, int numHoras) {
        super(nome,cpf,rg,idade,mat);
        this.numHoras = numHoras;
    }
    public double calculaSalario() {
        return (salarioBase + numHoras*4);
    }

    public String toString(){
        return "Salario Piloto: " + String.format("R$%.2f",calculaSalario()) +"\n";
    }
}
