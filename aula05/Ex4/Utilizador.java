package aula05.Ex4;
import java.util.ArrayList;

public class Utilizador {

    private String nome;
    private int nMec;
    private String curso;
    private ArrayList<Integer> books;

    // Constructor
    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    //returns the name of the user
    public String getName() {
        return nome;
    }

    //returns the number of the user
    public int getnMec() {
        return nMec;
    }

    //returns the course of the user
    public String getCurso() {
        return curso;
    }
    
    //sets the name of the user
    public void setName(String nome) {
        this.nome = nome;
    }

    //sets the number of the user
    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    //sets the course of the user
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //returns the user's books info
    public ArrayList<Integer> getBooks() {
		return books;
	}
    
    //adds a book to the user's info
    public void addBook(int id) {
		if (this.books == null) {
			this.books = new ArrayList<Integer>();
		}
		this.books.add(id);
	}

    //removes a book from the user's info
    public void removeBook(int id) {
		if (this.books != null) {
			this.books.remove(this.books.indexOf(id));
		}
	}

    //check if the user has a book
    public boolean hasBook(int id) {
        if (this.books != null) {
			return this.books.contains(id);
		}
		return false;
	}

    //returns the user's info
    public String toString() {
		return "Aluno: " + this.nMec + "; " + this.nome + "; " + this.curso;
	}

}
