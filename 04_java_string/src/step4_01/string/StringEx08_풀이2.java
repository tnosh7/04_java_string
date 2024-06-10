package step4_01.string;

/**
 * 24-06-03
 * 문자열 1차원-3
 * @author 윤성희
 */

public class StringEx08_풀이2 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
		for (int i = 0; i < score.length; i++) {
			if (i < score.length-1) {
				str += name[i] + "/" + (score[i]+",");
			}
			else str += name[i] + "/" + (score[i]+"");
		}
		System.out.println(str);
	}

}
