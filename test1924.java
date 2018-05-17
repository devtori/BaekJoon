import java.util.Scanner;



public class test1924 {
	
	public static String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	public static int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void whichDay(int month, int day){
		int days = 0;
		
		for (int i = 1; i<month; i++){
			days += daysPerMonth[i-1];
		}
		days += day;		
		System.out.print(weekdays[days%7]);
	} 
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		whichDay(month,day);
	}

}
