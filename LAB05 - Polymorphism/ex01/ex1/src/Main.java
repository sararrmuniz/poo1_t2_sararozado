
public class Main {
    public static void main(String[] args) {

        Circulo f1 = new Circulo(0,0,4);
        f1.obterArea(4);
        f1.info();

        Quadrado f2 = new Quadrado(2,3,0);
        f2.obterArea(3);
        f2.info();

        Triangulo f3 = new Triangulo(6,4,0);
        f3.obterArea(4,6);
        f3.info();

        Esfera f4 = new Esfera(0,0,6);
        f4.obterVolume(6);
        f4.info();

        Cubo f5 = new Cubo(2,2,0);
        f5.obterVolume(2);
        f5.info();

        Tetraedro f6 = new Tetraedro(2,4,0,6);
        f6.obterVolume(4,2,6);
        f6.info();

        Forma [] forma = new Forma[6];
        forma[0] = f1;
        forma[1] = f2;
        forma[2] = f3;
        forma[3] = f4;
        forma[4] = f5;
        forma[5] = f6;

        for(int i=0;i<6;i++) {
            if (forma[i] instanceof FormaBidimencional) {
                System.out.print(forma[i]);
            }
            else{
                System.out.print(forma[i]);
            }
        }
    }
}