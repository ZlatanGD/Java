//Exercice 3
public class Segment
{
    private int x,y;

    public Segment(int extX, int extY)
    {
        this.x=extX;
        this.y=extY;
    }

    public int longueur()
    {
        if(x>y)
        {
            return(x-y);
        }
        else
        {
            return(y-x);
        }
    }

    public String toString()
    {
        return("Segment ["+this.x+", "+this.y+"]");
    }

}