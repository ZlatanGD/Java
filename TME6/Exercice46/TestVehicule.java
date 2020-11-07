public class TestVehicule 
{
    public static void main(String[] args)
    {

        System.out.println("\n=====-Vehicule-=====\n");
        Vehicule v1 = new Vehicule();
        v1.rouler(145.36);
        System.out.println(v1.toString());

        System.out.println("\n=====-Vehciule Sans Moteur-=====\n");
        SansMoteur sm = new SansMoteur();
        System.out.println(sm.toString());

        System.out.println("\n=====-Vehciule Avec Moteur-=====\n");
        AMoteur am = new AMoteur(150);
        am.approvisionner(150);
        System.out.println("Est-il en panne? "+am.enPanne());
        am.rouler(52.0);
        System.out.println(am.toString());

        System.out.println("\n=====-Velo-=====\n");
        Velo ve1 = new Velo(8);
        System.out.println(ve1.toString());
        ve1.transporter("Paris", "Belgrade");

        System.out.println("\n=====-Voiture-=====\n");
        Voiture vo1 = new Voiture(5, 150);
        vo1.approvisionner(150);
        vo1.transporter(5, 100);
        System.out.println(vo1.toString());

        System.out.println("\n=====-Camion-=====\n");
        Camion c1 = new Camion(1500, 250);
        c1.approvisionner(200);
        c1.transporter(25, 100);
        System.out.println(c1.toString());
        System.out.println();







    }    
}
