import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static HashMap<Integer, Integer> map = new HashMap<>();
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		run();
	}
	public static void run() {
		boolean running = true;
		while (running) {
			System.out.println("Skriv in ett nummer. Skriv 'exit' f�r att avsluta: ");
			String input = scan.next();

			//kollar om det finns n�t annat �n nummer fr�n input.
			if (!input.matches("\\d+") && !input.equalsIgnoreCase("exit")) {
				System.out.println("Skriv in siffror, inga bokst�ver");
				System.out.println();
			} else if(input.equalsIgnoreCase("exit")){
				running = false;
			}else
				checkNumber(input);
		}
	}

	public static void checkNumber(String input) {

		//g�r om String till int och l�gger in den i en array
		int[] nrArray = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			nrArray[i] = input.charAt(i) - '0';
		}
		//hashmap f�r reglerna f�r koden
		//man hade kunnat g�ra ett switch statement s�g jag sen vilket jag h�ll p� 
		//med i 3 �r utan att det funkade.
		map.put(0, 5);
		map.put(1, 9);
		map.put(2, 8);
		map.put(3, 7);
		map.put(4, 6);
		map.put(5, 0);
		map.put(6, 4);
		map.put(7, 3);
		map.put(8, 2);
		map.put(9, 1);

		for (int i = 0; i < nrArray.length; i++) {
			nrArray[i] = map.get(nrArray[i]);
		}
		System.out.println(Arrays.toString(nrArray));
	}
}
