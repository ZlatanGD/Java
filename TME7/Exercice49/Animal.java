public abstract class Animal
{
    protected String nom;
    protected int age;

    public Animal(String nom, int age)
    {
        this.nom = nom;
        this.age = age;
    }

    public Animal(String nom)
    {
        this.nom = nom;
        this.age = 1;
    }

    public void vieillir()
    {
        this.age += 1;
    }

    public abstract void crier();


    public String toString()
    {
        return ("Mon nom est "+this.nom+", j'ai "+this.age+" an(s). Je viens de la "+getClass()+"e");
    }
}