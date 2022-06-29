//Classe Uber
public class C3 extends C2{
    public String carro ;
    private String cor;
    protected String placa;

    public C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros\n");
    }

    public C3(String nome, String dataNasc, String cpf, String rg, int numeroCarteira, double salario, String carro, String cor, String placa) {
        super(nome, dataNasc, cpf, rg, numeroCarteira, salario);
        this.carro = carro;
        this.cor = cor;
        this.placa = placa;

        System.out.println("Classe C3: chamada do construtor padrao, sem parametros\n");
    }


    public void mostrar_atributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.rg);
        System.out.println("Data de nascimento: " + getNumeroCarteira());
        System.out.println("Salario: " + this.salario);
        System.out.println("Carro: " + this.carro);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.rg);
        System.out.println("Data de nascimento: " + getNumeroCarteira());
        System.out.println("Salario: " + this.salario);
        System.out.println("Carro: " + this.carro);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }
}
