package step4_01.string;
/**
 * 24-06-03
 * 문자열 기초
 * @author 윤성희
 *
 */

public class StringEx05_풀이2 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 35세
		String year = jumin.substring(0, 2);
		int todayYear = 124;
		int age = todayYear - Integer.parseInt(year);
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char sex = jumin.charAt(7);
		if (sex == '2' || sex == '4') System.out.println("여성");
		else if (sex == '1' || sex == '3') System.out.println("남성");
		
	}

}
