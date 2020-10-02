public class Complexe
{
    private double reelle;
    private double imag;

    public Complexe(double reelle, double imag)
    {
        this.reelle=reelle;
        this.imag=imag;
    }
    public Complexe()
    {


        this((Math.random() * (2 - (-2))) + (-2),(Math.random() * (2 - (-2))) + (-2) );
    }
    public String toString()
    {
        return ("reelle "+this.reelle+" + imag i "+this.imag);
    }
    public boolean estReel()
    {
        if (this.imag == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Complexe addition(Complexe rand)
    {
        return new Complexe(this.reelle + rand.reelle, this.imag + rand.imag);
    }
    public Complexe multiplication(Complexe rand)
    {
        return new Complexe((this.reelle*rand.reelle)-(this.imag*rand.imag), (this.reelle*rand.imag + rand.imag*this.reelle));
    }

}