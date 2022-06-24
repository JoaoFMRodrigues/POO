package aula06.Ex1;

public class Pessoa {
    
    protected String nome;
    private int cc;
    private Date dataNasc;

    // Constructor
    public Pessoa(String nome, int cc, Date dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    //get name
    public String getName() {
        return nome;
    }

    //set name
    public void setName(String nome) {
        this.nome = nome;
    }

    //get cc
    public int getCc() {
        return cc;
    }

    //set cc
    public void setCc(int cc) {
        this.cc = cc;
    }

    //get data Nascimento (dataNasc)
    public Date getDataNasc() {
        return dataNasc;
    }

    //set data Nascimento (dataNasc)
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    //to string
    @Override public String toString() {
        return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
    }

}
