package step4_01.string;

import java.util.Arrays;

//문제) moneyData 와 nameData 를 조합해서 userData를 아래와같이 만들어보세요

/*
* 100001/한놈/600
* 100003/석삼/7000
* 100001/한놈/100
* 100002/두시기/400
* 100001/한놈/600
* 100004/너구리/900
* 100001/한놈/130
* 100003/석삼/200
* 100002/두시기/700
* 100002/두시기/900
* 100004/너구리/800
*/



public class StringEx21_테스트풀이 {

	public static void main(String[] args) {//split"/"로 배열나눈뒤에 저장하기..
				
		String nameData = "";
		nameData+=	"100001/한놈\n";		
		nameData += "100002/두시기\n";
		nameData += "100003/석삼\n";
		nameData += "100004/너구리\n";
		nameData += "100005/오징어\n";
		nameData += "100006/육개장";
		
		String  moneyData = "";
		moneyData += "100001/600\n";	
		moneyData += "100003/7000\n";		
		moneyData += "100001/100\n";		
		moneyData += "100002/400\n";		
		moneyData += "100001/600\n";		
		moneyData += "100004/900\n";		
		moneyData += "100001/130\n";		
		moneyData += "100003/200\n";		
		moneyData += "100002/700\n";	
		moneyData += "100002/900\n";
		moneyData += "100004/800";

		String userData = "";
		
		
		String[]temp = nameData.split("\n");
		
		for (int i = 0; i < temp.length; i++) {
			String[]temp2 = nameData.split("/");
			userData += temp2[0] +"/";
			nameData += temp2[1] +"/";
		}
		
		String[] moneyTmp = moneyData.split("\n");
		System.out.print(moneyData + " ");
		
		
	}

}
