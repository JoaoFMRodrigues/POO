package aula08.Ex1;

public class PesadoMercadorias extends Pesado {
    
    private int cargaMax;

    //constructor
    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso, int cargaMax) {
        super(matricula, marca, modelo, potencia, nQuadro, peso);
        this.cargaMax = cargaMax;
    }

    //get cargaMax
    public int getCargaMax() {
        return cargaMax;
    }

    //set cargaMax
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Pesado Mercadorias] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + getPeso() + "; Carga máxima: " + cargaMax;
    }
}

