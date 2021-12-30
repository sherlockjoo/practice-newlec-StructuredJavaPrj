package part3.ex5.추상화;

//public abstract class Exam { OOPJavaPrj 에서 추상화를 위한 코드
public class Exam {
	
	int kor;
	int eng;
	int math;
	
	// 오버로드 생성자가 있으면 기본 생성자를 컴파일러에서 생성하지 않음
	public Exam() {
		this(0,0,0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f;
	}

	/*
	 * OOPJavaPrj 에서 추상화를 위한 코드
	public abstract int total();
	
	protected int onTotal() {
		return kor + eng + math;
	}

	public abstract float avg();
	*/
}
