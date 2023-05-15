package step4_01.string;

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
		int appleCnt = 0;
		int bannaCnt = 0;
		int berryCnt = 0;
		
		
		while(true) {
			
			int check = 0;
			System.out.println("----------------------");
			if (identifier == -1) System.out.println("상태 : " + "로그아웃");
			else System.out.println("상태  : " + ids[identifier] + "로그인");	//id 인덱스 체크하기 
			System.out.println("----------------------");
			
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("ID : ");
				String Id = scan.next();
				
				for (int i = 0; i < ids.length; i++) {
					if (ids[i].equals(Id)) {
						check = 1;
						identifier = i;
					}
				}
				if (check == 1) {
					System.out.print("PW : ");
					String Pw = scan.next();
					
						if(pws[identifier].equals(Pw)) {
							System.out.println(ids[identifier] + "님, 환영합니다.");
					}
				}
				else System.out.println("ID와 PW를 확인해주세요.");
			}
			else if (sel == 2) {
				if (identifier== -1) {
					System.out.println("로그인 후에 이용가능");
				}
				else {
					System.out.println("로그아웃 되었습니다.");
					identifier = -1;
				}
			}
			else if (sel == 3) { 
				if (identifier != -1) {
					boolean isRun = true;
					while (isRun) {
						System.out.println("===상품목록===");
						for (int i = 0; i < items.length; i++) {
							System.out.println("["+ i + "] " + items[i]);
						}
						System.out.print("[3] 뒤로가기 \n상품번호를 선택하세요 : ");
						int itemIdx = scan.nextInt();
						
						if (itemIdx == 0) appleCnt++;
						else if (itemIdx == 1) bannaCnt++;
						else if (itemIdx == 2) berryCnt++;
						else if (itemIdx == 3) isRun = false;
					}
				}
				else {
					System.out.println("로그인 후에 이용가능");
					continue;
				}
			}
			else if (sel == 4) {
				if (identifier != -1) {
					System.out.println("id : " + ids[identifier]);
					System.out.println("사과 : " + appleCnt + "개");
					System.out.println("바나나 : " + bannaCnt + "개");
					System.out.println("딸기 : " + berryCnt + "개");
					continue;
				}
				else  {
					System.out.println("로그인 후에 이용가능");
					continue;
				}
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();

	}

}
