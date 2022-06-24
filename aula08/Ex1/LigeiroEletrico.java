package aula08.Ex1;

public class LigeiroEletrico extends Ligeiro implements Eletrico {
    
    private int charge = 100;
    private int autonomy;

    //constructor
    public LigeiroEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira, int autonomia, int charge) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, capacidadeDaBagageira);
        this.autonomy = autonomia;
        this.charge = charge;
    }

    public LigeiroEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira, int autonomia) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, capacidadeDaBagageira);
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
        return "[Ligeiro Eletrico] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Número do Quadro: " + getnQuadro() + "; Capacidade da bagagem: " + getCapacidadeBagageira() + "; Autonomia: " + autonomia() + "; Carga: " + getCharge();
    }

}
