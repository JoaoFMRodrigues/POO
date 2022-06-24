package aula10.Ex3;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex3 {
	public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> pos = charactersPosition("Hello World");
		System.out.println(pos);
	}

    //retorna Hashmap "pos" da posicao de cada caracter
	public static HashMap<String, ArrayList<Integer>> charactersPosition(String text) {

        //map for characters and positions
		HashMap<String, ArrayList<Integer>> pos = new HashMap<String, ArrayList<Integer>>();
		
        //para cada caracter na string text
		for (int i = 0; i < text.length(); i++) {
			String character = text.substring(i, i + 1);
			
            //verificar se o caracter ja existe no map
			if (pos.containsKey(character)) {
                //adicionar a posicao
				pos.get(character).add(i);
			} else {
                //adicionar o novo caracter
				pos.put(character, new ArrayList<Integer>());
                //adicionar a posicao
				pos.get(character).add(i);
			}
		}
		
		return pos;
	}
}
