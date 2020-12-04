
public class TestFigure 
{
    public static void main(String[] args)
    {

        Rectangle r1 = new Rectangle(10, 5);
        Carre c1 = new Carre(7, 6);
        Ellipse e1 = new Ellipse(2, 3);
        Cercle c2 = new Cercle(5, 5);

        Figure2D[] tab = new Figure2D[4];
        tab[0] = r1;
        tab[1] = c1;
        tab[2] = e1;
        tab[3] = c2;
        
        
    }
}
