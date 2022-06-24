package aula09.Ex1;
import aula07.Ex2.Date;

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

        //equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
    
            final Pessoa other = (Pessoa) obj;
            return this.cc == other.cc && this.nome.equals(other.nome) && this.dataNasc.equals(other.dataNasc);
        }
    
        //hashCode
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
            result = prime * result + cc;
            result = prime * result + ((dataNasc == null) ? 0 : nome.hashCode());
            return result;
        }

}
