package aula08.Ex2;
import java.util.ArrayList;

public class Prato {
    
    private String nome;
    private ArrayList<Alimento> composicao;

    // Construtor
    public Prato(String nome) {
        this.nome = nome;
        this.composicao = new ArrayList<>();
    }

    //get nome
    public String getNome() {
        return nome;
    }

    //set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get composicao
    public ArrayList<Alimento> getComposicao() {
        return composicao;
    }

    //set composicao
    public void setComposicao(ArrayList<Alimento> composicao) {
        this.composicao = composicao;
    }

    //add alimento
    public boolean addIngrediente(Alimento alimento) {
        return this.composicao.add(alimento);
    }

    //toString (override)
    @Override
    public String toString() {
        return "Prato" + " '" + this.getNome() + "', composto por " + this.composicao.size() + " Ingredientes";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Prato other = (Prato) obj;
        return this.getNome().equals(other.getNome());
    }
}
