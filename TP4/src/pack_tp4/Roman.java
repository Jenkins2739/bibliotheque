package pack_tp4;

public class Roman extends Livre {

    private String prixLitteraire;

    public Roman (int num, String titre,String auteur, int nbPages)
    {
        super(num, titre, auteur, nbPages);
    }

    @Override
    public void imprimer() {
        System.out.println("Imprime ..."+this);
    }

    @Override
    public String toString() {
        return ""+super.toString()+" Roman{" +
                "prixLitteraire='" + prixLitteraire + '\'' +
                '}';
    }
}