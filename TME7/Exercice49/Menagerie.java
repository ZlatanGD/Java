import java.util.ArrayList; 

public class Menagerie 
{
    private ArrayList<Animal> tab;

    public Menagerie()
    {
        tab = new ArrayList<Animal>();
    }
    
    public void ajouter(Animal a)
    {
        tab.add(a);
    }

    public String toString()
    {
        String res="\n";
        for(int i=0; i<tab.size(); i++)
        {
            res += tab.get(i).toString() +" \n";
        }
        return res;
    }

    public void midi()
    {
        for(int i=0; i<tab.size(); i++)
        {
            tab.get(i).crier();
        }
    }

    public void vieillirTous()
    {
        for(int i=0; i<tab.size(); i++)
        {
            tab.get(i).vieillir();
        }
    }
}
