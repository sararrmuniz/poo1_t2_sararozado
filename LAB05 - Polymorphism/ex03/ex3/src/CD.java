public class CD extends Item{
    private String artista;

    public CD(){}

    public CD(String titulo,int tempoDeDuracao,String comentarios,String artista){
        super(titulo,tempoDeDuracao,comentarios);
        this.artista=artista;
    }

    public String getArtista() {
        return artista;
    }


    public void print(){
        super.print();
        System.out.println("Dados do CD: " + getTitulo() + ", " + getTempoDeDuracao() + " , " + getArtista() + " , " + getComentarios());
    }
}
