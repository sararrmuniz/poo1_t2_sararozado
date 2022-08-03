public class Servico implements Classificavel{
    private String servico;

    public Servico(String servico) {
        this.servico = servico;
    }

    public boolean eMenorQue (Classificavel o) {
        Servico compara = (Servico) o;
        if (this.servico.compareTo(compara.servico) >0) {
            return true ;
        } else {
            return false ;
        }
    }
    public void imprime(){
        System.out.println("Vetor Ordenado: " + servico);
    }
}
