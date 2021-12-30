package part3.ex4.UI코드분리하기;

public class ExamList {
	
	// 캡슐의 은닉화 private
	private Exam[] exams;
	private int current;
	
	public ExamList() { // 생성자
		this.exams = new Exam[3];
		this.current = 0;
	}

	public void add(Exam exam) {
		
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			// 기존배열에 있던 값을 새로운 크기에 배열에 복사
			Exam[] tmp = new Exam[size * 2];
			
			for(int i=0; i<size; i++) {
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
