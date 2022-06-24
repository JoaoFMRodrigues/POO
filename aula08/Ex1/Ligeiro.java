package aula08.Ex1;

public class Ligeiro extends Automovel {
    
    private int capacidadeBagageira;

    //constructor
    public Ligeiro(String matricula, String marca, String modelo, int potencia, int nQuadro, int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia, nQuadro);
        this.capacidadeBagageira = capacidadeBagageira;
    }

    //get capacidadeBagageira
    public int getCapacidadeBagageira() {
        return capacidadeBagageira;
    }

    //set capacidadeBagageira
    public void setCapacidadeBagageira(int capacidadeBagageira) {
        this.capacidadeBagageira = capacidadeBagageira;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Ligeiro] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + capacidadeBagageira;
    }
}
