public abstract class ContaCorrente {
    protected float saldo;
    protected int estado; // 1= conta ativa 2= conta inativa
    protected int numConta;
    protected int senha;

    public ContaCorrente(){}
    public ContaCorrente (float val , int num , int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; // conta ativa
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract boolean debitaValor (float val , int pwd );

    public abstract void debitaValor ( float val );

    public abstract float getSaldo ( int pwd );

    public abstract void creditaValor ( int pwd , float val );

    protected abstract int getEstado ( int pwd );

    protected abstract void setEstado ( int pwd , int e );

    protected abstract boolean isSenha ( int pwd );

}
