package step4_01.string;

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

public class StringEx09_문제2 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		int check = 0;
		while (check < words.length) {

			int rNum = ran.nextInt(4);
			String tmp = words[0];
			words[0] = words[rNum];
			words[rNum] = tmp;
			
			System.out.print("문제" + words[check]);
			System.out.print("\n입력 : ");
			String answer= scan.next();
			if(answer.equals(words[check])) {
				check++; 
			}
			else continue;
		}
		

	}

}
