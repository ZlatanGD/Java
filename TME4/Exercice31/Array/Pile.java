public class Pile
{
    private Machin[] tab;

    public Pile(int tailleMax)
    {
        tab = new Machin[tailleMax];
    }

    public void empiler(Machin m)
    {
        if(tab[tab.length-1] == null)
        {
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i] == null)
                {
                    tab[i] = m;
                    break;
                }
            }
        }
    }
    public Machin depiler()
    {
        Machin temp = tab[0];
        if(tab[0] == null)
        {
            System.out.println("Liste vide.");
            return null;
        }
        else if(tab[tab.length-1] != null)
        {
            temp = tab[tab.length-1];
            tab[tab.length-1] = null;
            return temp;
        }
        else
        {
            for(int i=0; i<tab.length; i++)
            {
                if(tab[i] == null)
                {
                    temp = tab[i-1];
                    tab[i-1] = null;
                }
            }
        }return temp;
    }
    public boolean estVide()
    {
        if(tab[0] == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean estPleine()
    {
        if(tab[tab.length-1] != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int size()
    {
        int taille = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] != null)
            {
                taille++;
            }
        }return taille;
    }

    public String toString()
    {
        String res = "";
        for(int i = 0; i<tab.length; i++)
        {
            if(tab[i] != null)
            {
                res += tab[i].toString() + "\n";
            }            
        }return res;
    }
}