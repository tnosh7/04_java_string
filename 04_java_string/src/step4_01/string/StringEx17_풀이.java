package step4_01.string;

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


public class StringEx17_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		//단어 길이와 알파벳 하나씩 비교 
		char[]arr = new char[text.length()];	//for문안이 아닌 밖에서 생성.
		int tleng = word.length();
		int idx = 0;
		boolean isSame= false;
		
		
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		for (int i = 0; i < arr.length - tleng + 1; i++) {
			int cnt =0;
			for (int j = 0; j < tleng; j++) {
				if(arr[i+j]==word.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == tleng) {
				idx =i;
				isSame = true;
			}
		}
		
		
		if(isSame) {
			int firstIdx =idx;
			int lastIdx =idx +tleng;
			
			System.out.println("무엇으로 바꾸시겠습니까");
			String change = scan.next();
			
			char[]temp = arr;
			String front ="";
			for (int i = 0; i < firstIdx; i++) {
				front +=temp[i];
			}
			String back = "";
			for (int i = lastIdx; i < temp.length; i++) {
				back +=temp[i];
			}
			String result = front+change + back;
			System.out.println(result);
			
		}
		else System.out.println("해당 단어는 존재하지 않습니다.");
		
		
	}

}
