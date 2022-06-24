package aula05.Ex5;
import java.util.Scanner;
import aula05.Input;
import aula05.Ex4.Livro;
import aula05.Ex4.Utilizador;

public class Ex5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Livro catalogo[] = new Livro[100];
		Utilizador utilizadores[] = new Utilizador[100];
		int input = 0;
		int numUtilizadores = 0;
		int numLivros = 0;

		while (input != 8) {
			// Menu
			System.out.println("1 - inscrever utilizador");
			System.out.println("2 - remover utilizador");
			System.out.println("3 - imprimir lista de utilizadores");
			System.out.println("4 - registar um novo livro");
			System.out.println("5 - imprimir lista de livros");
			System.out.println("6 - emprestar");
			System.out.println("7 - devolver");
			System.out.println("8 - sair");

			// Input option
			input = Input.getInt("Seleciona uma opção: ", sc, 1, 8);

			switch (input) {
				// Inscrever utilizador
				case 1:
					System.out.println("\n > Inscrever utilizador");
					// get info
					int nMec = Input.getInt("Número de mec: ", sc);
					String name = Input.getString("Nome: ", sc);
					String course = Input.getString("Curso: ", sc);
					// create User
					utilizadores[numUtilizadores++] = new Utilizador(name, nMec, course);
					break;

				// Remover utilizador
				case 2:
					System.out.println("\n > Remover utilizador");
					// get info
					int nMec2 = Input.getInt("Número de mec: ", sc);
					int i = 0;
					boolean match = false;

					// find user and remove (set null)
					while (i < numUtilizadores && !match) {
						if (utilizadores[i].getnMec() == nMec2) {
							match = true;
							utilizadores[i] = null;
						}
						i++;
					}
					// if not found
					if (!match) System.out.println("Número mec não foi encontrado.");
					break;

				// Imprimir lista de utilizadores
				case 3:
					System.out.println("\n > Lista de utilizadores");
					// print list of users
					for (int j = 0; j < numUtilizadores; j++) {
						if (utilizadores[j] != null) {
							System.out.println(utilizadores[j]);
						} 
					}
					break;
				
				// Registrar um novo livro
				case 4:
					System.out.println("\n > Registar um novo livro");
					// get info
					String title = Input.getString("Título: ", sc);
					String typeLoan = Input.getString("Tipo de empréstimo: ", sc);
					// create book
					catalogo[numLivros++] = new Livro(title, typeLoan);
					break;

				// Imprimir lista de livros
				case 5:
					System.out.println("\n > Lista de Livros");
					// print list of books
					for (int j = 0; j < numLivros; j++) {
						if (catalogo[j] != null) {
							System.out.println(catalogo[j]);
						} 
					}
					break;

				// Emprestar
				case 6:
					System.out.println("\n > Emprestar um livro");
					// get info
					int nMec3 = Input.getInt("Número de mec: ", sc);
					int id = Input.getInt("id do livro: ", sc);
					// find user and book
					Utilizador utilizador = getUser(nMec3, utilizadores, numUtilizadores);
					Livro livro = getBook(id, catalogo, numLivros);

					// borrow book
					if (utilizador != null && livro != null) {
						if (livro.Emprestado()) {
							System.out.println("Livro já se encontra emprestado.");
						} else {
							if (utilizador.getBooks() != null && utilizador.getBooks().size() >= 3) {
								System.out.println("O Utilizador já tem 3 livros emprestados.");
							} else {
								utilizador.addBook(livro.getId());
								livro.setEmprestado(true);
								System.out.println("Sucesso! Livro foi emprestado.");
							}
						}
					} else {
						System.out.println("Número mec/id do livro é inválido.");
					}
					break;

				// Devolver
				case 7:
					System.out.println("\n > Devolver um livro");
					// get info
					int nMec4 = Input.getInt("Número de mec: ", sc);
					int id2 = Input.getInt("id do livro: ", sc);
					// find user and book
					Utilizador utilizador2 = getUser(nMec4, utilizadores, numUtilizadores);
					Livro livro2 = getBook(id2, catalogo, numLivros);

					// return book
					if (utilizador2 != null && livro2 != null) {
						if (!livro2.Emprestado()) {
							System.out.println("O Livro não está emprestado.");
						} else {
							if (!utilizador2.hasBook(livro2.getId())) {
								System.out.println("Livro não está emprestado a este utilizador.");
							} else {
								utilizador2.removeBook(livro2.getId());
								livro2.setEmprestado(false);
								System.out.println("Sucesso! Livro foi devolvido.");
							}
						}
					} else {
						System.out.println("Número mec/id do livro é inválido.");
					}
					break;
				
				// Exit
				case 8:
					break;
			}

		}
	}

	// get user
	public static Utilizador getUser(int nMec, Utilizador utilizadores[], int numUtilizadores) {
		int i = 0;
		boolean match = false;

		while (i < numUtilizadores && !match) {
			if (utilizadores[i].getnMec() == nMec) {
				match = true;
				return utilizadores[i];
			}
			i++;
		}

		//return null if not found
		return null;
	}

	// get book
	public static Livro getBook(int id, Livro catalogo[], int numLivros) {
		int i = 0;
		boolean match = false;

		while (i < numLivros && !match) {
			if (catalogo[i].getId() == id) {
				match = true;
				return catalogo[i];
			}
			i++;
		}

		//return null if not found
		return null;
	}
}