public abstract class Pessoa extends Endereco{

    private int CPF;
    private String nome;
    private String data_nasc;


    public Pessoa() {
    }


    public Pessoa(int CPF, String nome, String data_nasc) {
        this.CPF = CPF;
        this.nome = nome;
        this.data_nasc = data_nasc;
    }

    public int getCPF() {
        return this.CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getData_nasc() {
        return this.data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }


}