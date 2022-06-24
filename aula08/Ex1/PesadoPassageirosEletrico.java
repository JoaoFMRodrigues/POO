package aula08.Ex1;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements Eletrico {
    
    private int charge = 100;
    private int autonomy;

    // Construtor
    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso, int nMaxPassageiros, int autonomia, int charge) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, peso, nMaxPassageiros);
        this.autonomy = autonomia;
        this.charge = charge;
    }

    // Construtor
    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso, int nMaxPassageiros, int autonomia) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, peso, nMaxPassageiros);
        this.autonomy = autonomia;
    }

    //get charge
    public int getCharge() {
        return charge;
    }

    //set charge
    public void setCharge(int charge) {
        this.charge = charge;
    }

    //get autonomy
    public int autonomia() {
        return autonomy;
    }

    //set autonomy
    public void setAutonomia(int autonomy) {
        this.autonomy = autonomy;
    }

    //charge
    public void carregar(int cargaAdicional) {
        this.charge += cargaAdicional;

        //make sure charge never exceeds 100
        if (this.charge > 100) {
            this.charge = 100;
        }
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Pesado Passageiros Eletrico] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Peso: " + getPeso() + "; Número máximo de passageiros: " + getnMaxPassageiros() + "; Autonomia: " + autonomia() + "; Carga: " + getCharge();
    }
    
}
