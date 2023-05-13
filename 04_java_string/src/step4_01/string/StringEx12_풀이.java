package step4_01.string;
//23-05-12 17:10 ~ 17: 41 ~~~~~~~집  아이템 cnt까지 했음 .
import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int[][] cart = new int[100][2];
		
		int itemCnt = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1; 
		
		
		while(true) {
			String myId = "";
			int appleCnt = 0;
			int banaCnt = 0;
			int strCnt = 0;
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (identifier == 1) {
				System.out.println("------------------------------");
				System.out.println("상태 : " + myId + "로그인");
				System.out.println("------------------------------");
			}
			else {
				System.out.println("------------------------------");
				System.out.println("상태 : 로그아웃");
				System.out.println("------------------------------");
				
			}
			
			
			if		(sel == 1) { //아이디 비밀번호 체크 //로그인하면 1로 바꿈,.
				System.out.print("ID 입력 : ");
				myId = scan.next();
				
				for (int i = 0; i < ids.length; i++) {
					if (ids[i].equals(myId)) {
						System.out.print("pw 입력 : ");
						String myPw = scan.next();
						if (pws[i].equals(myPw)) { 
							System.out.println(myId + "님 환영합니다.");
							identifier = 1 ;
							continue;
						}
					}
					else continue;
				}
			}
			else if (sel == 2) { //아이디 필터 1일때 
				if (identifier == 1 ) {
					System.out.println("로그아웃 되었습니다.");
					continue;
				}
			}
			else if (sel == 3) { //아이템 순서에 맞게 출력 + 번호 붙여서  
				if (identifier ==1 ) {
					for (int i = 0; i < items.length; i++) {
						System.out.println("[" + i + "]" + items[i]+ " ");
					}
					System.out.println("[4]뒤로가기");
					int itemIdx = scan.nextInt();
					System.out.println();
					
					if (itemIdx == 1) appleCnt++;
					else if (itemIdx == 2) banaCnt++;
					else if (itemIdx == 3) strCnt++;
						
					}
				}	
				else { 
					continue;
				}
			}
			
			else if (sel == 4) { //3번에서 선택한것 출력 
				if (identifier == -1) {
					continue;
				}
				else {
					System.out.print("ID : " + myId);
					System.out.println("사과 : " + appleCnt + "개");
					System.out.println("바나나 : " + banaCnt + "개");
					System.out.println("딸기 : " + strCnt + "개");
				
				}
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			if (identifier == -1) { 
				System.out.println("로그인 후에 이용해주세요.");
				continue;
			}
		}
		


	}

}
