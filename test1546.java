import java.util.Scanner;

public class test1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		float grade[] = new float[num];
		
		float max = 0;
		float result = 0;
		
		for (int i = 0; i<num; i++){
			grade[i] = scanner.nextFloat();
			if(grade[i]>max) max = grade[i];
		}
		
		for (int i = 0; i<num; i++){
			grade[i] = (grade[i]/max)*100;
		}
		
		for (int i = 0; i<num; i++){
			result += grade[i];
		}
		String ans = String.format("%.2f",result/num);
		System.out.println(ans);
		
		
	}

}
