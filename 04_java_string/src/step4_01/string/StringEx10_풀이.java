package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		
		
		while (true) {
			
			
			System.out.println("제시어  :" + start);
			System.out.print("입력 : ");
			String answer= scan.next();
				
			char check = start.charAt(start.length()-1);
				
			for (int j = 0; j < answer.length(); j++) {
				if(check == answer.charAt(0)) {
					start = answer;
					continue;
				}
			}
			if (answer.equals("quit")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
