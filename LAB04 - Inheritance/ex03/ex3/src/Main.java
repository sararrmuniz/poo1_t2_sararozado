public class Main {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso(100);
        ingresso.valor();

        VIP vip = new VIP(100, 80);
        double ing = vip.calcula_ingressoVip();
        System.out.println("Ingresso VIP: R$ " + ing);
        vip.calcula_ingressoVip();
        System.out.println();

        Normal normal = new Normal(100);
        normal.ingresso_normal();
        System.out.println();

        CamaroteInferior inferior = new CamaroteInferior(100,100, "Camarote Inferior, cadeira A3");
        inferior.imprimeLocalizacao();
        System.out.println();

        CamaroteSuperior superior = new CamaroteSuperior(100,80,50);
        System.out.print("Ingresso Camarote Superior: R$ ");
        System.out.print(superior.calcula_valorCamarote());
        superior.calcula_valorCamarote();
        System.out.println();

    }

}
