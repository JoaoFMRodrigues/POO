package aula08.Ex1;

public abstract class Pesado extends Automovel{
    
    private int peso;

    //constructor
    public Pesado(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro);
        this.peso = peso;
    }

    //get peso
    public int getPeso() {
        return peso;
    }

    //set peso
    public void setPeso(int peso) {
        this.peso = peso;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Pesado] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + peso;
    }
}
