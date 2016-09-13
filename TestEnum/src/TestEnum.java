
public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Civilite.Mr);
		System.out.println(Langues.java);
		System.out.println(Langues.java.toString());
		System.out.println(Langues.java.name());
		System.out.println(Langues.python.getPrix());
		System.out.println(Langues.csharp.getLocalite());		
		
		for(Langues lang:Langues.values())System.out.println(lang);
		System.out.println(Langues.valueOf("csharp"));
	}

}
