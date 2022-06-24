package aula08.Ex2;

public class PratoDieta  extends Prato {
    
    private double maxCalorias;
    private double calorias;

    // Construtor
    public PratoDieta(String nome, double maxCalorias) {
        super(nome);
        this.maxCalorias = maxCalorias;
    }

    //get calorias
    public double getCalorias() {
        return calorias;
    }

    //get maxCalorias
    public double getLimiteCalorias() {
        return maxCalorias;
    }

    //set maxCalorias
    public void setLimiteCalorias(double maxCalorias) {
        this.maxCalorias = maxCalorias;
    }

    //add alimento (override)
    @Override
    public boolean addIngrediente(Alimento alimento) {
        for (Alimento a : this.getComposicao()) {
            this.calorias += a.getCalorias();
        }
        if (this.getLimiteCalorias() <= this.calorias + alimento.getCalorias()) {
            return super.addIngrediente(alimento);
        } else {
            return false;
        }
    }

    //toString (override)
    @Override
    public String toString() {
        return super.toString() + " - Dieta (" + this.getCalorias() + " Calorias)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        PratoDieta other = (PratoDieta) obj;
        return super.equals(obj) && this.getLimiteCalorias() == other.getLimiteCalorias();
    }
}
