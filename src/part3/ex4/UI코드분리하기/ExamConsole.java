package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class ExamConsole {

	//ex1
	//private ExamList list = new ExamList();
	
	//ex2
	//컴포지션 has a 방식 (일체형)
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	
	public void inputList() {
		//------ 성적 입력 부분 -----------------------------
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                    │");
		System.out.println("└───────────────────────────┘");
		
		int kor, eng, math;
		
		int cnt = list.size();
		
		do {
			System.out.printf("국어%d: ", cnt+1 );
			kor = scan.nextInt();
			
			if(kor < 0 || kor > 100)
	 			System.out.println("성적범위(0~100)를 벗어났습니다");
			
		}while(kor < 0 || kor > 100);
		
		do {
			System.out.printf("영어%d: ", cnt+1 );
			eng = scan.nextInt();
			
			if(eng < 0 || eng > 100)
	 			System.out.println("성적범위(0~100)를 벗어났습니다");
			
		}while(eng < 0 || eng > 100);
		
		do {
			System.out.printf("수학%d: ", cnt+1 );
			math = scan.nextInt();
			
			if(math < 0 || math > 100)
	 			System.out.println("성적범위(0~100)를 벗어났습니다");
			
		}while(math < 0 || math > 100);
		
		/*
		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		*/
		
		// 생성자 오버로드 함수
		Exam exam = new Exam(kor, eng, math);
		
		list.add(exam);
	}
	
	public void printList() {
		this.printList(list.size());
	}
	
	public void printList(int size) {
		//------ 성적 출력 부분 -----------------------------
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                    │");
		System.out.println("└───────────────────────────┘");

		//Exam[] exams = this.exams;
		
		for(int i=0; i<size; i++) {
			
			Exam exam = list.get(i); // this.exams[i];
			
			int kor = exam.getKor(); // exam.kor;
			int eng = exam.getEng(); // exam.eng;
			int math = exam.getMath(); // exam.math;
			int total = exam.total(); // kor + eng + math;
			float avg = exam.avg(); // total / 3.0f;
			
			System.out.printf("%d학년 ─────────────────────────\n", i+1);
			System.out.printf("국어%d: %3d\n", i+1, kor);
			System.out.printf("영어%d: %3d\n", i+1, eng);
			System.out.printf("수학%d: %3d\n", i+1, math);
			System.out.printf("\t총점    : %3d\n", total);
			System.out.printf("\t평균    : %6.2f\n", avg);
			System.out.printf("───────────────────────────────\n");
		}
	}
	
}
