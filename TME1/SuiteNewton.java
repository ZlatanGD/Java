public class SuiteNewton{
    private double x;
    private double eps;

    public SuiteNewton(double x, double eps)
    {
        this.x = x;
        this.eps = eps;
    }
    public double racine()
    {
        double u=this.x/2;
        while(this.eps < u-(Math.sqrt(this.x)))
        {
            u = (u+(x/u))/2;
        }return u;
    }

}