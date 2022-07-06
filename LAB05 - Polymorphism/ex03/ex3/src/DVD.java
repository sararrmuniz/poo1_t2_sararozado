public class DVD extends Item{
    private String diretor;

    public DVD(){}

    public DVD(String titulo,int tempoDeDuracao,String comentarios,String diretor){
        super(titulo, tempoDeDuracao, comentarios);
        this.diretor=diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void print(){
        super.print();
        System.out.println("Dados do DVD: " + getTitulo() + ", " + getTempoDeDuracao() + " , " + getComentarios()+ " , " + getDiretor());
    }
}
