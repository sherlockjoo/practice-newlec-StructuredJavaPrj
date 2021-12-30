package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] kors = new int[3];
		int total = 0;
		float avg;
		int menu;
		boolean keepLoop = true;

		Scanner scan = new Scanner(System.in);

		for(int i=0; i<3; i++)
			kors[i] = 0;
		
		while(keepLoop)
		{
			//------ 메인 메뉴 부분 -----------------------------
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴                    │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.종료");
			System.out.print("선택> ");
			menu = scan.nextInt();
			
			switch (menu) {
			
			case 1:
				//------ 성적 입력 부분 -----------------------------
				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적 입력                    │");
				System.out.println("└───────────────────────────┘");
		
				for(int i=0; i<3; i++)
					do {
						System.out.printf("국어%d: ", i+1 );
						kors[i] = scan.nextInt();
						
						if(kors[i] < 0 || kors[i] > 100)
							System.out.println("성적범위(0~100)를 벗어났습니다");
						
					}while(kors[i] < 0 || kors[i] > 100);
				break;
				
			case 2:
				//------ 성적 출력 부분 -----------------------------
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
				System.out.printf("--------------------------------\n");
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
}