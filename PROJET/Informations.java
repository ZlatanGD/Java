/** Classe Informations. */
public class Informations
{
    /**Classe statique Display. */
    public static class Display
    {   
        /** Methode statique qui renvoie le stock de la farine.
         * @param Stockage Le stock utilisé dans la simulation.
         * @return void
         */
        public static void farineDis(Stockage r)
        {
            System.out.println("Vous avez "+r.getFarine().getQuantite()+" kg de farine.");
        }
        /** Methode statique qui renvoie le stock du blé.
         * @param Stockage Le stock utilisé dans la simulation.
         * @return void
         */
        public static void bleDis(Stockage r)
        {
            System.out.println("Il vous reste "+r.getBle().getQuantite()+"kg de blé 🌾 .");
        }
        /** Methode statique qui renvoie le stock des grains.
         * @param Stockage Le stock utilisé dans la simulation.
         * @return void
         */
        public static void grainDis(Stockage r)
        {
            System.out.println("Il vous reste "+r.getGrain().getQuantite()+" grain(s) 🌱 de blé pour la saison prochaine.");
        }
    }    
}
