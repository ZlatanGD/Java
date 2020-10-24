public class TestCone
{
    public static void main(String[] args)
    {
        System.out.println("Nombre de cones: "+Cone.getnbCones()+"\n");

        Cone c1 = new Cone();
        System.out.println(c1.toString());

        Cone c2 = new Cone(12.0,5.2);
        System.out.println(c2.toString()+"\n");

        System.out.println("Nombres de cones: "+Cone.getnbCones());
        
    }
}