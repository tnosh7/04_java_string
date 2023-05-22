package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;


/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_문제2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		char[]arr = new char[text.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		int idx = 0;
		boolean isRun = false;
		for (int i = 0; i < arr.length -word.length()+1 ; i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if(arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == word.length()) {
				idx = i;
				isRun = true;
			}
		}
		if (isRun) {
			int start = idx;
			int end = idx + word.length();
			
			System.out.print("바꿀 단어 입력 : ");
			String change = scan.next();
			
			char[]ch = arr;
			String front = "";
			for (int i = 0; i < start; i++) {
				front +=ch[i];
			}
			String back = "";
			for (int i = end; i < ch.length; i++) {
				back +=ch[i];
			}
			String result = front + change + back;
			System.out.println(result);
			
		}
		
		
	}

}
