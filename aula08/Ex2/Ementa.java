package aula08.Ex2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ementa {

    private String nome;
    private String local;
    private Map<DiaSemana, ArrayList<Prato>> ementa; //ementa

    // Construtor
    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.ementa = new HashMap<>();
    }

    //get nome
    public String getNome() {
        return nome;
    }

    //set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get local
    public String getLocal() {
        return local;
    }

    //set local
    public void setLocal(String local) {
        this.local = local;
    }

    //get ementa
    public Map<DiaSemana, ArrayList<Prato>> getEmenta() {
        return ementa;
    }

    //set ementa
    public void setEmenta(Map<DiaSemana, ArrayList<Prato>> ementa) {
        this.ementa = ementa;
    }

    //add prato
    public boolean addPrato(Prato prato, DiaSemana dia) {
        //check day
        if (ementa.containsKey(dia)) {
            return ementa.get(dia).add(prato);
        } else {
            ArrayList<Prato> pratos = new ArrayList<>();
            pratos.add(prato);
            ementa.put(dia, pratos);
            return true;
        }
    }

    //toString (override)
    @Override
    public String toString() {
        String result = "Ementa: " + this.getNome() + " - " + this.getLocal() + "\n\n";

        for (DiaSemana dia : ementa.keySet()) {
            for (Prato prato : ementa.get(dia)) {
                result += prato + ", ";
            }

            result += dia + "\n";
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Ementa other = (Ementa) obj;
        return this.getNome().equals(other.getNome()) && this.getLocal().equals(other.getLocal())
                && this.getEmenta().equals(other.getEmenta());
    }

}
