public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CV cvVincent = new CV();
		cvVincent.Nom = "Boutot";
		cvVincent.Prenom = "Vincent";
		cvVincent.Formation = cvVincent.Formation.Doctora;
		cvVincent.experienceTravail = 6f;
		cvVincent.Competances.add("programmation");
		cvVincent.Competances.add("langues");
		cvVincent.Attentes = "Bonne documentation!";
		
		CV cvJeanSebastien = new CV();
		cvJeanSebastien.Nom = "Beaulne";
		cvJeanSebastien.Prenom = "Jean-Sébastien";
		cvJeanSebastien.Formation = cvVincent.Formation.Doctora;
		cvJeanSebastien.experienceTravail = 1.65f;
		cvJeanSebastien.Competances.add("programmation");
		cvJeanSebastien.Competances.add("condition physique");
		cvJeanSebastien.Attentes = "Pas trop de travaux à faire à la maison.";
		
		
		
		System.out.println("Bienvenu chez Barette!\n");
		
		
		cvVincent.affiche();
		cvJeanSebastien.affiche();
	}

}
