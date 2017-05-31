package pack_tp4;

public class Livre extends Document implements Imprimable {

    protected String auteur;
    protected int nbPages;


    public Livre(int num, String titre,String auteur, int nbPages)
    {
        super(num, titre);
        this.auteur=auteur;
        this.nbPages=nbPages;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public void imprimer() {

    }

    @Override
    public String toString() {
        return ""+super.toString()+" Livre{" +
                "auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages + "}";
    }


}