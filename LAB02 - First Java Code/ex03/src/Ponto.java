import java.util.Scanner;

public class Ponto {
        double x,y;

     public void imprime_ponto(){
         Scanner entrada = new Scanner (System.in);

         System.out.println("Digite o valor de x: " + x);
         x = entrada.nextDouble();

         System.out.println("Digite o valor de y: " + y);
         y = entrada.nextDouble();

         System.out.println("O ponto digitado eh: " +"(" + x + "," + y + ")");
     }
}
