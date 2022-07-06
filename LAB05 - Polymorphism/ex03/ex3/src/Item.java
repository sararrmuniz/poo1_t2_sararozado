public class Item {
    private String titulo;
    private int tempoDeDuracao;
    private String comentarios;

    public Item(){}

    public Item(String titulo,int tempoDeDuracao,String comentarios){
        this.titulo = titulo;
        this.tempoDeDuracao=tempoDeDuracao;
        this.comentarios=comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }
    public void print(){
        System.out.println();
    }
}
