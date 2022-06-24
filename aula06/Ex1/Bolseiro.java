package aula06.Ex1;

public class Bolseiro extends Aluno{

    private int value;

    //constructor
    public Bolseiro(String nome, int cc, Date dataNasc, int value) {
        super(nome, cc, dataNasc);
        this.value = value;
    }

    //get value
    public int getBolsa() {
        return value;
    }
    //set value
    public void setBolsa(int value) {
        this.value = value;
    }

    //to string superclass
    @Override public String toString() {
        return nome + "; Montante Mensal da Bolsa: " + value;
    }
}
