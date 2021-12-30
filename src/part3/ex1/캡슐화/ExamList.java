package part3.ex1.캡슐화;

import java.util.Scanner;

public class ExamList {
	
	Exam[] exams;
	int current;
	
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
	}
	
	// 기존함수
	static void printList(ExamList list) {
		printList(list, list.current); // 파라미터 값이 많은 오버로드함수로 집중화
	}
	// 오버로드함수
	static void printList(ExamList list, int size) {
		//------ 성적 출력 부분 -----------------------------
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                    │");
		System.out.println("└───────────────────────────┘");

		//int size = list.current;
		Exam[] exams = list.exams;
		
		for(int i=0; i<size; i++) {
			
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

	static void inputList(ExamList list) {
		//------ 성적 입력 부분 -----------------------------
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                    │");
		System.out.println("└───────────────────────────┘");
		
		int kor, eng, math;
		
		int cnt = list.current;
		
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
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;
		
		if(exams.length == size) {
			// 기존배열에 있던 값을 새로운 크기에 배열에 복사
			Exam[] tmp = new Exam[size * 2];
			
			for(int i=0; i<size; i++) {
				tmp[i] = exams[i];
			}
			list.exams = tmp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
	}
}
