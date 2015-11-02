package control;

public class Loops {
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i)
		{
			System.out.println(i);
		}
		
		int i = 10;
		while (i >= 0)
		{
			System.out.println(i);
			--i;
		}
		
		do {
			System.out.println("Do while!");
		} while (i == 9000);
		
		// Achtung vor Endlosschleifen
		/*for (;;) {
			System.out.println("Loop Forever");
		}*/
		
		/*for (int j = 0; j < 10; --j)
		{
			System.out.println(j);
		}*/
		
		for (int k = 0; k != 10; k += 2) // k += 3?
		{
			System.out.println("K1: " + k);
		}
		
		for (int k = 0; k != 10; k += 2) // k += 3?
		{
			System.out.println("K2: " + k);
			// ++k;
		}
		
		String s = "Iterate this.";
		for (char c : s.toCharArray())
		{
			System.out.print(c + " ");
		}
	}
}
