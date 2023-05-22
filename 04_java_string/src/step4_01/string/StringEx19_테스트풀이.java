package step4_01.string;

import java.util.Arrays;


/*
 * 
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 * */
// 더나은 방법 생각해보기!
public class StringEx19_테스트풀이 {

	public static void main(String[] args) {
			
		String[][] students = {
								 {"제임스 고슬링" , "신촌" , "1001"}, 
								 {"스티브워즈니악" , "강남" , "1002"},
								 {"데니스리치" , "대치" , "1003"}, 
								 {"팀버너스리" , "강동" , "1004"}
							  };
		
		String[][] scores = {
								{"1001" , "100" , "20" , "30"},
								{"1002" , "10" , "60" , "60"},
								{"1003" , "23" , "63" , "31"},
								{"1004" , "45" , "30" , "35"},
							};

		 int max = 0; //1001~1004제외;
		 
		 int []tmp = new int [scores.length];
		 for (int i = 0; i < scores.length; i++) {
			 max =0;
			for (int j = 1; j < scores[i].length; j++) {
				max += Integer.parseInt(scores[i][j]);
				tmp[i] = max;
			}
		}
		 System.out.println(Arrays.toString(tmp) );
		 int idx = 0;
		 for (int i = 0; i < tmp.length; i++) {
			if (max < tmp[i]) {
				max = tmp[i];
				idx = i;
			}
		}
		String firstStu = scores[idx][0];
		 System.out.println(firstStu);
		 int j = 0;
		 while (j < 4) {
			 if (j == 0) {
				 System.out.println("1.학생 : " + students[idx][j]);
			 }
			 else if (j == 1) {
				 System.out.println("2.주소 : " + students[idx][j]);
			 }
			 else if (j == 2) {
				 System.out.println("3.번호 : " + students[idx][j]);
			 }
			 j++;
		 }

	}

}
