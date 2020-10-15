import java.util.ArrayList;

public class Pile
{
    private ArrayList<Machin> tab = new ArrayList<Machin>();

    public void empiler(Machin a)
    {
        tab.add(a);
    }

    public boolean estVide()
    {

        System.out.println("Test");
        return tab.isEmpty();
    }

    public Machin depiler()
    {
        return tab.remove(0);
    }

    public String toString()
    {
        String res="";
        for(int i=0; i<tab.size(); i++)
        {
            res += tab.get(i).getNom()+" "+tab.get(i).getValeur()+"\n";
        }return res;
    }
}