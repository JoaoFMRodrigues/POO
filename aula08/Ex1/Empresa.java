package aula08.Ex1;
import java.util.ArrayList;

public class Empresa {
    
    private String nome;
    private String codigoPostal;
    private String mail;
    private ArrayList<Veiculo> viaturas;

    //constructor
    public Empresa(String nome, String codigoPostal, String mail) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.mail = mail;
        this.viaturas = new ArrayList<Veiculo>();
    }

    //get nome
    public String getNome() {
        return nome;
    }

    //set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //get codigoPostal
    public String getCodigoPostal() {
        return codigoPostal;
    }

    //set codigoPostal
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //get mail
    public String getMail() {
        return mail;
    }

    //set mail
    public void setMail(String mail) {
        this.mail = mail;
    }

    //get viaturas
    public ArrayList<Veiculo> getViaturas() {
        return viaturas;
    }

    //add viatura
    public void addViatura(Veiculo viatura) {
        this.viaturas.add(viatura);
    }

    //toString
    public String toString(){
        return "Empresa: " + nome + "; Código Postal: " + codigoPostal + "; Email: " + mail;
    }
}
