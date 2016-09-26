package packFiles;

import java.io.File;

public class TestFiles {

	public static void main(String[] args) {
		testFichier("C:/Users/AJC/Desktop/ABournique/UML");
	}

	// Parcour dossiers sous dossiers et afficher fichiers
	static void testFichier(String rep){
		File f = new File(rep);
		
		// Si le rep existe
		if(f.exists()){
			// on prend le contenu du rep sous forme de liste
			String[] contenu = f.list();
			// on parcours les fichiers/dossiers
			for(int i=0; i<contenu.length; i++)
			{
				File f2 = new File(rep,contenu[i]);
				// si c'est un sous répertoire
				if(f2.isDirectory()){
					// on affiche le nom du rep
					System.out.println("Dossier " + contenu[i]);
					// Et on parcours son contenu par récursivité
					testFichier(rep+"/"+contenu[i]);
				}
				// si c'est un fichier
				else
					// on affiche son nom
					System.out.println("\tFichier " + contenu[i]);
			}
		}
	}
}
