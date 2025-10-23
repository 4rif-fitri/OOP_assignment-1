import java.util.Scanner;

public class Main {

	public static void area_square() {
		Scanner input = new Scanner(System.in);
		double side, area;

		System.out.println("You have selected: Square");
		System.out.print("Please enter the length of a side in centimeters: \n");

		do {
			System.out.print("> ");
			side = input.nextDouble();

			if (side <= 0) {
				System.out.println("\nInvalid input. The length must be greater than 0.");
			} else {
				area = Math.pow(side, 2);
				System.out.printf("\nThe area of the square with side %.2f cm is: %.2f cm²\n", side, area);
			}

		} while (side <= 0);

	}

	public static void area_circle() {
		Scanner input = new Scanner(System.in);
		double diameter, radius, area;

		System.out.println("You have selected: Circle");
		System.out.println("Please enter the diameter of the circle in centimeters:");

		do {
			System.out.print("> ");
			diameter = input.nextDouble();

			if (diameter <= 0) {
				System.out.println("\nInvalid input. Diameter must be greater than 0.");

			} else {
				radius = diameter / 2;
				area = Math.PI * Math.pow(radius, 2);
				System.out.printf("\nThe area of the circle with a diameter of %.2f cm is: %.2f cm²\n", diameter, area);
			}

		} while (diameter <= 0);
	}

	public static void area_hexagon() {
		Scanner input = new Scanner(System.in);
		double side, area;

		System.out.println("You have selected: Hexagon");
		System.out.println("Please enter the length of a side in centimeters:");

		do {
			System.out.print("> ");
			side = input.nextDouble();

			if (side <= 0) {
				System.out.println("\nInvalid input. Side length must be greater than 0.");
			} else {
				area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
				System.out.printf("\nThe area of the hexagon with a side length of %.2f cm is: %.2f cm²\n", side, area);
			}

		} while (side <= 0);

	}

	static boolean again() {
		Scanner input = new Scanner(System.in);
		String c;
		System.out.println("\nWould you like to continue? (Enter 'Y' for Yes, 'N' for No): ");

		do {
			System.out.print("> ");
			c = input.nextLine();
			c = c.toLowerCase();
			if (c.equals("y") || c.equals("yes")) {
				System.out.println("");
				return true;
			} else if (c.equals("n") || c.equals("no")) {
				System.out.println("\nThank you for using the Area Calculator. Goodbye!");
				return false;
			} else {
				System.out.println("\nInvalid choice, (Enter 'Y' for Yes, 'N' for No):");
			}
		} while (!c.equals("y") || !c.equals("yes") || !c.equals("n") || !c.equals("no"));
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to the Area Calculator!");
		System.out
				.println("This program calculates the area of a selected geometric shape: square, circle, or hexagon.\n");

		do {
			System.out.println("Please select a shape (square, circle, hexagon):");

			do {
				System.out.print("> ");
				choice = input.nextLine();
				choice = choice.toLowerCase();
				System.out.println("");

				if (choice.equals("square")) {
					area_square();
					break;
				} else if (choice.equals("circle")) {
					area_circle();
					break;
				} else if (choice.equals("hexagon")) {
					area_hexagon();
					break;
				}

				System.out.println("Invalid choice, Please select a shape (square, circle, hexagon):");
			} while (true);

		} while (again());
	}
}
