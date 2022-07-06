public class FolhaDePagamento extends Funcionario {

    public FolhaDePagamento() {
    }

    public FolhaDePagamento(String nome, String dataNasc, double salario, String cargo) {
        super(nome, dataNasc, salario, cargo);
    }

    public String mostra() {
            return getNome() + "\t\t" + getCargo() + "\t\t" +  String.format("R$%.2f", getSalario());
        }
    }
