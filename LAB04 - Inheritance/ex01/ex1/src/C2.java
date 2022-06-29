//Classe Motorista
public class C2 extends C1{
    public String rg ;
    private int numeroCarteira;
    protected double salario;

    public C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros\n");
    }

    public C2(String nome, String dataNasc, String cpf,String rg, int numeroCarteira,double salario) {
        super(nome, dataNasc, cpf);
        this.rg=rg;
        this.numeroCarteira=numeroCarteira;
        this.salario = salario;

        System.out.println("Classe C2: chamada do construtor padrao, sem parametros\n");
    }

    public int getNumeroCarteira() {
        return numeroCarteira;
    }


    public void mostrar_atributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Numero da Carteira: " + this.numeroCarteira);
        System.out.println("Salario: " + this.salario);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Numero da Carteira: " + this.numeroCarteira);
        System.out.println("Salario: " + this.salario);
    }
}
