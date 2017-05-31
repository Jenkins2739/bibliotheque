package pack_tp4;

import java.util.ArrayList;

public class Bibliotheque {

    ArrayList<Etagere> sesEtageres;

    public Bibliotheque()
    {
        sesEtageres=new ArrayList<Etagere>();
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "sesEtageres=" + sesEtageres +
                '}';
    }
}
