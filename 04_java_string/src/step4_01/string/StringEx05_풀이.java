package step4_01.string;
//23-05-11 16:38 ~57

public class StringEx05_풀이 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		
		//앞에 자르기 //substring( 0, n-1); 
		
		String a = jumin.substring(0, 2);
		int age = Integer.parseInt(a);
		
		int age2 = 2023 - (1900 +age) + 1 ; 
		System.out.println(age2);
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		jumin.charAt(7);
		
		
		
		char gender = jumin.charAt(7);
		System.out.println(gender);	//확인용
		
		
		
		
		
		if (gender == '2') System.out.println("여성");
		else if (gender == '1') System.out.println("남성");
		
	}

}
