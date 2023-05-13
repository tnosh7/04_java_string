package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

//		1.split를 이용한 풀이		
//		String[] temp = text.split(" ");
//		
//		boolean isRun = false;
//		
//		for (int i = 0; i < temp.length; i++) {
//			if(temp[i].equals(word)) {
//				isRun = true;
//			}
//		}
//		if(isRun == true) System.out.println("일치");
//		else System.out.println("불일치");
	
//		2. charAt을 이용한 풀이 	
		char[] arr= new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i); 
		}
	
		System.out.println(Arrays.toString(arr)+ " ");
		int textSize = word.length();
		boolean isRun = false;
		
		for (int i = 0; i < arr.length; i++) {
			int correctCnt = 0;
			for (int j = 0; j < textSize; j++) {
				
			}
		}
	
	}

}
