
        public class Empresa {
            public static void main(String[] args) {

                Chefe c1 = new Chefe();
                c1.setNome("Maria");
                c1.setDataNasc("12/02/1970");
                c1.setCargo("Chefe");
                c1.setSalario(10000.00);

                Vendedor v1 = new Vendedor();
                v1.setNome("Joao");
                v1.setDataNasc("12/02/2000");
                v1.setCargo("Vendedor");
                v1.setValorFixo(1500.00);
                v1.setComissao(0.20);
                v1.setNumeroVendas(30);

                Operario o1 = new Operario();
                o1.setNome("Ze");
                o1.setDataNasc("02/05/1977");
                o1.setCargo("Operario");
                o1.setValorProducao(2000.00);
                o1.setQtdProduzida(4);

                Horista h1 = new Horista();
                h1.setNome("Carla");
                h1.setDataNasc("08/11/1988");
                h1.setCargo("Horista");
                h1.setHorasTrabalhadas(160);
                h1.setValorHora(200);

                FolhaDePagamento f1 = new FolhaDePagamento();
                FolhaDePagamento f2 = new FolhaDePagamento();
                FolhaDePagamento f3 = new FolhaDePagamento();
                FolhaDePagamento f4 = new FolhaDePagamento();
                f1.setNome("Maria");
                f1.setCargo("Chefe");
                f1.setSalario(10000.00);
                f2.setNome("Joao");
                f2.setCargo("Vendedor");
                f3.setNome("Ze");
                f3.setCargo("Operario");
                f4.setNome("Carla");
                f4.setCargo("Horista");


                Funcionario [] func = new Funcionario[4];
                func[0] = c1;
                func[1] = v1;
                func[2] = o1;
                func[3] = h1;

                //Imprime Valores
                for(int i=0; i<4; i++){
                    System.out.println();
                    System.out.println("Funcionario"+ i + ": " + func[i]);
                }
                //Imprime folha de pagamento
                System.out.println("\nFolha de Pagamento: \n");
                System.out.println("Nome\t\tCargo\t\tSalario\n");
                    System.out.println(f1.mostra());
                    System.out.println(f2.mostra());
                    System.out.println(f3.mostra());
                    System.out.println(f4.mostra());

            }
        }