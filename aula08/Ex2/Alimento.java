package aula08.Ex2;

public class Alimento {

    private double proteinas;
    private double calorias;
    private double peso;

    // Construtor
    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    //get proteinas
    public double getProteinas() {
        return proteinas;
    }

    //set proteinas
    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    //get calorias
    public double getCalorias() {
        return calorias;
    }

    //set calorias
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    //get peso
    public double getPeso() {
        return peso;
    }

    //set peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //toString
    public String toString() {
        return "[Alimento] : " + "Proteinas= " + proteinas + "; Calorias= " + calorias + "; Peso=" + peso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Alimento other = (Alimento) obj;
        return getProteinas() == other.getProteinas() &&
                getCalorias() == other.getCalorias() &&
                getPeso() == other.getPeso();
    }
    
}
