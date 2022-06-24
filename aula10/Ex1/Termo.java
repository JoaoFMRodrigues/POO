package aula10.Ex1;

import java.util.Map;
import java.util.HashMap;

public class Termo {
	//mapa
	private Map<String, String> map;
	
	public Termo() {
		map = new HashMap<String, String>();
	}

    //adicionar termo e significado
	public void adicionar(String termo, String significado) {
		map.put(termo, significado);
	}

    //remover termo
	public void remover(String termo) {
		map.remove(termo);
	}

    //alterar termo e significado
	public void alterar(String termo, String significado) {
		map.replace(termo, significado);
	}

    //To string
	public String toString() {

        //string de return
		StringBuilder sb = new StringBuilder();

        //String: termo - significado (par termo-significado)
		for (Map.Entry<String, String> entry : map.entrySet()) {
			sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
		}
		
        //String: imprimir os termos
		for (String key : map.keySet()) {
			sb.append(key + "\n");
		}

        //String: imprimir os significados
		for (String value : map.values()) {
			sb.append(value + "\n");
		}

        //return StringBuilder sb com os resultados
		return sb.toString().substring(0, sb.length() - 1);
	}

}
