package aula08.Ex1;

public class Motociclo extends Veiculo {
    
    private String tipo; //tipo (desportivo ou estrada)

    //constructor
    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo, potencia);
        tipo = tipo.toUpperCase();
        checkTipo(tipo);
        this.tipo = tipo.toLowerCase();
    }

    //check tipo
    private void checkTipo(String tipo) {
        if (!tipo.equals("DESPORTIVO") && !tipo.equals("ESTRADA")) {
            throw new IllegalArgumentException("Tipo inválido");
        }
    }

    //get tipo
    public String getTipo() {
        return tipo;
    }

    //set tipo
    public void setTipo(String tipo) {
        tipo.toUpperCase();
        checkTipo(tipo);
        this.tipo = tipo.toLowerCase();
    }

    //toString (override)
    @Override
    public String toString() {
        return "[Motociclo] Matrícula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + "; Potencia (cv): " + getPotencia() + "; Tipo: " + tipo;
    }
}
