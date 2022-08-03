import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("<<<Preencha o circulo1>>>\n");
        System.out.println("Digite o valor de x: ");
        p1.setX(entrada.nextDouble());
        System.out.println("Digite o valor de y: ");
        p1.setY(entrada.nextDouble());

        System.out.println("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        double area = c1.area(raio);
        System.out.printf("AREA = %.2f\n", area);

        double perimetro = Circulo.perimetro(raio);
        System.out.printf("PERIMETRO = %.2f\n", perimetro);

        System.out.println();
        System.out.println("Dados do Circulo1:\n");
        System.out.println("Raio=" + raio + "\nArea=" + area + " \nPerimetro=" + perimetro + "\nx=" + p1.getX() + "\ny=" + p1.getY());
        System.out.println("Ponto Central= (" + p1.getX() +"," + p1.getY() + ")");

        //Circulo 2// check:<<<erro: foi pedido vetor de círculo>>>>
        System.out.println("\n<<<Preencha o circulo2>>>\n ");
        System.out.println("Digite o valor de x: ");
        p2.setX(entrada.nextDouble());
        System.out.println("Digite o valor de y: ");
        p2.setY(entrada.nextDouble());

        System.out.println("Digite o valor do raio: ");
        double raio2 = entrada.nextDouble();

        double area2 = c2.area(raio2);
        System.out.printf("AREA = %.2f\n", area2);

        double perimetro2 = Circulo.perimetro(raio2);
        System.out.printf("PERIMETRO = %.2f\n", perimetro2);

        System.out.println();
        System.out.println("Dados do Circulo2:\n");
        System.out.println("Raio=" + raio2 + "\nArea=" + area2 + " \nPerimetro=" + perimetro2 + "\nx=" + p2.getX() + "\ny=" + p2.getY());
        System.out.println("Ponto Central= (" + p2.getX() +"," + p2.getY() + ")");
        System.out.println();

        if(area>area2){
            System.out.println("O circulo 1 possui maior area!");
        }
        else{
            System.out.println("O circulo 2 possui maior area!");
        }
    }
}