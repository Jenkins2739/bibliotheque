package pack_tp4;

public class Dictionnaire extends Document {

    private String langue;


    public Dictionnaire(int num, String titre, String langue)
    {
        super(num,titre);
        this.langue=langue;
    }
    
    @Override
    public String toString() 
    {
        return ""+super.toString()+" Dictionnaire{" +
                "langue='" + langue + "'}";
    }
}