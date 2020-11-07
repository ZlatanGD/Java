import java.util.ArrayList;

public class Orchestre
{
    private ArrayList<Instrument> tab;
    private int cpt;

    public Orchestre()
    {
        tab = new ArrayList<Instrument>();
    }

    public void ajouterInstrument(Instrument a)
    {
        tab.add(a);
        cpt++;
    }

    public int getCpt()
    {
        return cpt;
    }

    public void jouer()
    {
        for(int i=0; i<cpt; i++)
        {
            tab.get(i).jouer();
        }
    }
    
}
