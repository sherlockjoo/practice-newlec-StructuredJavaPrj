package part3.ex2.메소드;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		ExamList list = new ExamList();
		//ExamList.init(list);
		//list.init();
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop)
		{
			menu = inputMenu();
			
			switch (menu) {
			
			case 1:
				//ExamList.inputList(list);
				list.inputList();
				break;
				
			case 2:
				//ExamList.printList(list);
				list.printList();
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
