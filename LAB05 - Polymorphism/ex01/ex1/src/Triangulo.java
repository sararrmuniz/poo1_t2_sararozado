public class Triangulo extends FormaBidimencional{

    public Triangulo(double altura, double largura, double raio) {
        super(altura, largura, raio);
    }

    public double obterArea(double largura, double altura){
        return (largura*altura)/2;
    }

    public void info(){
        System.out.println("Triangulo");
        System.out.println(">Eh uma forma bidimencional!");
        System.out.println(">Possui tres lados");
        System.out.println(">Sua area eh dada por largura*altura/2\n");
    }

    public String toString(){
        return "Area do Triangulo = " + String.format("%.2f",obterArea(getLargura(),getAltura())) + " m^2\n";
    }
}
