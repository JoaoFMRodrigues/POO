package aula10.Ex2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Termo {

	private SortedMap<String, ArrayList<String>> map;
	
	public Termo() {
		map = new TreeMap<String, ArrayList<String>>();
	}

    //adicionar termo e significado/s
	public void adicionar(String termo, String ...significados) {
		map.put(termo, new ArrayList<String>(Arrays.asList(significados)));
	}

    //remover termo
	public void remover(String termo) {
		map.remove(termo);
	}

	//adicionar significado ao termo
	public void adicionarSignificado(String termo, String significado) {
		//verificar se o termo existe
		if (map.containsKey(termo)) {
			//adicionar significado ao termo
			map.get(termo).add(significado);
		} 
		else {
			//criar novo termo se nao existir
			map.put(termo, new ArrayList<String>(Arrays.asList(significado)));
		}
	}

	//alterar termo e significado
	public void alterar(String termo, String ...significados) {
		map.replace(termo, new ArrayList<String>(Arrays.asList(significados)));
	}

	//ToString
	public String toString() {

 		//string de return
		StringBuilder result = new StringBuilder();

		//String: termo - significado (par termo-significado)
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			result.append(entry.getKey() + " - " + entry.getValue() + "\n");
		}
		
		//String: imprimir os termos
		for (String key : map.keySet()) {
			result.append(key + "\n");
		}

		//String: imprimir os significados
		for (ArrayList<String> value : map.values()) {
			result.append(value + "\n");
		}

		//return StringBuilder sb com os resultados
		return result.toString().substring(0, result.length() - 1);
	}
}