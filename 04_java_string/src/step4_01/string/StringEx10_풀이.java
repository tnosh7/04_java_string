package step4_01.string;
//23-05-12 16:00 ~ 16:17
import java.util.Random;
import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		//문제 출력 
		
		while (true) {
			System.out.print("입력 : ");
			String answer = scan.next();
			if (start.contentEquals(answer)) {
				continue;
			}
			else {
				System.out.println("제시어 : " + answer);
				if (answer.equals("quit")) {
					System.out.println("게임종료");
					break;
				}
			}
		}
		scan.close();

	}

}
