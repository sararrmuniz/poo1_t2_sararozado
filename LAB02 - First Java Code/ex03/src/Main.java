import java.util.Scanner;

public class Main{

    public static void main (String[] args)
    {
        Ponto p1 = new Ponto();

        Scanner entrada = new Scanner(System.in);

        //imprime_ponto
        System.out.println("Digite o valor de x: ");
        p1.x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y: ");
        p1.y1 = entrada.nextDouble();
        p1.imprime_ponto();

        //soma_pontos
        System.out.println("Digite o valor de x1: ");
        p1.x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y1: ");
        p1.y1 = entrada.nextDouble();

        System.out.println("Digite o valor de x2: ");
        p1.x2 = entrada.nextDouble();
        System.out.println("Digite o valor de y2: ");
        p1.y2 = entrada.nextDouble();
        System.out.print("A soma de " + "(" + p1.x1 + "," + p1.y1 + ") e " + "(" + p1.x2 + "," + p1.y2 + ") eh ");
        p1.soma_pontos();

        //area do retangulo
        Ponto.calc_area();

        //multi_ponto
        p1.multi_ponto();
    }
}