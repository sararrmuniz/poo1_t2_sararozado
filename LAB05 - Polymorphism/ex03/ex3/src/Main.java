public class Main {
    public static void main(String[] args) {
        Item i1, i2;
        //i1 = new Item();
        i1 = new CD("Red",2,"Versao Deluxe","Taylor Swift");
        i2 = new DVD("BenHur",4,"Filme de 1959 Blue-ray","William Wyler");

        i1.print();
        i2.print();

    }
}