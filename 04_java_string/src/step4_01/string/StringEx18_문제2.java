package step4_01.string;

import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 

*/
public class StringEx18_문제2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int length = word.length();
		int[] isChecked = new int[length];  // 힌트 체크를 통해서 확인할수있다.
		
		while (true) {
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < length; i++) {
				System.out.print("*");
				
			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			char[]arr = new char[word.length()];
			for (int i = 0; i < word.length(); i++) {
				arr[i] = word.charAt(i);
			}
			
			for (int i = 0; i < arr.length - me.length()+1; i++) {
				for (int j = 0; j < me.length(); j++) {
					if (arr[i+j] == me.charAt(j)) {
						isChecked[i] = 1;
					}
				}
			}
			int check = -1;
			for (int i = 0; i < isChecked.length; i++) {
				if (isChecked[i] != 0) {
					check = i;
					System.out.println(check);
				}
			}
		}

	}

}
