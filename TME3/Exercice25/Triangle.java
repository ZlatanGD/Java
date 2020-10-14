public class Triangle
{
    private Point p1, p2, p3;
    
    public Triangle()
    {
        p1 = new Point(0,0);
        p2 = new Point(0,0);
        p3 = new Point(0,0);

    }
    public Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getPerimetre()
    {
        return(p1.distance(p2) + p1.distance(p3) + p2.distance(p3));
    }
    public String toString()
    {
        System.out.println("P1: "+p1.toString()+" P2: "+p2.toString()+" P3: "+p3.toString());
        System.out.println("D1: "+p1.distance(p2)+" D2: "+p1.distance(p3)+" D3: "+p2.distance(p3));
        return("Le perimetre est: "+this.getPerimetre());
    }
    public Point getPointP1()
    {
        return p1;
    }

    public Point getPointP2()
    {
        return p2;
    }

    public Point getPointP3()
    {
        return p3;
    }
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if(getClass() != obj.getClass())
        {
            return false;
        }
        Triangle other = (Triangle) obj;
        if(p1.getX() != other.getPointP1().getX()) return false;
        if(p2.getX() != other.getPointP2().getX()) return false;
        if(p3.getX() != other.getPointP3().getX()) return false;
        return true;
    }
    
}
