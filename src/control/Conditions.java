package control;

public class Conditions {
	public static void main(String[] args) {
		int someInt = 42;
		
		System.out.println(someInt == 42);
		System.out.println(someInt == 43);
		
		if (someInt == 42)
		{
			System.out.println("All is well.");
		}
		else
		{
			System.out.println(":(");
		}
		
		int otherInt = 3;
		
		if (otherInt < someInt) 
		{
			System.out.println("Math still works.");
		}
		else
		{
			System.out.println("Math is broken");
		}
		
		if (someInt < 42)
		{
			System.out.println("Wrong case 1");
		}
		else if (someInt > 42)
		{
			System.out.println("Wrong case 2");
		}
		else
		{
			System.out.println("42 is still 42.");
		}
		
		// Kürzer
		if (!((someInt < 42) || (42 < someInt)))
		{
			System.out.println("42 is still 42.");
		}
		
		// Mehr operatoren
		if ((2 <= 3) && (3 >= 2))
		{
			System.out.println("Logic still works.");
		}
		
		// Achtung
		if ((1 == 2) && (1 < (1 / 0)))
		{
			System.out.println("Survived divide by zero");
		}
		else
		{
			System.out.println("Close call.");
		}
		
		if ((1 != 2) || (1 < (1 / 0)))
		{
			System.out.println("I'm doing questionable logic and I'm still alive.");
		}
		
		if (true)
		{
			System.out.println("True is true.");
		}
		if (false)
		{
			System.out.println("False is true?");
		}
		
		
		// Vergleich:
		// !=    ==   <   >    <=   >=
		// Logik:
		// !     &&   ||
		
		// Achtung:
		String s1 = new String("String");
		String s2 = new String("String");
		System.out.println(s1);
		System.out.println(s2);
		if (s1 == s2)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Not all Strings are equal");
		}
		
		if (s1.equals(s2))
		{
			System.out.println("Strings and other objects must be compared with .equals()");
		}
		
		int i = 2;
		switch(i)
		{
		case 1:
			System.out.println("I is 1");
			break;
		case 2:
			System.out.println("I is 2");
		case 3:
			System.out.println("I is 3");
			break;
		default:
			System.out.println("I is something else.");
		}
		
		// Bitte nicht:
		int x = (i == 2) ? 3 : 4;
		// Was tut das intuitiv?
		
		// Scope
		if (x == 3)
		{
			int local = 2;
		}
		// ++local; // ???
	}
}
