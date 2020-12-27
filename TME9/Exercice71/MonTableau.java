public class MonTableau
{
    int tab[];
    int lgReelle = 0;

    public MonTableau(int size)
    {
        tab = new int[size];
    }
    public void ajouter(int n) throws TabPleinException {
        if (this.lgReelle >= this.tab.length) {
            throw new TabPleinException("Depassement des bornes a la position " + this.lgReelle);
        }
        this.tab[this.lgReelle++] = n;
    }
    public static void main(String[] args)
    {
        MonTableau t = new MonTableau(3);
        try
        {
            for(int i=0; i<10; i++)
            {
                t.ajouter(i);
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

}