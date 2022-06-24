package aula08.Ex1;

public abstract class Veiculo implements KmPercorridosInterface {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int ultimoTrajeto = 0; //starting value
    private int distanciaTotal = 0;//starting value

    //constructor
    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    //get matricula
    public String getMatricula() {
        return matricula;
    }

    //set matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //get marca
    public String getMarca() {
        return marca;
    }

    //set marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //get modelo
    public String getModelo() {
        return modelo;
    }

    //get potencia
    public int getPotencia() {
        return potencia;
    }

    //set potencia
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //log ultimo trajeto
    public void trajeto(int quilometros) {
        System.out.println("Matrícula: " + this.getMatricula() + " | Quilometros: " + quilometros);
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    //get ultimo trajeto
    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }
    //get distancia total
    public int distanciaTotal() {
        return this.distanciaTotal;
    }

}
