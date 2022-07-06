public class Cubo extends FormaTridimencional{

    public Cubo(double altura, double largura, double raio) {
        super(altura, largura, raio);
    }

    public double obterArea(double largura){
        return 6*largura*largura;
    }
    public double obterVolume(double largura){
        return largura*largura*largura;
    }
    public void info(){
        System.out.println("Cubo:");
        System.out.println(">Eh uma forma tridimencional!");
        System.out.println(">Possui area e volume");
        System.out.println(">Seu volume eh dado por largura^3\n");
    }
    public String toString(){
        return "Volume do Cubo = " + String.format("%.2f",obterVolume(getLargura())) + " m^3\n";
    }
}
