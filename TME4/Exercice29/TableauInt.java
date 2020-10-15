import java.util.ArrayList;

public class TableauInt
{
    private int[] tab;

    public TableauInt()
    {
        this.tab = new int[10];
        for(int i = 0; i<10; i++)
        {
            tab[i]=(int) (Math.random() * (100));
        }
    }

    public TableauInt(int n)
    {
        this.tab = new int[10];
        for(int j = 0; j<10; j++)
        {
            tab[j] = n+j;
        }
    }

    public int rangMax()
    {
        int temp = tab[0];
        int rang = 0;
        for (int f = 0; f<10; f++)
        {
            if (tab[f]>temp)
            {
                temp = tab[f];
                rang = f;
            }
        }
        return rang;
    }

    public int somme()
    {
        int total=0;
        for(int z = 0; z<10;z++)
        {
            total += tab[z];
        }return total;
    }

    public boolean egal(TableauInt t)
    {
        if(this.tab == t.getTab())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int[] getTab()
    {
        return tab;
    }

    public String toString()
    {
        String res="[";
        for(int k = 0; k<9; k++)
        {
            res +=tab[k]+", ";
        }res+=tab[9]+"]";
        
        return res;
    }
}