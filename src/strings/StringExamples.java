package strings;

public class StringExamples {
	public static void main(String[] args) {
		// Strings können gespeichert werden (mehr dazu später)
		String firstString = "I am a string of characters.";
		String secondString = "Me too!";
		
		// Ausgabe
		System.out.println("Direct");
		System.out.println(firstString);
		
		// Aneinanderhängen
		System.out.println(firstString + secondString);
		
		// Neue Strings anlegen
		String concatenated = firstString + secondString;
		System.out.println(concatenated);
		
		// Teile ausgeben
		System.out.print(firstString.charAt(0));
		System.out.print(firstString.charAt(1));
		System.out.print(firstString.charAt(2));
		System.out.println(firstString.charAt(3));
		
		// Manipluation
		System.out.println(secondString.substring(3));
		System.out.println(firstString.substring(7, 13));
		System.out.println(secondString);
		
		System.out.println(secondString.toUpperCase());
		System.out.println(secondString.toLowerCase());
		
		// Dauerhafte manipulation
		firstString = (String) firstString.substring(7, 13);
		System.out.println(firstString);
		secondString = secondString + " :)";
		
		// Immutability! 
		// secondString.charAt(6) = '.';
		// -> String werden immer neu gebaut.
		
		// Escapesequenzen
		System.out.print("\nnew lines follow:\n\n\n...\n");
		System.out.println("Quotes \"in quotes\"");
		System.out.println("Quotes 'in singlequotes'");
		System.out.println("Backslashes? \\");
		
		// Länge
		System.out.println("The string \"" + secondString + "\" is " + secondString.length() + " chars long.");
		
		// All the strings!
		Integer number = 42;
		System.out.println(number.toString());
		System.out.println(firstString.toString()); // Sinnfrei aber geht
	}
}
