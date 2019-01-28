import java.util.ArrayList;

public class CV {
	public enum formations {Secondaire , DEC , BAC , Maitrise , Doctora , DEP}
	public  String Nom = "";
	public  String Prenom = "";
	public  formations Formation = formations.Secondaire;
	public  float experienceTravail = 0f;
	public  ArrayList<String> Competances = new ArrayList<String>();
	public  String Attentes = "";
	
	public void affiche() {
		System.out.println("Mon nom est: " + Nom + " " + Prenom);
		System.out.println("Ma meilleure formation est: " + Formation);
		System.out.println("J'ai " + experienceTravail + "h de travail qui s'ajoute à mon experience.");
		System.out.println("Voici mes compétences:");
		for(String comp : Competances) {
			System.out.println("\t" + comp);
		}
		System.out.println("Mes attentes pour le cours sont: " + Attentes + "\n");
	}
}
