package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		//asc22코드를 이용하는 방법. X 한글자가 아니라서 오류나옴 . 
		//System.out.println(Integer.parseInt(text));
		
		int check= 0;
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if(num[i] == text.charAt(j)) check++ ;
			}
		}
		if (check == text.length()) System.out.println("숫자만 있다.");
		else if (check == 0) System.out.println("문자만 있다.");
		else System.out.println("문자와 숫자가 섞여 있다.");
	}
}
