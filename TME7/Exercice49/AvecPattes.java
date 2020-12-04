public abstract class AvecPattes extends Animal
{
    protected int nbPattes;

    public AvecPattes(String nom, int age, int nbPattes)
    {
        super(nom, age);
        this.nbPattes = nbPattes;
    }

    public abstract void crier();
    public String toString()
    {
        return super.toString()+" et j'ai "+nbPattes+" patte(s).";
    }
}
