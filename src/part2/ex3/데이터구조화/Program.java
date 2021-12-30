package part2.ex3.데이터구조화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Exam[] exams = new Exam[3]; // exams 참조변수 이름표 3개 만듬
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop)
		{
			menu = inputMenu();
			
			switch (menu) {
			
			case 1:
				inputList(exams);
				break;
				
			case 2:
				printList(exams);
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

	private static void printList(Exam[] exams) {
		//------ 성적 출력 부분 -----------------------------
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                    │");
		System.out.println("└───────────────────────────┘");

		for(int i=0; i<3; i++) {
			
			Exam exam = exams[i];
			
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = kor + eng + math;
			float avg = total / 3.0f;
			
			System.out.printf("%d학년 ─────────────────────────\n", i+1);
			System.out.printf("국어%d: %3d\n", i+1, kor);
			System.out.printf("영어%d: %3d\n", i+1, eng);
			System.out.printf("수학%d: %3d\n", i+1, math);
			System.out.printf("\t총점    : %3d\n", total);
			System.out.printf("\t평균    : %6.2f\n", avg);
			System.out.printf("───────────────────────────────\n");
		}
	}

	private static void inputList(Exam[] exams) {
		//------ 성적 입력 부분 -----------------------------
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                    │");
		System.out.println("└───────────────────────────┘");
		
		for(int i=0; i<3; i++) {
			
			int kor, eng, math;
			
			do {
				System.out.printf("국어%d: ", i+1 );
				kor = scan.nextInt();
				
				if(kor < 0 || kor > 100)
		 			System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(kor < 0 || kor > 100);
			
			do {
				System.out.printf("영어%d: ", i+1 );
				eng = scan.nextInt();
				
				if(eng < 0 || eng > 100)
		 			System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(eng < 0 || eng > 100);
			
			do {
				System.out.printf("수학%d: ", i+1 );
				math = scan.nextInt();
				
				if(math < 0 || math > 100)
		 			System.out.println("성적범위(0~100)를 벗어났습니다");
				
			}while(math < 0 || math > 100);
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			exams[i] = exam;
		}
	}

	private static int inputMenu() {
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
}
