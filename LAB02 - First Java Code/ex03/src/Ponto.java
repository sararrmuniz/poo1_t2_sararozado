import java.util.Scanner;

public class Ponto {
    double x1, x2;
    double y1, y2;

    public void imprime_ponto() {

        System.out.println("(" + x1 + "," + y1 + ")\n");
    }
    public void soma_pontos(){
        x1 = x1 + x2;
        y1 = y1 + y2;
        imprime_ponto();
    }
    static void calc_area(){
        double area,ponto1,ponto2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de p1: ");
        ponto1 = entrada.nextDouble();
        System.out.println("Digite o valor de p2: ");
        ponto2 = entrada.nextDouble();

        area = ponto1 * ponto2;

        System.out.println("A area do retangulo definida por " + ponto1 + " e " + ponto2+ " eh " + area
        +"\n");
    }
    public void multi_ponto(){
        double r1,r2;
        int k;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da constante: ");
        k = entrada.nextInt();
        System.out.println("Digite o valor de x: ");
        x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y: ");
        y1 = entrada.nextDouble();
        imprime_ponto();
        r1 = x1 * k;
        r2 = y1 * k;

        System.out.println("Resultado: " + "(" + x1 + "," + y1 + ")*" + k + "= (" + r1 + "," + r2 + ")");
    }
}