package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {
		// [1] 문자열 > 숫자 형변환
		
		String birthY = "2023" ;  //띄어쓰기 조심.
		System.out.println(birthY + 1);   // 20231
		int nBirthY = Integer.parseInt(birthY);       //Integer.parseInt("문자열") : 메서드 사용
		System.out.println(nBirthY + 1 ); // 2024
		System.out.println();
		
		
		
		// [2] 숫자 > 문자열 형변환
		
		// 2-1) + "" 사용
		int salary = 3000000;
		String str1 = salary + "";
		System.out.println(str1 + 50000);  // 300000050000
		
		// 2-2) Integer.toString(숫자) 사용
		String str2 = Integer.toString(salary);
		System.out.println(str1 + 50000); // 300000050000	
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(salary);
		System.out.println(str1 + 50000); // 300000050000	
		System.out.println();
		
		// 참고) 구글에서 ASCII 코드표 검색
		
		// 문자 > 숫자 
		char ch1 = 'a';
		int n1 = ch1;
		System.out.println(ch1 +  " / " + n1);
	
		// 숫자 > 문자
		int n2 = 65; 
		char ch2 = (char)n2;
		System.out.println(ch2 +  " / " + n2);
		
		System.out.println('s' + 3);
		System.out.println((char)(65 + 10));
		
		char c1 = '다';
		int a1 = c1;
		System.out.println(a1 );
		
	}

}
