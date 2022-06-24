package aula08.Ex2;
import java.util.ArrayList;

public class PratoVegetariano extends Prato implements Vegetariano {
    
    private ArrayList<Alimento> composicao;

    // Construtor
    public PratoVegetariano(String nome) {
        super(nome);
        this.composicao = new ArrayList<>();
    }

    //set composicao (override)
    @Override
    public void setComposicao(ArrayList<Alimento> alimentos) {
        for (Alimento a : alimentos)
            if (!(a instanceof Vegetariano)) throw new IllegalArgumentException("Prato não pode conter alimentos não vegetarianos");
            
        this.composicao = alimentos;
    }

    //add alimento
    public boolean addIngrediente(Alimento alimento) {
        if (!(alimento instanceof Vegetariano)) return false;
        return this.composicao.add(alimento);
    }
    
    //toString (override)
    @Override
    public String toString() {
        return super.toString() + " - Prato Vegetariano";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        PratoVegetariano other = (PratoVegetariano) obj;
        return this.getNome().equals(other.getNome());
    }
}
