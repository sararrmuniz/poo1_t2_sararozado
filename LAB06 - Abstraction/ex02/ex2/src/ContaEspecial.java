public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(){}
    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return (false); // senha deve ser vá lida
        if (estado != 1)
            return (false); // conta deve ser ativa
        if (val <= 0)
            return (false); // val > 0
        if (val > saldo)
            return (false);

        saldo -= val;
        if (saldo == 0)
            estado = 2; // torna conta inativa
        return (true);
    }

    public void debitaValor(float val) {
        saldo -= val;
    }


    public float getSaldo(int pwd) {
        if (senha == pwd)
            return saldo;
        else
            return -1; // indicando que houve problema na senha
    }

    public void creditaValor(int pwd, float val) {
        if (senha == pwd)
            saldo += val;
    }

    protected int getEstado(int pwd) {
        if (senha == pwd)
            return estado;
        else
            return -1;
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd)
            estado = e;
    }

    protected boolean isSenha(int pwd) {
        if (senha == pwd)
            return true;
        else
            return false;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}
