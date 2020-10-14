public class Point
{
    private int posx, posy;
    
    public Point()
    {
        this.posx = 0;
        this.posy = 0;
    }
    public Point(int posx, int posy)
    {
        this.posx = posx;
        this.posy = posy;
    }
    public int getX()
    {
        return posx;
    }
    public int getY()
    {
        return this.posy;
    }
    public void setPosx(int posx)
    {
        this.posx = posx;
    }
    public void setPosYy(int posy)
    {
        this.posy = posy;
    }
    public String toString()
    {
        return ("("+this.posx+", "+this.posy+")");
    }
    public double distance(Point p)
    {
        return (java.lang.Math.sqrt(((p.posx - this.posx)*(p.posx - this.posx))+((p.posy-this.posy)*(p.posy-this.posy))));
    }
    public void deplaceToi(int newx, int newy)
    {
        this.posx = newx;
        this.posy = newy;
    }
}