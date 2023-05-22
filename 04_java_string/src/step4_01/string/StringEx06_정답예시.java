package step4_01.string;

//# 문자열 1차원

public class StringEx06_정답예시 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		
		int[] arr = new int[3];
		
		String[] temp = str.split("/");			//주의 split은 배열 저장

		int tot = 0;
		for (int i = 0; i < temp.length; i++) {	
			arr[i] = Integer.parseInt(temp[i]);
			tot += arr[i];						//같이 써도 상관없음
		}
		System.out.println("tot = " + tot);
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		
		int[] scores = {11, 100, 89};
		String text = "";
		
		for (int i = 0; i < scores.length; i++) {
			text += scores[i] + "";					//문자열이라 +=를 해도 같이 붙어서 문장이 된다 . 
			if (i != scores.length-1) {				//scores.length로 해야 함 안그럼 "/"가 마지막에 붙음
				text += "/";
			}
		}
		System.out.println(text);
		/*
		 * 내가 푼 방식
		 * for (int i = 0; i < scores.length; i++) {
			text += scores[i] + ""  + "/";	//"" 문자로 바꾸기 . 
			}
		 * 
		 * 
		 * */


	}

}
