package projetMagasin;

public class Ligne {
	private Article article;
	private int quantite;
	protected int prixLigne;
	
	public Ligne(int quantite, Article article) {
		this.article = article;
		this.quantite = quantite;
		this.prixLigne = article.getPrix() * quantite;
	}
	
	// toString
	public String toString(){
		return quantite + "\t" + article.toString() + "\t" + prixLigne +"€";
	}
}
