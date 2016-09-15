package projetFiles;

public class DocumentWord extends Document implements Storable, Encrypt, LogCompressible{
	private int taille;
	public DocumentWord(String nom, int taille){
		super(nom);
		this.taille = taille;
	}
	
	public String toString(){
		return super.toString() + " " + taille;
	}
	
	public void read(){
		System.out.println("D.Word Read");
	}

	public void compress() {
		System.out.println("D.Word Compress");
	}

	public void decompress() {
		System.out.println("D.Word Decompress");
	}

	public void log() {
		System.out.println("D.Word Log");
	}

	public void encrypt() {
		System.out.println("D.Word Encrypt");
	}

	public void decrypt() {
		System.out.println("D.Word Decrypt");
	}

	public void write() {
		System.out.println("D.Word Write");
	}
}
