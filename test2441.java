import java.util.Scanner;

public class test2441 {
	
	public static void starPyramid(int num){
		
		for(int i = num; i>0; i--){
			for(int k=0; k<num-i; k++){
				System.out.print(" ");
			}
			for(int j = i; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	} 
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		starPyramid(num);
	}

}
