import java.util.*;

public class test2643 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int papers[][] = new int[num][2];
		int ans = 1;
		
		for(int i = 0; i<num; i++) {
			papers[i][0] = scanner.nextInt();
			papers[i][1] = scanner.nextInt();
			
			if(papers[i][0]>papers[i][1]) {
				int temp = papers[i][0];
				papers[i][0] = papers[i][1];
				papers[i][1] = temp;
			}
		}
		
		Arrays.sort(papers, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				} else {
					return o2[0] - o1[0];
				}
				
			}
		});
		
		for(int i = 1; i<num; i++) {
			if (papers[i][0]<=papers[i-1][0] && papers[i][1]<=papers[i-1][1]) {
				ans++;
			}
		}
		System.out.print(ans);
	}
}
