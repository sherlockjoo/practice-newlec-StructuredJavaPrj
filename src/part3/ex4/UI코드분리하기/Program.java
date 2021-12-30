package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		//ExamList list = new ExamList();
		ExamConsole list = new ExamConsole();
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop)
		{
			menu = inputMenu();
			
			switch (menu) {
			
			case 1:
				 list.inputList();
				break;
				
			case 2:
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
