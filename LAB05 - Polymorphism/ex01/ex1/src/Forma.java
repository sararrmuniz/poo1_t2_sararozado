public class Forma {
    private double largura, altura, raio;
    public static final double PI = 3.14159;

    public Forma(double altura, double largura, double raio){
        this.altura=altura;
        this.largura=largura;
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}