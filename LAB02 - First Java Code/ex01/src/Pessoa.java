public class Pessoa {
    String nome;
    int idade;
    String profissao;
    double dinheiroNaCarteira;

    public void gastar(double valor){
        dinheiroNaCarteira = dinheiroNaCarteira - valor;
    }
    public void receber(double valor){
        dinheiroNaCarteira = dinheiroNaCarteira + valor;
    }
}
