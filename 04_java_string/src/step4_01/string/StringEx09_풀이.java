package step4_01.string;
//23-05-12 15:30 ~15:51
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_풀이 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
	
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i = 0;
		int check = -1;
		String answer = "";
		
		while (i < 3) {
			if (check == -1 ) {
				System.out.print("문제 : " + words[i]);
				System.out.println();
				System.out.print("입력 : ");
				answer = scan.next();		//문자열로 인식하게 바꾸기 .ㅇ
				
			}
			if (words[i].equals(answer)) {
				i++;
				System.out.print("문제 : " + words[i]);
				System.out.println();
				System.out.print("입력 : ");
				answer = scan.next();
				check = 1;
			}
		}
		System.out.println("게임종료") ;
		
		
		
	}

}
