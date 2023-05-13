package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

public class StringEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();
//		
//		1. compareTo를 이용해 비교하는 방법
//		if (name.compareTo(myName) == 0) {
//			System.out.println("일치 \n게임종료 ");
//		}
//		else System.out.println("불일치");
		
		//길이 비교. 한글자씩 비교 
//      2. charAt을 이용해 한글자씩 비교하는 방법.
		int check = -1;
		
		if (name.length() == myName.length()) {
			check = 1;
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i) != myName.charAt(i)) {
					check = -1;
					
				}
			}
		}
		if (check ==1 ) {
			System.out.println("일치");
		}
		else System.out.println("불일치 ");
		
		scan.close();
	}

}
