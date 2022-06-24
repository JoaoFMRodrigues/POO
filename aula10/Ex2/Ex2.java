package aula10.Ex2;

public class Ex2 {
	public static void main(String[] args) {
		
        Termo t = new Termo();

        //adicionar termos e respetivo significado
        t.adicionar("termo-1", "significado-1");
        t.adicionar("termo-2", "significado-2");
        t.adicionar("termo-3", "significado-3");
        t.adicionar("termo-4", "significado-4");
        t.adicionar("termo-5", "significado-5");

        //remover termo
        t.remover("termo-2");
        t.remover("termo-4");

        //alterar termo e significado
        t.alterar("termo-3", "significado-3 (alterado)");
        t.alterar("termo-5", "significado-5 (alterado)");

        t.adicionarSignificado("termo-1", "SIGNIFICADO-2");
        t.adicionarSignificado("termo-1", "SIGNIFICADO-3");

		System.out.println(t);
	}
}
