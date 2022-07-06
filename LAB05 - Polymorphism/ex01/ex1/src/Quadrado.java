public class Quadrado extends FormaBidimencional{

    public Quadrado(double altura, double largura, double raio){
        super(altura,largura,raio);
    }

    public double obterArea(double largura){
        return largura*largura;
    }

    public void info(){
        System.out.println("Quadrado:");
        System.out.println(">Eh uma forma bidimencional!");
        System.out.println(">Possui quatro lados");
        System.out.println(">Sua area eh dada por 2*largura\n");

    }
    public String toString(){
        return "Area do Quadrado = " + String.format("%.2f",obterArea(getLargura())) + " m^2\n";
    }
}
