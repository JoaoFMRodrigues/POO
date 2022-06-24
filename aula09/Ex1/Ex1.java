package aula09.Ex1;

import aula07.Ex2.Date;
import aula07.Ex2.DateYMD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10)
			c1.add(i);

		System.out.println("Size: " + c1.size());

		for (int i = 0; i < c1.size(); i++)
			System.out.println("Elemento: " + c1.get(i));

		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		c2.add("Sol");
		System.out.println(c2);
		System.out.println(c2.contains("Sol"));
		Collections.sort(c2);
		System.out.println(c2);
		System.out.println(c2.subList(0, 2));
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);

		//ArrayList Pessoa
		Set<Pessoa> c3 = new HashSet<>();

		c3.add(new Pessoa("Maria", 102030, new DateYMD(1, 12, 1999)));
		c3.add(new Pessoa("Mariana", 112131, new DateYMD(12, 6, 2001)));
		c3.add(new Pessoa("Joana", 122232, new DateYMD(16, 5, 2006)));

		//list on screen
		for (Pessoa p : c3)
			System.out.println(p);

		//TreeSet Date
		Set<Date> c4 = new TreeSet<>();

		c4.add(new DateYMD(1, 12, 1999));
		c4.add(new DateYMD(12, 6, 2001));
		c4.add(new DateYMD(26, 5, 2006));

		//print TreeSet
		System.out.println(c4);
	}
}