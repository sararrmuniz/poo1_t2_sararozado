import java.util.Locale;
import java.util.Scanner;

public class UsaBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int num = sc.nextInt();
        System.out.println("Digite o valor a ser creditado: ");
        float valor = sc.nextFloat();
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        System.out.println("Digite o valor a ser debitado: ");
        float val = sc.nextFloat();
        System.out.println("Digite a senha: ");
        int pwd = sc.nextInt();
        System.out.println("Digite o limite desejado: ");
        float limite = sc.nextFloat();
        ContaEspecial cs= new ContaEspecial(val,num,pwd,limite);

        cs.creditaValor(senha,valor);
        cs.debitaValor(val);
        cs.debitaValor(val,pwd);

        System.out.println("Saldo: " + cs.getSaldo(senha));
    }
}