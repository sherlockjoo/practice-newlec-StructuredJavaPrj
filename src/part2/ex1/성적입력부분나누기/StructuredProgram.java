package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {

	//static int[] kors = new int[3]; //전역변수 앞에 static 키워드
	
	public static void main(String[] args) {
		
		int[] korList = new int[3];
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop)
		{
			menu = inputMenu();
			
			switch (menu) {
			
			case 1:
				inputKors(korList);
				break;
				
			case 2:
				printKors(korList);
				break;
				
			case 3:
				System.out.print("bye!");
				keepLoop = false;
				break;

			default:
				System.out.println("1~3까지만 입력가능합니다.");
			}
		}
	}
	
	static int inputMenu() {
		//------ 메인 메뉴 부분 -----------------------------
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                    │");
		System.out.println("└───────────────────────────┘");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.종료");
		System.out.print("선택> ");
		
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		menu = scan.nextInt();
		
		return menu;
	}
	
	static void inputKors(int[] kors) {
		//------ 성적 입력 부분 -----------------------------
		int kor;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                    │");
		System.out.println("└───────────────────────────┘");

		for(int i=0; i<3; i++) {
			do {
				System.out.printf("국어%d: ", i+1 );
				kor = scan.nextInt();
				
				if(kor < 0 || kor > 100)
		 			System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(kor < 0 || kor > 100);
			
			kors[i] = kor;
		}
	}
	
	static void printKors(int[] kors) {
		//------ 성적 출력 부분 -----------------------------
		int total = 0;
		float avg;
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                    │");
		System.out.println("└───────────────────────────┘");
		
		for(int i=0; i<3; i++) {
			System.out.printf("국어%d: %3d\n", i+1, kors[i]);
			total += kors[i];
		}
		
		avg = total / 3.0f;
		System.out.printf("\t총점    : %3d\n", total);
		System.out.printf("\t평균    : %6.2f\n", avg);
		System.out.printf("───────────────────────────────\n");
	}
}
