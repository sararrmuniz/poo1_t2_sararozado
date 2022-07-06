public class Circulo extends FormaBidimencional{

    public Circulo(double altura, double largura, double raio){
        super(altura,largura,raio);
    }

    public double obterArea(double raio){
        return PI*raio*raio;
    }

    public void info(){
        System.out.println("Circulo:");
        System.out.println(">Eh uma forma bidimencional!");
        System.out.println(">Possui raio e diametro");
        System.out.println(">Sua area eh dada por raio^2*PI\n");

    }
    public String toString(){
        return "Area do Circulo = " + String.format("%.2f",obterArea(getRaio())) + " m^2\n";
    }
}
