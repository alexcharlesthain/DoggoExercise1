package doggoExercise;

import java.util.Scanner;

public class DoggoPlacement {

	static final int limit = 100;

	public static void main(String[] args) {

		Scanner Placement = new Scanner(System.in);
			
		int a = Placement.nextInt();
			
		for (int b = 1; b <= limit; b++) {
				
			if (b == a)
				continue;
			System.out.print(b);
				
			if (b % 100 >= 10 && b % 100 <= 20)
				System.out.print("th");
				
			else if (b % 10 == 1)
				System.out.print("st");
				
			else if (b % 10 == 2)
				System.out.print("nd");
				
			else if (b % 10 == 3)
				System.out.print("rd");
				
			else
				System.out.print("th");
				
			if (b != limit)
				System.out.print(",");
			}
			
			Placement.close();
		}
}

