package aula08.Ex2;

public class Carne extends Alimento {
    
    private VariedadeCarne variedadeCarne;

    // Construtor
    public Carne(VariedadeCarne variedadeCarne, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.variedadeCarne = variedadeCarne;
    }


    //get variedade
    public VariedadeCarne getVariedadeCarne() {
        return variedadeCarne;
    }

    //set variedade
    public void setVariedadeCarne(VariedadeCarne variedadeCarne) {
        this.variedadeCarne = variedadeCarne;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Carne] : Variedade: " + this.getVariedadeCarne() + "; Proteinas: " + this.getProteinas() + "; Calorias: " + this.getCalorias() + "; Peso: " + this.getPeso();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Carne other = (Carne) obj;
        return super.equals(obj) && this.getVariedadeCarne() == other.getVariedadeCarne();
    }
}
