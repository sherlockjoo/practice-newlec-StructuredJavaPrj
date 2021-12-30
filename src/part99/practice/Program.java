package part99.practice;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExamConsole list = new ExamConsole();
		
		int menu;
		boolean running = true;
		
		while(running) {
			
			menu = listMenu();
			
			switch(menu) {
			
			case 1:
				list.insertList();
				break;
				
			case 2:
				list.printList();
				break;
				
			case 3:
				System.out.println("bye~~~~");
				running = false;
				break;
				
			default:
				System.out.println("1~3번만 입력가능합니다.");
			}
		}
	}

	private static int listMenu() {
		
		int menu;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│           메뉴 선택                  │");
		System.out.println("└──────────────────────────┘");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.println("선택> ");
		
		menu = scan.nextInt();
		
		return menu;
	}

}
