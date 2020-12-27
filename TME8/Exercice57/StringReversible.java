interface reversible
{
    void inverse();
}
public class StringReversible implements reversible 
{
    private final String mot;
    
    public StringReversible(String mot)
    {
        this.mot = mot;
    }

    public int length()
    {
        return mot.length();
    }

    public char charAt(int i)
    {
        return mot.charAt(i);
    }
    public void inverse()
    {
        String res ="";
        for(int i = mot.length()-1; i>=0; i--)
        {
            res += mot.charAt(i);
        }
        System.out.println(res);
    }

    public static void main(String[] args)
    {
        StringReversible mot = new StringReversible("test123");
        mot.inverse();

    }

}
