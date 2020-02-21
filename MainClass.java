public class MainClass {
	public static void main(String[] args){
		System.out.println("Hallooo!?");
		
		System.out.println("Zdravoo!?");
		
		//Komentar na develop grani
		String string = "Rad na develop grani";
		System.out.println(string);
		
		//Korigovan pogresan commit i mozemo nastaviti dalje sa kodovanjem
		novoRazvijenaMetoda();
		
		novoRazvijenaMetoda2();
		
	}
	
	private static void novoRazvijenaMetoda(){
		System.out.println("Nesto novo razvijeno na develop grani...");
	}
	
	private static void novoRazvijenaMetoda2(){
		System.out.println("Metoda 2 razvijeno na develop grani...");
	}
}
