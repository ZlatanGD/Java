public class Millepattes extends AvecPattes 
{
    public Millepattes(String nom, int age)
    {
        super(nom, age, 1000);
    }

    public void crier()
    {
        System.out.println("ckckckckck");
    }

    public String toString()
    {
        return super.toString();
    }
}
