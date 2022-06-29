//Classe Funcionario
public class C1 {
    public String nome;
    private String dataNasc;
    protected String cpf;

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros\n");
    }
    public C1(String nome,String dataNasc,String cpf){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;

        System.out.println("Classe C1: chamada do construtor padrao, sem parametros\n");
    }
    public String getDataNasc() {
        return dataNasc;
    }

    public void mostrar_atributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNasc);
        System.out.println("CPF: " + this.cpf);
    }
    public void mostrar_atributos_super(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("CPF: " + this.cpf);
    }
}
