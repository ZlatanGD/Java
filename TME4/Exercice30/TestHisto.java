public class TestHisto
{
    public static void main(String[] args)
    {
        int[] tab = new int[30];

        for(int i=0;i<tab.length;i++)
        {
            tab[i] = (int) (Math.random() * (20 - 0)) + 0;
            System.out.print(tab[i]+" ");
		}
        System.out.println("\n");
        Histo h1 = new Histo(tab);
        h1.affichageHist();
    }
}