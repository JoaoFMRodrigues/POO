package aula06.Ex1;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    
    private int NMec;
    private Date dataInscricao;
    private static int NMecCounter = 100;
    
    //constructor (Custom date)
    public Aluno(String nome, int cc, Date dataNasc, Date dataInsc) {
        super(nome, cc, dataNasc); //get name, cc, dataNasc from superclass Pessoa
        this.NMec = NMecCounter++; //increment NMecCounter and assign to NMec
        this.dataInscricao = dataInsc; //custom date (class Date)
    }
    //constructor (current date)
    public Aluno(String nome, int cc, Date dataNasc) {
        super(nome, cc, dataNasc); //get name, cc, dataNasc from superclass Pessoa
        this.NMec = NMecCounter++; //increment NMecCounter and assign to NMec
        this.dataInscricao = new Date(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear()); //current date (LocalDate)
    }

    //get NMec
    public int getNMec() {
        return NMec;
    }

    //get dataInscricao
    public Date getDataInscricao() {
        return dataInscricao;
    }

    //set dataInscricao
    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    //to string override superclass
    @Override public String toString() {
        return nome + "; Número Mec.: " + NMec + "; Data de Inscrição: " + dataInscricao;
    }
}
