public class Circulo {
    private double raio;
    private double ponto_central;
// check:<<<erro: a classe Ponto deveria ser usada para definir o 'ponto' na classe círculo >>>>

    public static final double PI = 3.14;

    public Circulo(){}
// check:<<<erro: era esperado no segundo construtor alguma funcionalidade >>>>

    public Circulo(double raio, double ponto_central){
        this.raio = raio;
        this.ponto_central = ponto_central;
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPonto_central() {
        return ponto_central;
    }

    public void setPonto_central(double ponto_central) {
        this.ponto_central = ponto_central;
    }

// check:<<<erro: não tem esse raio de parâmetro>>>>
    public double area(double raio){
        return PI*raio*raio;
    }
    public static double perimetro(double raio){
        return 2*PI*raio;
    }
}
