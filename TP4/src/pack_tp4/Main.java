package pack_tp4;

public class Main {

    public static void main(String[] args) {
        
    	Etagere E1 = new Etagere();
        Manuel M1 = new Manuel(1,"OpenClassroom","Abouda",20,3);
        Roman R1 = new Roman(2,"L'assassin Royal","Robin Hobb",300);
        Dictionnaire D1 = new Dictionnaire(3,"Larousse","Francais");

        E1.ajouterDocument(M1);
        E1.ajouterDocument(R1);
        E1.ajouterDocument(D1);

        System.out.println(E1);
        E1.rechercher("Abouda");
        E1.triAlphabetique();
        System.out.println(E1);

        R1.imprimer();
        M1.imprimer();
        E1.imprimer();
    }
}
