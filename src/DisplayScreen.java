
public class DisplayScreen {

	static void StartScreen(){
		System.out.println("\033[?1049h\033[H"); //start alternate
	}
	
	static void ClearScreen(){
		System.out.println("\033[2J");
		System.out.println("\033[H");
	}
	
	static void EndScreen(){
		System.out.println("\033[?1049l");
	}
	
}
