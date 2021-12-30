package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ExamProgram {
	
	public static void main(String[] args) {

		Exam exam = new Exam();

		input(exam);
		
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                    │");
		System.out.println("└───────────────────────────┘");
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = kor + eng + math;
		float avg = total / 3.0f;
		
		System.out.printf("국어: %3d\n", kor);
		System.out.printf("영어: %3d\n", eng);
		System.out.printf("수학: %3d\n", math);
		System.out.printf("총점: %3d\n", total);
		System.out.printf("평균: %5.2f\n", avg);
		System.out.println("─────────────────────────────\n");
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                    │");
		System.out.println("└───────────────────────────┘");

		int kor, eng, math;
		
		do {
			System.out.print("국어: ");
			kor = scan.nextInt();			
			if(kor < 0 || kor > 100)
				System.out.println("1~100까지의 숫자를 입력하세요.");
		} while(kor < 0 || kor > 100);
		
		do {
			System.out.print("영어: ");
			eng = scan.nextInt();			
			if(eng < 0 || eng > 100)
				System.out.println("1~100까지의 숫자를 입력하세요.");
		} while(eng < 0 || eng > 100);
		
		do {
			System.out.print("수학: ");
			math = scan.nextInt();			
			if(math < 0 || math > 100)
				System.out.println("1~100까지의 숫자를 입력하세요.");
		} while(math < 0 || math > 100);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
	}
}
