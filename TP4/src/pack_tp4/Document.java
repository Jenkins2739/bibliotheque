package pack_tp4;

public abstract class Document {

    protected int numero;
    protected String titre;

    public Document(int num, String titre)
    {
        this.numero=num;
        this.titre=titre;
    }

    @Override
    public String toString() {
        return "\nDocument{" +
                "numero=" + numero +
                ", titre='" + titre + "'}";
    }

}
