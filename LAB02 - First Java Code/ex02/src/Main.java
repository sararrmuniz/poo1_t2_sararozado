public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.codigo = "15632ABC";
        produto1.nome = "Iphone 12";
        produto1.fabricante = "Apple";
        produto1.preco = 5900.00;

        System.out.println("Produtos cadastrados: " + "\n");

        System.out.println("Codigo do produto: " + produto1.codigo);
        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Fabricante do produto: " + produto1.fabricante);
        System.out.println("Preco do produto: " + "R$" + produto1.preco + "\n");

        Clientes cliente1 = new Clientes();
        cliente1.cpf = "151.639.874-56";
        cliente1.nome = "Ana Laura";
        cliente1.datanasc = "25/02/2001";
        cliente1.cep = "35986-574";

        System.out.println("Clientes cadastrados: " + "\n");

        System.out.println("CPF do cliente: " + cliente1.cpf);
        System.out.println("Nome do cliente: " + cliente1.nome);
        System.out.println("Data de nascimento: " + cliente1.datanasc);
        System.out.println("Cep do cliente: " + cliente1.cep + "\n");

        Funcionarios func1 = new Funcionarios();
        func1.cpf = "169.859.426-69";
        func1.nome = "Antonio Freitas";
        func1.datanasc = "01/02/1994";
        func1.dataingresso = "05/11/2021";

        System.out.println("Funcionarios cadastrados: " + "\n");

        System.out.println("CPF do funcionario: " + func1.cpf);
        System.out.println("Nome do funcionario: " + func1.nome);
        System.out.println("Data de nascimento: " + func1.datanasc);
        System.out.println("Data de ingresso: " + func1.dataingresso);
    }
}