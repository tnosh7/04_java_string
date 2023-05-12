package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 *   String만 . 조건 왼 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
		String dbId = "admin";
		
		System.out.print("# 아이디를 입력하세요 : ");
		String getId =scan.next();		//첫글자 대문자면 주소...
		
		
		if (dbId == getId) System.out.println("== 연산자 일치");
		else System.out.println("== 연산자 불일치");
		
		System.out.println();
		
		if (dbId.equals(getId)) System.out.println("equals 메서드 일치");
		else System.out.println("equals 메서드 불일치");
		
		scan.close();
		
		
	}
	
}
