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

public class StringEx17_정답예시 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];		//for문 밖에서 배열 만들기 
		for(int i = 0; i < text.length(); i++) {		
			arr[i] = text.charAt(i);				//한글자씩 넣어줌 
		}
		
		int wordSize = word.length();				//변경할 단어 길이 
		int idx = 0;								//단어 인덱스 체크용
		boolean isSame = false;						//true면 변경할 단어 적용하기 
		
		for(int i = 0; i < arr.length - wordSize + 1; i++) {	//원래 단어 길이에서 변경할 단어 길이 빼줌 + 1
			
			int correctCnt = 0;								//단어 셀 용도
			
			for(int j = 0; j < wordSize; j++) {				//
				if(arr[i+j] == word.charAt(j)) {			//arr길이와 단어 길이가 같으면 
					correctCnt++;							//알파벳 cnt 
				}
			}
			
			if(correctCnt == wordSize) {					//cnt 와일치하면 
				idx = i;									//인덱스 뽑기 
				isSame = true;
			}
			
		}
		
		
		if (isSame) {
			
			int firstIdx = idx;							//첫 알파벳
			int lastIdx = idx + wordSize;				//마지막 알파벳 
			
			System.out.print("무엇으로 바꾸시겠습니까?");		
			String change = scan.nextLine();
			
			char[] temp = arr;							//temp 에 단어 옮겨줌 
			String front = "";					
			for (int i = 0; i < firstIdx; i++) {		//첫 알파벳 앞까지 더해줌  	
				front += temp[i];
			}
			
			String back = "";
			for (int i = lastIdx; i < temp.length; i++) {	//마지막 인덱스 
				back += temp[i];
			}
			
			String result = front + change + back;		
			System.out.println(result);
			
		}
		else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}
		
		scan.close();
		
	}

}
