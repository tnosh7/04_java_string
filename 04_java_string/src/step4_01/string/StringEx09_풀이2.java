package step4_01.string;

import java.util.Scanner;

/**
 * 24-06-03
 * 문자열 타자연습 게임[1단계]
 * @author 윤성희
 */
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

public class StringEx09_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		for (int i = 0; i < words.length; i++) {
			int r = (int)Math.random()+words.length-1;
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		int cnt = 0;
		while(cnt < words.length) {
				System.out.println("문제 : " + words[cnt]);
				System.out.print("정답 : ");
				String answer = scan.next();
				if (answer.equals("words[i]")) {
					cnt++;
				}
			}
		}

}
