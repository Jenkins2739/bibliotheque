package pack_tp4;

import java.util.ArrayList;

public class Etagere implements Imprimable {

    
    ArrayList<Document> docs;
    private static int MAX_DOCS=20;

    public Etagere()
    {
        docs = new ArrayList<Document>();
    }

    void ajouterDocument(Document doc)
    {
        if(docs.size()<MAX_DOCS)
            docs.add(doc);
        else
            System.out.println("Plus de place dans cette etagere");
    }

    public void rechercher(String auteur)
    {
        for (int i=0;i<docs.size();i++)
        {
            if(docs.get(i) instanceof Livre && ((Livre) docs.get(i)).auteur.equals(auteur))
            {
                System.out.println(docs.get(i));
            }
        }
    }

    public void triAlphabetique()
    {
        int min;
        Document D1;
        for(int i = 0; i < docs.size(); i++)
        {
            min = i;
            for(int j = i; j < docs.size(); j++)
            {
                if(docs.get(min).titre.compareTo(docs.get(j).titre) > 0)
                {
                    min = j;
                }
            }
            D1 = docs.get(i);
            docs.set(i, docs.get(min));
            docs.set(min, D1);
        }
    }

    @Override
    public void imprimer() {

        System.out.print("\nImprime ...");
        for (int i =0; i<docs.size(); i++)
        {
            if(docs.get(i) instanceof Livre)
            {
                System.out.print(docs.get(i));
            }

        }

    }

    @Override
    public String toString() {
        return "Contenu de l'etagere :\n"+docs;
    }
}