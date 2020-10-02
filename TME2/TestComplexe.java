public class TestComplexe
{
    public static void main(String[] args)
    {
        Complexe A = new Complexe();
        Complexe B = new Complexe();

        Complexe test1 = new Complexe(1, 1);
        Complexe test2 = new Complexe(2, 2);
        
        /*
        System.out.println(A.toString());
        System.out.println(A.estReel());
        System.out.println(B.toString());
        System.out.println(B.estReel());
        
        System.out.println((A.addition(B)).toString());
        System.out.println((A.addition(B)).estReel());
        */

        System.out.println((test1.multiplication(test2)).toString());
    }
}