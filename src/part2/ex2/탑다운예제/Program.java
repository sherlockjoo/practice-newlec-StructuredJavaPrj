package part2.ex2.탑다운예제;

public class Program {

	public static void main(String[] args) {

		int[][] lottos = null;
		int menu = 0;
		boolean running = true;
		
		while(running) {
			switch(menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottosManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
			default:
				System.out.println("1~4번만 입력가능합니다.");
			}
		}
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
