

public class DisplayPrinter extends Thread {
	
	private char[][] gameState;
	
	DisplayPrinter(char[][] gameState){
		this.gameState = gameState;
	}
	
	public void run(){
		
		int number = 0;
		while (number >= 0){
			//clear screen
			//System.out.println("\033[2J");
			//System.out.println("\033[H");
			DisplayScreen.ClearScreen();
			System.out.println("==================");
			System.out.println("DisplayUpdates: " + number);
			System.out.println("==================");
			
			for (char[] cs : gameState) {
				//System.out.println(cs);
				for (char c : cs) {
					System.out.print(c);
				}
				System.out.println();
			}
			
			
			number++;
			
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
