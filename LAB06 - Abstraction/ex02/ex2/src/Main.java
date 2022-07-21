import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja criar uma conta?(s/n) ");
        char resposta = sc.next().charAt(0);

        do {
            if (resposta != 's' && resposta != 'n') {
                System.out.println("Erro! Digite s ou n:");
                resposta = sc.next().charAt(0);
            }
        } while (resposta != 's' && resposta != 'n');

        if(resposta =='s'){
            sc.nextLine();
            System.out.println("Deseja criar qual tipo de conta? Escolha uma das opcoes a seguir:");
            System.out.println("1-Conta Especial");
            System.out.println("2-Conta Comum");

            int numero = sc.nextInt();
            switch (numero) {
                case 1:
                    ContaEspecial cs = new ContaEspecial();
                    cs.setNumConta(145678);
                    cs.setLimite(1000);
                    cs.setSenha(668);
                    cs.setEstado(cs.getSenha(), 1);
                    System.out.println("\nConta Especial criada com sucesso!\n");
                    System.out.println("O numero da sua conta eh: " + cs.getNumConta() + " e sua senha inicial eh: " + cs.getSenha());
                    System.out.println("Seu limite foi iniciado em R$" + cs.getLimite() + ". Entre em contato caso queira altera-lo.");
                    System.out.println("Inicie colocando algum credito na sua conta!\n");
                    System.out.println("Digite o valor a ser creditado: ");
                    float valor = sc.nextFloat();
                    cs.setSaldo(valor);

                    System.out.println("Deseja realizar um debito?(s/n)");
                    char resposta2 = sc.next().charAt(0);

                    do {
                        if (resposta2 != 's' && resposta2 != 'n') {
                            System.out.println("Erro! Digite s ou n:");
                            resposta2 = sc.next().charAt(0);
                        }
                    } while (resposta2 != 's' && resposta2 != 'n');

                    if(resposta2 == 's'){
                        sc.nextLine();
                        System.out.println("Para debitar digite sua senha: ");
                        int senha = sc.nextInt();
                        System.out.println("Digite o valor a ser debitado: ");
                        float val = sc.nextFloat();
                        cs.debitaValor(val);
                        System.out.println("Saldo: " + cs.getSaldo(senha));
                    }
                    if(resposta2 == 'n'){
                        System.out.println("Fim do processo!");
                    }

                    break;

                case 2:
                    ContaComum ccomum = new ContaComum();
                    ccomum.setNumConta(155679);
                    ccomum.setSenha(668);
                    System.out.println("O numero da sua conta eh: " + ccomum.getNumConta() + " e sua senha inicial eh: " + ccomum.getSenha());
                    System.out.println("Conta Comum criada com sucesso!");
                    System.out.println("Seu limite foi iniciado em R$0.00. Entre em contato caso queira altera-lo.");
                    break;

                default:
                    System.out.println("O número escolhido é inválido! Digite o número novamente.");
            }
        }
        if(resposta == 'n') {
            System.exit(1);
        }

    }
}