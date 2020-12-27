public class MainTrain
{
    public static void main(String[] args)
    {
        Motrice m = new Motrice("TnExpress",60);
        Train t = new Train(m);
        WMarchandise w1 = new WMarchandise("Test",6,500);
        WMarchandise w2 = new WMarchandise("Test2",7,550);
        WVoyageur v1 = new WVoyageur("Teste3",8,35);
        t.ajoutWagon(w1);
        t.ajoutWagon(w2);
        t.ajoutWagon(v1);
        System.out.println(t.toString());
        
    }
}