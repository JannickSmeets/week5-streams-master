package be.pxl.streams;

import java.util.OptionalInt;
import java.util.Random;

public class Challenge2 {
	public static void main(String[] args) {
		// maak een stream met 10 random gehele getallen tussen 0 en 30
		// bekijk hiervoor de methode ints(...) in de klasse Random
		// filter de getallen die deelbaar zijn door 3
		// en geef het maximum 
		// gebruik eventueel peek() om een tussenresultaat van de stream te tonen
		OptionalInt result = new Random().ints(0, 30).limit(10).filter(n -> n % 3 == 0).peek(System.out::println).max();
		if (result.isPresent()) {
			System.out.println("resultaat:" + result.getAsInt());
		}
		
	}
}
