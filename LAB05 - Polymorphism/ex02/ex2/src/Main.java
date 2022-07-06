import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de funcionarios a serem cadastrados: ");
        int n = sc.nextInt();
        Funcionario [] vfuncionario = new Funcionario[n];

        for(int i=0;i<n;i++){
            System.out.println("O funcionario eh um Piloto? (s/n)");
            char resposta = sc.next().charAt(0);

            do {
                if (resposta != 's' && resposta != 'n') {
                    System.out.println("Erro! Digite s ou n:");
                    resposta = sc.next().charAt(0);
                }
            } while (resposta != 's' && resposta != 'n');

            if(resposta =='s'){
                sc.nextLine();
                System.out.println("Digite o nome do(a) piloto: ");
                String nome = sc.nextLine();
                System.out.println("Digite o cpf do(a) piloto: ");
                String cpf = sc.nextLine();
                System.out.println("Digite o rg do(a) piloto: ");
                String rg = sc.nextLine();
                System.out.println("Digite a idade do(a) piloto: ");
                int idade = sc.nextInt();
                System.out.println("Digite a matricula do(a) piloto: ");
                int mat = sc.nextInt();
                System.out.println("Digite o numero de horas do(a) piloto: ");
                int numHoras = sc.nextInt();
                vfuncionario[i]=new Piloto(nome,cpf,rg,idade,mat,numHoras);
            }
            if(resposta == 'n'){
                sc.nextLine();
                System.out.println("Digite o nome do(a) atendente: ");
                String nome = sc.nextLine();
                System.out.println("Digite o cpf do(a) atendente: ");
                String cpf = sc.nextLine();
                System.out.println("Digite o rg do(a) atendente: ");
                String rg = sc.nextLine();
                System.out.println("Digite a idade do(a) atendente: ");
                int idade = sc.nextInt();
                System.out.println("Digite a matricula do(a) atendente: ");
                int mat = sc.nextInt();
                System.out.println("Digite o numero de vendas do(a) atendente: ");
                int numVendas = sc.nextInt();
                vfuncionario[i] = new Atendente(nome,cpf,rg,idade,mat,numVendas);
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(vfuncionario[i]);
        }
    }
}