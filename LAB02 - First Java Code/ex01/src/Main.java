public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Jade Andrade";
        p1.idade = 22;
        p1.profissao = "Assistente";
        p1.dinheiroNaCarteira = 2500.00;

        System.out.println("Salario de " + p1.nome + " eh de " + "R$" + p1.dinheiroNaCarteira);
        //Suponha que Jade recebeu 100 reais
        p1.receber(100.00);
        System.out.println(p1.nome + " tem " + "R$" + p1.dinheiroNaCarteira);

        //Suponha que Jade gastou 50 reais
        p1.gastar(50.00);
        System.out.println(p1.nome + " gastou e agora tem " + "R$" + p1.dinheiroNaCarteira);

        Pessoa p2 = new Pessoa();
        p2.nome = "Marcia Silva";
        p2.idade = 30;
        p2.profissao = "Dentista";
        p2.dinheiroNaCarteira = 8000.00;

        System.out.println("\nSalario de " + p2.nome + " eh de " + "R$" + p2.dinheiroNaCarteira);

        //Suponha que Marcia recebeu 2000 reais
        p2.receber(2000.00);
        System.out.println(p2.nome + " tem " + "R$" + p2.dinheiroNaCarteira);

        //Suponha que Vitor gastou 1000 reais
        p2.gastar(1000.00);
        System.out.println(p2.nome + " gastou e agora tem " + "R$" + p2.dinheiroNaCarteira);
    }
}