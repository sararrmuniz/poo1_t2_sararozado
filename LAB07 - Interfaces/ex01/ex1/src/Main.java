import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;
        Produto[] p = new Produto[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o codigo do produto: ");
            int codigo = sc.nextInt();
            p[i] = new Produto(codigo);
            sc.nextLine();
        }
        Classificador.ordena(p);
        for (int i = 0; i < p.length; i++) {
            p[i].imprime();
            System.out.println();
        }

        Cliente[] c = new Cliente[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o nome do cliente: ");
            String nome = sc.nextLine();
            c[i] = new Cliente(nome);
        }

        Classificador.ordena(c);
        for (int i = 0; i < c.length; i++) {
            c[i].imprime();
            System.out.println();
        }

        Servico[] s = new Servico[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o servico desejado: ");
            String servico = sc.nextLine();
            s[i] = new Servico(servico);
        }

        Classificador.ordena(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println();
            s[i].imprime();
        }
    }
}