package part99.practice;

import java.util.Scanner;

public class ExamConsole {

	private ExamLIst list;
	
	public ExamConsole() {
		list = new ExamLIst();
	}
	
	public void insertList() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│           성적 입력                  │");
		System.out.println("└──────────────────────────┘");
		
		int kor, eng, math;
		int cnt = list.size();
		
		do {
			System.out.printf("국어%d: ", cnt+1);
			kor = scan.nextInt();
			
			if(kor < 0 || kor > 100)
				System.out.println("1~100까지의 숫자만 입력가능합니다.");
		} while(kor < 0 || kor > 100);
		
		do {
			System.out.printf("영어%d: ", cnt+1);
			eng = scan.nextInt();
			
			if(eng < 0 || eng > 100)
				System.out.println("1~100까지의 숫자만 입력가능합니다ExamConsole.");
		} while(eng < 0 || eng > 100);
		
		do {
			System.out.printf("수학%d: ", cnt+1);
			math = scan.nextInt();
			
			if(math < 0 || math > 100)
				System.out.println("1~100까지의 숫자만 입력가능합니다.");
		} while(math < 0 || math > 100);
		
		Exam exam = new Exam(kor, eng, math);
		
		list.add(exam);
	}
	
	public void printList() {
		this.printList(list.size());
	}

	public void printList(int size) {
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│           성적 출력                  │");
		System.out.println("└──────────────────────────┘");
		
		//Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			
			Exam exam = list.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.total();
			float avg = exam.avg();
			
			System.out.printf("%d학년 ────────────────────\n", i+1);
			System.out.printf("국어%d: %3d\n", i+1, kor);
			System.out.printf("영어%d: %3d\n", i+1, eng);
			System.out.printf("수학%d: %3d\n", i+1, math);
			System.out.printf("총점: %3d\n"  , total);
			System.out.printf("평균: %5.2f\n", avg);
			System.out.println("─────────────────────────\n");
		}
	}
	
}
