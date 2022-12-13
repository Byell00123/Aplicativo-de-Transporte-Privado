public class Cartao_Credito extends Pessoa{

    private int cvv;
    private String nome_titular;
    private String senha;
    private float saldo;


    public Cartao_Credito() {
    }

    public Cartao_Credito(int cvv, String nome_titular, String senha, float saldo) {
        this.cvv = cvv;
        this.nome_titular = nome_titular;
        this.senha = senha;
        this.saldo = saldo;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNome_titular() {
        return this.nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}