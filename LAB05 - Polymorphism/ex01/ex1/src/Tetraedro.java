public class Tetraedro extends FormaTridimencional{

    private double alturaTri;

    public Tetraedro(double altura, double largura, double raio, double alturaTri) {
        super(altura, largura, raio);
        this.alturaTri=alturaTri;
    }

    public double obterArea(double largura){
        return largura*largura*Math.sqrt(3);
    }
    public double obterVolume(double largura, double altura, double alturaTri){
        return ((largura*altura)/2)*alturaTri;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }

    public void info(){
        System.out.println("Tetraedro:");
        System.out.println(">Eh uma forma tridimencional!");
        System.out.println(">Possui area e volume");
        System.out.println(">Seu volume eh dado por (1/3)*AreaBase*altura\n");
    }
    public String toString(){
        return "Volume do Tetraedro = " + String.format("%.2f",obterVolume(getLargura(),getAltura(),getAlturaTri()))  + " m^3\n";
    }
}
