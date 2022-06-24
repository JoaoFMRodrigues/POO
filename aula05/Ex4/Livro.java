package aula05.Ex4;

public class Livro {

    private int id;
    private String titulo;
    private String tipoEmprestimo;
    private boolean Emprestado;
    private static int idCount = 100;
    
    //Constructor
    public Livro(String titulo, String tipoEmprestimo) {
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.id = idCount++;
    }

    //Constructor
    public Livro(String titulo) {
        this.id = idCount++;
        this.titulo = titulo;
        this.tipoEmprestimo = "NORMAL";
    }

    //returns the id of the book
    public int getId() {
        return id;
    }

    //returns the title of the book
    public String getTitulo() {
        return titulo;
    }

    //returns the Loan type of the book
    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    //check if the book is loaned
    public boolean Emprestado() {
        if (this.tipoEmprestimo.equalsIgnoreCase("CONDICIONAL")){
            return true;
        }
		return this.Emprestado;
	}

    //sets the title of the book
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //sets the Loan type of the book
    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    //sets the loan status of the book
    public void setEmprestado(boolean Emprestado) {
        this.Emprestado = Emprestado;
    }

    //returns the book's info
    public String toString() {
        return "Livro " + this.id + "; " + this.titulo + "; " + this.tipoEmprestimo;
    }
}
