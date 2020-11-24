/**Classe Agents.*/
public class Agents 
{
    private Agent[] tab;
    /**Constructeur Agents. Instancie un tableau d'agents, un farmier et une mésange, et les mets dans les tab[0] et tab[1]. */
    public Agents()
    {
        tab = new Agent[2];
        Farmier f = new Farmier(0,0);
        Mesange m = new Mesange(0,0);
        tab[0] = f;
        tab[1] = m;
    }
    /** Methode qui sert à obtenir le farmier.
     * @return Agent - Renvoie un farmier.
     */
    public Agent getFarmier()
    {
        return tab[0];
    }
    /** Methode qui sert à obtenir la mésange.
     * @retrun Agent - Renvoie une mésange.
     */
    public Agent getMesange()
    {
        return tab[1];
    }

}
