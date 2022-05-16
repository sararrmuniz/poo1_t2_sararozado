#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

struct produto{
    char codigo[50];
    char nomeproduto[50];
    char fabricante[100];
    char preco[10]; 
};

struct cliente{
    char nomecliente[100];
    char cpf_cliente[20];
    char data_nasc_cli[20];
    char cep[10];
};

struct funcionario{
    char nomefunc[100];
    char cpf_func[20];
    char data_nasc_fun[20];
    char data_ingresso[20];
};

struct venda{
    struct produto;
    struct funcionario;
    struct cliente;
    int quant;
};

void cadastro1(struct produto T[], int *qtd)
{
    FILE *p;//ponteiro pra file ''p''
    p=fopen ("arquivo_produtos.txt","a");
    if (p==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }

        printf ("\nCodigo do produto: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].codigo);
        fprintf(p,"%s\n",T[*qtd].codigo);

        printf("\nNome do produto: \n");
        setbuf(stdin,NULL);
        scanf("%[^\n]s",T[*qtd].nomeproduto); //pega o valor e passa para o endereco da struct cadastro_produto
        fprintf(p,"%s\n",T[*qtd].nomeproduto); //passa para o arquivo

        printf ("\nFabricante do produto: \n");
        setbuf(stdin,NULL);
        scanf ("%[^\n]s", T[*qtd].fabricante);
        fprintf(p,"%s\n",T[*qtd].fabricante);

        printf ("\nPreco do produto: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].preco);
        fprintf(p,"R$%s\n",T[*qtd].preco);

         printf("\n");

    (*qtd)++;
    fclose(p);
  }

void cadastro2(struct cliente T[], int *qtd)
{
    FILE *c;
    c=fopen ("arquivo_clientes.txt","a");
    if (c==NULL) 
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }
        printf ("\nCPF do cliente: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].cpf_cliente);
        fprintf(c,"%s\n",T[*qtd].cpf_cliente);

        printf("\nNome do cliente: \n");
        setbuf(stdin,NULL);
        scanf("%[^\n]s",T[*qtd].nomecliente); //pega o valor e passa para o endereco da struct cadastro_cliente
        fprintf(c,"%s\n",T[*qtd].nomecliente); //passa para o arquivo

        printf ("\nData de nacimento do cliente: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].data_nasc_cli);
        fprintf(c,"%s\n",T[*qtd].data_nasc_cli);

        printf ("\nCEP do cliente: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].cep);
        fprintf(c,"%s\n",T[*qtd].cep);

         printf("\n");

    (*qtd)++;
    fclose(c);
  }

void cadastro3(struct funcionario T[], int *qtd)
{
    FILE *f;
    f=fopen ("arquivo_funcionarios.txt","a"); 
    if (f==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }
        printf ("\nCPF do funcionario: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].cpf_func);
        fprintf(f,"%s\n",T[*qtd].cpf_func);

        printf("\nNome do funcionario: \n");
        setbuf(stdin,NULL);
        scanf("%[^\n]s",T[*qtd].nomefunc); //pega o valor e passa para o endereco da struct cadastro_funcionario
        fprintf(f,"%s\n",T[*qtd].nomefunc); //passa para o arquivo

        printf ("\nData de nacimento do funcionario: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].data_nasc_fun);
        fprintf(f,"%s\n",T[*qtd].data_nasc_fun);

        printf ("\nData de ingresso do funcionario: \n");
        setbuf(stdin,NULL);
        scanf ("%s", T[*qtd].data_ingresso);
        fprintf(f,"%s\n",T[*qtd].data_ingresso);

         printf("\n");

    (*qtd)++;
    fclose(f);
}

void mostra_arquivo1 (struct produto T[]) //mostra os dados contidos no arquivo de arquivo_pedidos.txt
    {
    FILE *p;
    p=fopen ("arquivo_produtos.txt","r");
    if (p==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }

    while (1)
    {
        fscanf(p," %s\n",T->codigo); // pega do arquivo
       if (feof(p)) //se acabar o arquivo faz um break
            break;
        printf("Codigo: %s\n",T->codigo);
        fscanf (p,"%[^\n]s", T->nomeproduto);
        printf("Nome: %s\n",T->nomeproduto);
        fscanf (p,"%s", T->fabricante);
        printf("Fabricante: %s\n",T->fabricante);
        fscanf (p,"%s", T->preco);
        printf("Preco: %s\n",T->preco);
        printf("\n");

    }
    fclose(p);
}

void mostra_arquivo2 (struct cliente T[]) //mostra os dados contidos no arquivo de arquivo_clientes.txt
{
    FILE *c;
    c=fopen ("arquivo_clientes.txt","r");
    if (c==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }

    while (1)
    {
       fscanf(c," %s\n",T->cpf_cliente);
       if (feof(c))
            break;
        printf("CPF: %s\n",T->cpf_cliente);
        fscanf (c,"%[^\n]s", T->nomecliente);
        printf("Nome: %s\n",T->nomecliente);
        fscanf (c,"%s", T->data_nasc_cli);
        printf("Data de nascimento: %s\n",T->data_nasc_cli);
        fscanf (c,"%s", T->cep);
        printf("CEP: %s\n",T->cep);
    
        printf("\n");

    }
    fclose(c);
}

void mostra_arquivo3 (struct funcionario T[]) //mostra os dados contidos no arquivo de arquivo_funcionarios.txt
{
    FILE *f;
    f=fopen ("arquivo_funcionarios.txt","r"); //apenas leitura
    if (f==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }

    while (1)
    {
        fscanf(f," %s\n",T->cpf_func); //ta pegando do arquivo
       if (feof(f)) //se acabar o arquivo, break
            break;
        printf("CPF: %s\n",T->cpf_func);
        fscanf (f,"%[^\n]s", T->nomefunc);
        printf("Nome: %s\n",T->nomefunc);
        fscanf (f,"%s", T->data_nasc_fun);
        printf("Data de nascimento: %s\n",T->data_nasc_fun);
        fscanf (f,"%s", T->data_ingresso);
        printf("Data de ingresso: %s\n",T->data_ingresso);
        
        printf("\n");

    }
    fclose(f);
}

void vendas(struct venda T[], int *qtd) //cadastra as vendas realizadas no arquivo arquivo_vendas.txt
{
    FILE *v;
    v=fopen ("arquivo_vendas.txt","a"); 
    if (v==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }
    
        printf ("\nNome do Funcionario: \n");
        setbuf(stdin,NULL);
        scanf ("%[^\n]s", T[*qtd].nomefunc);
        fprintf(v,"%s\n",T[*qtd].nomefunc);

        printf("\nNome do Cliente: \n");
        setbuf(stdin,NULL);
        scanf("%[^\n]s",T[*qtd].nomecliente);
        fprintf(v,"%s\n",T[*qtd].nomecliente);

        printf ("\nProduto Vendido: \n");
        setbuf(stdin,NULL);
        scanf ("%[^\n]s", T[*qtd].nomeproduto);
        fprintf(v,"%s\n",T[*qtd].nomeproduto);

        printf ("\nQuantidade do Produto Vendido: \n");
        setbuf(stdin,NULL);
        scanf ("%d", &T[*qtd].quant);
        fprintf(v,"%d\n",T[*qtd].quant);

        printf("\n");

    (*qtd)++;

    fclose(v);
 }


void mostra_vendas(struct venda T[]) //mostra os dados contidos no arquivo de arquivo_vendas.txt
{
    FILE *v;
    v=fopen ("arquivo_vendas.txt","r"); //apenas leitura
    if (v==NULL)
    {
        printf("Erro ao ler arquivo!\n");
        system ("pause");
        exit(1);
    }

    while (1)
    {
        fscanf(v,"%s",T->nomefunc);
       if (feof(v))
            break;
        printf("Nome do Funcionario: %s\n",T->nomefunc);
        fscanf (v,"%s", T->nomecliente);
        printf("Nome do Cliente: %s\n",T->nomecliente);
        fscanf (v,"%s", T->nomeproduto);
        printf("Produto Vendido: %s\n",T->nomeproduto);
        fscanf(v,"%d", &T->quant);
        printf("Quantidade: %d\n",T->quant);
        printf("\n");

    }
    fclose(v);
}


void qnt_vendas_totais(struct venda T[])  //se acrescentar elementos na struct, tem q aumentar o divisor do tamanho
{
    FILE *v;
    int i=0,tam=0;
    char ch[100];

    v=fopen("arquivo_vendas.txt","r");
    if (v==NULL)
    {
        printf("Erro ao abrir arquivo!\n");
        system ("pause");
        exit(1);
    }
    while (1)
    {
        fgets(ch, 100, v);
        if (feof(v)) //se acabar o arquivo, break
            break;
        i++;
    }
    fclose(v);
    tam=i/4; //4 eh a qtd de dados q tem na struct
    if(tam>0)
    printf("Quantidade de vendas registradas: %d",tam);

}


void menu()
{
    int opcao;
    struct produto P[100];
    struct cliente C[100];
    struct funcionario F[100];
    struct venda V[100];
    int qtd=0;

    while(1)
    {
        printf("\n1- Cadastrar Produto");
        printf("\n2- Cadastrar Cliente");
        printf("\n3- Cadastrar Funcionario");
        printf("\n4- Cadastrar Venda");
        printf("\n5- Mostrar Produtos Cadastrados");
        printf("\n6- Mostrar Clientes Cadastrados");
        printf("\n7- Mostrar Funcionarios Cadastrados");
        printf("\n8- Mostrar Quantidade de Vendas");
        printf("\n9- Mostrar Historico de Vendas");
        printf("\n10- Sair");
        printf("\nDigite a opcao: ");
        scanf("%d", &opcao);
        printf("\n");

        if(opcao == 1) cadastro1(P,&qtd);
        if(opcao == 2) cadastro2(C,&qtd);
        if(opcao == 3) cadastro3(F,&qtd);
        if(opcao == 4) vendas(V,&qtd);
        if(opcao == 5) mostra_arquivo1(P);
        if(opcao == 6) mostra_arquivo2(C);
        if(opcao == 7) mostra_arquivo3(F);
        if(opcao == 8) qnt_vendas_totais(V);
        if(opcao == 9) mostra_vendas(V);
        if(opcao == 10) return;
    }
}

int main()
{
   menu();
}