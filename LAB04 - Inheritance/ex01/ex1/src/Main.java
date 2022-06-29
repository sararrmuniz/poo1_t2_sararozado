
public class Main {
    public static void main(String[] args) {

        //sem parametros
        C1 c1 = new C1();
        c1.mostrar_atributos();

        //com parametros
        C1 c2 = new C1("João", "15/02/1989", "125.369.846-27");
        c2.mostrar_atributos();
        c2.mostrar_atributos_super();

        //sem parametros
        C2 c3 = new C2();
        c3.mostrar_atributos();

        //com parametros
        C2 c4 = new C2("José", "12/08/1990", "145.256.759-98", "03/06/1999", 256377, 3000.00);
        c4.mostrar_atributos();
        c4.mostrar_atributos_super();

        //sem parametros
        C3 c5 = new C3();
        c5.mostrar_atributos();

        //com parametros
        C3 c6 = new C3("Marcos", "25/12/1988", " 156.658.751-12", "MG-14.369.845", 145293, 2500.00, "Gol", "branco", "MHO1568");
        c6.mostrar_atributos();
        c6.mostrar_atributos_super();
    }
}