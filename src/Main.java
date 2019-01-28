import java.util.ArrayList;

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
		
		
		
		System.out.println("Bienvenu chez Barette!");
		
		
		cvVincent.affiche();
	}

}
