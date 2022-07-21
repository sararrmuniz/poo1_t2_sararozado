
    public abstract class Contato
    {
        protected String apelido, nome, email, aniversario;

        public Contato(String apelido, String nome, String email, String aniversario){
            this.apelido = apelido;
            this.nome = nome;
            this.email = email;
            this.aniversario = aniversario;
        }
        public Contato(){

        }

        public String imprimeBasico(){
            return "Apelido: " +this. apelido +
                    "\nNome: " + this.nome+
                    "\nEmail: " + this.email+
                    "\nAniversario: " + this.aniversario + "\n";
        }

        public abstract String imprimeContato();
    }
