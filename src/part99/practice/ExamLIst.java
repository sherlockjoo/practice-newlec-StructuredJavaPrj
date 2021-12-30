package part99.practice;

import java.util.Scanner;

public class ExamLIst {
	
	private Exam[] exams;
	private int current;
	
	public ExamLIst() {
		this.exams = new Exam[3];
		this.current = 0;
	}
	
	public void add(Exam exam) {
		
		Exam[] exams = this.exams;
		int cnt = this.current;
		
		if(exams.length == cnt) {
			
			Exam[] tmp = new Exam[cnt*2];
			
			for(int i=0; i<cnt; i++) {
				tmp[i] = exams[i];
			}
			this.exams = tmp;
		}
		
		this.exams[this.current] = exam;
		this.current++;
	}
	
	public Exam get(int i) {
		return this.exams[i];
	}

	public int size() {
		return this.current;
	}

}
