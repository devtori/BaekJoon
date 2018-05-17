import java.util.Scanner;

public class test2839 {
	public static void sugar(int input){
		if (input%5 == 0 ) System.out.println(input/5);
		else if (input%5 == 1 && input > 1) System.out.println((input-6)/5+2);
		else if (input%5 == 2 && input > 7) System.out.println((input-12)/5+4);
		else if (input%5 == 3) System.out.println((input-3)/5+1);
		else if (input%5 == 4 && input>4) System.out.println((input-9)/5+3);
		else System.out.println(-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		sugar(num);
	}

}
