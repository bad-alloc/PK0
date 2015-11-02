package numbers;

public class NumbersExample {
	public static void main(String[] args) {
		// Normales rechnen
		System.out.println(1 + 1);
		System.out.println(1 - 3);
		System.out.println(2 * 2);
		System.out.println(4 / 2);
		System.out.println(10 % 3);
		
		// Weniger normales rechnen
		int bigNumber = (int) Math.pow(2.0, 31.0); // 2^31
		System.out.println(bigNumber);
		System.out.println(bigNumber + 1);
		System.out.println(5 / 2);
		// System.out.println(1 / 0);
		
		// Was nun?
		System.out.println("1 + 1 = " + 1 + 1);
		System.out.println("1 + 1 = " + (1 + 1));
		
		// Werte speichern
		int someInt = 3;
		float someFloat = 1.333333333333333333333f;
		double someDouble = Math.PI;
		boolean someBoolean = true;
		char someChar = 'c';
		long someLong = (long) Math.pow(2.0, 32.0) + 1;
		byte someByte = 32;
		short someShort = 9001;
		System.out.println(someInt);
		System.out.println(someFloat);
		System.out.println(someDouble);
		System.out.println(someBoolean);
		System.out.println(someChar);
		System.out.println(someLong);
		System.out.println(someByte);
		System.out.println(someShort);
		
		// Konvertierung
		float someOtherFloat = (float) 2.9;
		int someTruncatedInt = (int) someOtherFloat;
		System.out.println(someOtherFloat);
		System.out.println(someTruncatedInt);
		
		// operatoren
		int i = 0;
		i = i + 4;
		i = i - 2;
		i = i * 5;
		i = i / -2;
		
		int j = 0;
		j += 4;
		j -= 2;
		j *= 5;
		j /= -2;
		System.out.println("J: " + j + ", I: " + i);	
		++i;
		j++;
		System.out.println("J: " + j + ", I: " + i);
		i--;
		--j;
		System.out.println("J: " + j + ", I: " + i);
		
		// Großschreibung?
		Integer x = 2; // inspect this!
		Double d = 2.0;
		// x.?
	}
}
