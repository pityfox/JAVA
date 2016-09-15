package projetFiles;

public class TestFile {

	public static void main(String[] args) {
		DocumentWord doc = new DocumentWord("A", 2);
		
		if(doc instanceof Storable){
			Storable sDoc = (Storable) doc;
			sDoc.read();
			sDoc.write();
		}
	}

}
