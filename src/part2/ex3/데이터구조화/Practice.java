package part2.ex3.데이터구조화;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 클래스와 배열을 이용한 성적 입력 화면 프로그램
		//Exam[] exams = new Exam[3];
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		int menu;
		boolean running = true;
		
		while(running) {
			
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputList(list);
				break;
				
			case 2:
				printList(list);
				break;
				
			case 3:
				System.out.println("bye~~~");
				running = false;
				break;
				
			default:
				System.out.println("1~3번만 선택가능합니다.");
			}
		}
	}

	private static void printList(ExamList list) {
		
		System.out.println("┌───────────────────────┐");
		System.out.println("│         성적 출력                │");
		System.out.println("└───────────────────────┘");
		
		int size = list.current;
		Exam[] exams =  list.exams;
		
		for(int i=0; i<size; i++) {
		
			Exam exam = exams[i];
			
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = kor + eng + math;
			float avg = total / 3.0f;
			
			System.out.printf("%d학년 ───────────────────\n", i+1);
			System.out.printf("국어%d: %3d\n", i+1, kor);
			System.out.printf("영어%d: %3d\n", i+1, eng);
			System.out.printf("수학%d: %3d\n", i+1, math);
			System.out.printf("총점: %3d\n", total);
			System.out.printf("평균: %5.2f\n", avg);
			System.out.println("────────────────────────\n");
		}
	}

	private static void inputList(ExamList list) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────┐");
		System.out.println("│         성적 입력                │");
		System.out.println("└───────────────────────┘");
		
		//for(int i=0; i<3; i++) {
			int kor, eng, math;
			int cnt = list.current;
			
			do {
				System.out.printf("국어%d: ", cnt+1);
				kor = scan.nextInt();
			
				if(kor < 0 || kor > 100)
					System.out.println("1~100까지의 숫자만 입력하세요.");
			} while(kor < 0 || kor > 100);
			
			do {
				System.out.printf("영어%d: ", cnt+1);
				eng = scan.nextInt();
			
				if(eng < 0 || eng > 100)
					System.out.println("1~100까지의 숫자만 입력하세요.");
			} while(eng < 0 || eng > 100);
			
			do {
				System.out.printf("수학%d: ", cnt+1);
				math = scan.nextInt();
			
				if(math < 0 || math > 100)
					System.out.println("1~100까지의 숫자만 입력하세요.");
			} while(math < 0 || math > 100);
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			Exam[] exams = list.exams;
			
			// 배열크기와 현재크기가 같은 경우 배열의 크기를 다시 정해줌
			if(exams.length == cnt) {
				Exam[] tmp = new Exam[cnt * 2];
				
				for(int i=0; i<cnt; i++) {
					tmp[i] = exams[i];
				}
				list.exams = tmp;
			}
			
			list.exams[list.current] = exam;
			list.current++;
		//}
	}

	private static int inputMenu() {
		
		int menu;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────┐");
		System.out.println("│         메뉴 선택                │");
		System.out.println("└───────────────────────┘");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.println("선택> ");
		
		menu = scan.nextInt();
		
		return menu;
	}
}
