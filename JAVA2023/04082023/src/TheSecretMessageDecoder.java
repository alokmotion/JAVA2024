
public class TheSecretMessageDecoder {
	
	
	public int decodeCharacter(char ch) {
		return (int) ch;
	}

	public static void main(String[] args) {
		TheSecretMessageDecoder decoder = new TheSecretMessageDecoder(); 
		System.out.println(decoder.decodeCharacter('A'));

		

	}

}
