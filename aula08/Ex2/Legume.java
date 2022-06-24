package aula08.Ex2;

public class Legume extends Alimento implements Vegetariano {

    private String nome;

    //construtor
    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    //get nome
    public String getNome() {
        return nome;
    }

    //set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Legume - V] : Nome: " + this.getNome() + "; Proteinas: " + this.getProteinas() + "; Calorias: " + this.getCalorias() + "; Peso: " + this.getPeso();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Legume other = (Legume) obj;
        return super.equals(obj) && this.getNome().equals(other.getNome());
    }
    
}
