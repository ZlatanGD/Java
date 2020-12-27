import java.util.ArrayList;
public class Train
{
    protected Motrice motrice;
    protected ArrayList<Wagon> listeWagon = new ArrayList<Wagon>();

    public Train(Motrice motrice)
    {
        this.motrice = motrice;
    }

    public void ajoutWagon(Wagon w)
    {
        listeWagon.add(w);
    }

    public int poids()
    {
        int poidsmax=0;

        for(int i = 0; i<listeWagon.size();i++)
        {
            if (listeWagon.get(i) instanceof WMarchandise)
            {
                poidsmax += ((WMarchandise)listeWagon.get(i)).getPoids();
            }
        }
        return poidsmax;
    }
    public String toString()
    {
        String res="";
        res+=motrice.toString();
        for(int i=0; i<listeWagon.size(); i++)
        {
            res+=listeWagon.get(i).toString();
        }
        return res;
    }

}
