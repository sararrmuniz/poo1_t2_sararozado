import java.util.Scanner;
import java.util.Locale;
public class Empresa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Vetor Chefe
        System.out.println(">Digite o numero de chefes a serem cadastrados: ");
        int n1 = sc.nextInt();
        Chefe[] vchef = new Chefe[n1];

        for (int i=0; i<n1; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Data de Nascimento: ");
            String dataNasc = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            vchef[i] = new Chefe(nome,dataNasc,salario);
        }
        //Vetor Vendedor
        System.out.println(">Digite o numero de vendedores a serem cadastrados: ");
        int n2 = sc.nextInt();

        Vendedor[] vvend = new Vendedor[n2];

        for (int i=0; i<n2; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Data de Nascimento: ");
            String dataNasc = sc.nextLine();
            System.out.println("Valor Fixo: ");
            double valorFixo = sc.nextDouble();
            System.out.println("Comissao(10% -> 0.10): ");
            double comissao = sc.nextDouble();
            System.out.println("Numero de Vendas: ");
            int numeroVendas = sc.nextInt();
            double salario = (valorFixo + (comissao*numeroVendas));
            vvend[i] = new Vendedor(nome,dataNasc,salario,valorFixo,comissao,numeroVendas);
        }

        //Vetor Operario
        System.out.println(">Digite o numero de operarios a serem cadastrados: ");
        int n3 = sc.nextInt();

        Operarios[] vop = new Operarios[n3];

        for (int i=0; i<n3; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Data de Nascimento: ");
            String dataNasc = sc.nextLine();
            System.out.println("Valor por Producao: ");
            double valorProducao = sc.nextDouble();
            System.out.println("Quantidade Produzida: ");
            int qtdProduzida = sc.nextInt();
            double salario = (valorProducao * qtdProduzida);
            vop[i] = new Operarios(nome,dataNasc,salario,valorProducao,qtdProduzida);
        }
        //Vetor Horstas
        System.out.println(">Digite o numero de Horistas a serem cadastrados: ");
        int n4 = sc.nextInt();

        Horistas[] vhorista = new Horistas[n3];

        for (int i=0; i<n4; i++) {
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Data de Nascimento: ");
            String dataNasc = sc.nextLine();
            System.out.println("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.println("Horas trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();
            double salario = (valorHora * horasTrabalhadas);
            vhorista[i] = new Horistas(nome,dataNasc,salario,valorHora,horasTrabalhadas);
        }
        //Imprime Valores
        for(int i=0; i<n1; i++){
            System.out.println();
            System.out.println("Chefe"+ i + ": " + vchef[i]);
        }
        for(int i=0; i<n2; i++){
            System.out.println();
            System.out.println("Vendedor" + i + ": " + vvend[i]);
        }
        for(int i=0; i<n3; i++){
            System.out.println();
            System.out.println("Operario" + i + ": " + vop[i]);
        }
        for(int i=0; i<n4; i++){
            System.out.println();
            System.out.println("Horista" + i + ": " + vhorista[i]);
        }
        sc.close();
    }
}