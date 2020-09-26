//Exercice 5
public class TestLettre{
    public static void main(String[] args)
    {
        /*Lettre bro = new Lettre('a');
        char test = bro.getCarac();
        int bla = bro.getCodeAscii();
        System.out.println(bla);
        */
        
        /*for (char c = 'a'; c <= 'z'; c++)
        {
            Lettre loop = new Lettre(c);
            int looper = loop.getCodeAscii();
            System.out.println(c+" code ASCII: "+looper+ " ");
        } 
        */
        int cpt = 0;
        String line = "";
        for (char c = 'a'; c <= 'z'; c++)
        {
            
            Lettre loop = new Lettre(c);
            line+=c+ " ";
            cpt++;
            if((cpt%5) == 0)
            {
                System.out.println(line+"\n");
                line = "";
            }
        }System.out.println("z");
        
    }
}