import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number = 1 + (int)(Math.random() * 10);
		System.out.println(number);
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!");
		while (answer!=number){
			System.out.println("Try to guess the random number:");
			answer = sc.nextInt();
			if (answer!=number) System.out.println(answer+" is not the right number");
			else{
				System.out.println(answer+ " is the right answer!");
				System.out.println("Congratulations!");
			}

		}
	}
}