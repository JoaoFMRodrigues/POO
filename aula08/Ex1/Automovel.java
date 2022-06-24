package aula08.Ex1;

public abstract class Automovel extends Veiculo {

    private int nQuadro;

    //constructor
    public Automovel(String matricula, String marca, String modelo, int potencia, int nQuadro) {
        super(matricula, marca, modelo, potencia);
        this.nQuadro = nQuadro;
    }
    
    //get nQuadro
    public int getnQuadro() {
        return nQuadro;
    }

    //set nQuadro
    public void setnQuadro(int nQuadro) {
        this.nQuadro = nQuadro;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Automovel] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + nQuadro;
    }
}
