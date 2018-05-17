import java.util.Scanner;

public class test1065 {

	public static void countHansu(int num){
		int count = 0;
		
		int hundreds;
		int tens;
		int ones;
		
		if (num<100){
			System.out.print(num);
		}
		
		else{
		
		
		for (int i = 100; i<=num; i++){			
			hundreds = 0;
			tens = 0;
			ones = 0;
			
			hundreds = i/100;
			tens = (i-hundreds*100)/10;
			ones = i-hundreds*100-tens*10;
			
			if (hundreds-tens == tens-ones) {
				count++;
				}
		}
		System.out.print(count+99);
		}
	}
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		countHansu(num);
	}

}
