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

public class StringEx15_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();

		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		int correctCnt = 0;
		for (int i = 0; i < charNum.length; i++) {	 	//check 넘버 길이 // 설정 안하면 text길이만큼만 해서 제대로 값이 안나옴  
			for (int j = 0; j < text.length(); j++) {	//text 길이 
				if (charNum[i] == text.charAt(j)) {
					correctCnt++;
				}
			}
		}
		
		if (correctCnt == text.length()) { //-1하지말것
			System.out.println("숫자만 있다.");
		}
		else if (correctCnt == 0){
			System.out.println("문자만 있다.");
		}
		else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
		
		scan.close();

	}

}
