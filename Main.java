import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;


class Main {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		String id = scanner.next();
		String pw1 = scanner.next();
		String pw2 = scanner.next();
		
		//아이디 조건
		Pattern idPattern = Pattern.compile("[0-9a-z]{3,20}$");
		Matcher idMatch = idPattern.matcher(id);
		
		//비밀번호 조건
		Pattern pwPattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$");
		Matcher pwMatch1 = pwPattern.matcher(pw1);
		Matcher pwMatch2 = pwPattern.matcher(pw2);
		
		if (idMatch.find() && id.equals(id.toLowerCase()) &&
				pwMatch1.find() && pwMatch2.find() && pw1.equals(pw2)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
}
				
		