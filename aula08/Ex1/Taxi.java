package aula08.Ex1;

public class Taxi extends Ligeiro{

    private int nLicenca;

    //constructor
    public Taxi(String matricula, String marca, String modelo, int potencia, int nQuadro, int capacidadeBagageira, int nLicenca) {
        super(matricula, marca, modelo, potencia, nQuadro, capacidadeBagageira);
        this.nLicenca = nLicenca;
    }

    //get nLicenca
    public int getnLicenca() {
        return nLicenca;
    }

    //set nLicenca
    public void setnLicenca(int nLicenca) {
        this.nLicenca = nLicenca;
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Taxi] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + getCapacidadeBagageira() + "; Número de Licença: " + nLicenca;
    }
    
}
