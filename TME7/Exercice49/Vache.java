public class Vache extends AvecPattes 
{
    public Vache(String nom, int age, int nbPattes)
    {
        super(nom, age, nbPattes);
    }    

    public void crier()
    {
        System.out.println("MOOOOOOOO");
    }

    public String toString()
    {
        return super.toString();
    }
}
