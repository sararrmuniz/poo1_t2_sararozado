import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int num = sc.nextInt();
        System.out.println("Digite o valor a ser debitado: ");
        float val = sc.nextFloat();
        System.out.println("Digite a senha: ");
        int pwd = sc.nextInt();
        ContaCorrente conta = new ContaCorrente(val,num,pwd);

        conta.setEstado(pwd,1);

        conta.debitaValor(val);
        conta.debitaValor(val,pwd);

        System.out.println("Digite o valor a ser creditado: ");
        float valor = sc.nextFloat();
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        conta.creditaValor(senha,valor);

        System.out.println("Saldo = "+ conta.getSaldo(pwd));
        System.out.println("Estado = "+ conta.getEstado(pwd));

    }
}