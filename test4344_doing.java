import java.util.Scanner;

public class test4344_doing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caseNum = scanner.nextInt();
		float[] result = new float[caseNum];
		
		for (int j = 0; j<caseNum; j++){
			int gradeNum = scanner.nextInt();
			
			int[] grades = new int[gradeNum];
			int sum = 0;
			float count = 0;
			int average;
			
			for (int i = 0; i<gradeNum; i++){
				grades[i] = scanner.nextInt();
				sum += grades[i];
			}
			
			average = sum/gradeNum;
			
			for (int i = 0; i<gradeNum; i++){
				if (grades[i]>average) count++;
			}
			
			result[j] = count/gradeNum;			
		}
		
		for (int i = 0; i<caseNum; i++){
			System.out.printf("%.3f",result[i]*100);
			System.out.println("%");
		}
		
	}

}
