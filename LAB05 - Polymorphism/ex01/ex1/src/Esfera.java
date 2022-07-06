public class Esfera extends FormaTridimencional{

    public Esfera(double altura, double largura, double raio) {

        super(altura, largura, raio);
    }

    public double obterArea(double raio){
        return 4*PI*raio*raio;
    }
    public double obterVolume(double raio){
        return (4*PI*raio*raio*raio)/3;
    }

    public void info(){
        System.out.println("Esfera:");
        System.out.println(">Eh uma forma tridimencional!");
        System.out.println(">Possui area e volume");
        System.out.println(">Seu volume eh dado por (4/3)*PI*Raio^3\n");
    }

    public String toString(){
        return "Volume da Esfera = " + String.format("%.2f",obterVolume(getRaio())) + " m^3\n";
    }
}
