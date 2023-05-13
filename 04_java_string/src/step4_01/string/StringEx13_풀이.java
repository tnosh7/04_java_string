package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_풀이 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		//작은 수 넣는 변수 / 인덱스 변수 / tmep 이용해서 바꾸기 
		
		for (int i = 0; i < names.length; i++) {
			
			String min = names[i];
			int minIdx = i;
			
			for (int j = i; j < names.length; j++) {
				if (min.compareTo(names[j]) > 0) {
					min = names[j];
					minIdx = j;
				}
			}
			String temp = names[i]; 
			names[i] = names[minIdx];
			names[minIdx] = temp;			
			
		}
		System.out.println(Arrays.toString(names));
	}
}
