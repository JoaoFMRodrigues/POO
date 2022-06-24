package aula08.Ex1;

public class PesadoPassageiros extends Pesado {
    
    private int nMaxPassageiros;

    //constructor
    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso, int nMaxPassageiros) {
        super(matricula, marca, modelo, potencia, nQuadro, peso);
        this.nMaxPassageiros = nMaxPassageiros;
    }

    //get nMaxPassageiros
    public int getnMaxPassageiros() {
        return nMaxPassageiros;
    }

    //set nMaxPassageiros
    public void setnMaxPassageiros(int nMaxPassageiros) {
        this.nMaxPassageiros = nMaxPassageiros;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Pesado Passageiros] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + getPeso() + "; Número máximo de passageiros: " + nMaxPassageiros;
    }
}
