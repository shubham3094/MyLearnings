
public class RemoveSpecialCharactersFromStrinig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "asdnaskhdw1982739u3eneq26531@^%@@*&**&%";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The update string ---- : "+ s);
	}

}
