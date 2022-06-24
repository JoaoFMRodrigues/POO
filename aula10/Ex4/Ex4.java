package aula10.Ex4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException{
		//get the words in words.txt
		ArrayList<String> words = getWords();

		//print all words
		System.out.println("ALL WORDS IN FILE words.txt:");
		for (String word : words){
			System.out.println(word);
		}

		//list words that ends with 's'
		System.out.println("\nWORDS THAT END WITH 's':");
		for(String word : words){
			//if word ends with 's' -> print it
			if(word.endsWith("s")){
				System.out.println(word);
			}
		}

		//Remove words that are not alphabetic
		System.out.println("\nWORDS THAT CONTAIN ONLY LETTERS:");
		for (String word : words){
			//if word is alphabetic -> print it
			if (word.matches("[a-zA-Z]+")){
				System.out.println(word);
			}
		}

	}
		
	public static ArrayList<String> getWords() throws IOException{
		Scanner wordsTXT = new Scanner(new FileReader("./src/aula10/Ex4/words.txt"));
		//create a new arraylist for the words
		ArrayList<String> words = new ArrayList<String>();

		//while there are words in the file
		while (wordsTXT.hasNext()) {
			//get the next word
			String word = wordsTXT.next();

			//check if the word is longer than 2 characters
			if (word.length() > 2) {
				//add the word to the arraylist
				words.add(word);
			}
		}
		//return the arraylist
		return words;
	}
}