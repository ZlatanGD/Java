

public class Etudiant
{
    private String nom;
    private int[] notes;

    public Etudiant(String nom, int[] res) throws TabNotesPleinException
    {
        if(res.length > 5)
        {
            throw new TabNotesPleinException("Tableau fourni a trop de notes");
        }
        this.nom = nom;
        notes = new int[res.length];
        for(int i=0; i<res.length; i++)
        {
            this.notes[i] = res[i];
        }
    }

    public String toString()
    {
        String res = "Je suis "+this.nom+" et mes notes sont: ";
        try 
        {
            for(int i =0; i<notes.length;i++)
            {
                res+= notes[i]+" ";
            }   
        }
        catch(Exception e)
        {
            System.out.println("Out of bounds dude");
        } 
        return res;
    }
    public void entrerNote(int note) throws TabNotesPleinException
    {
        if (notes.length >= 5)
        {
            throw new TabNotesPleinException("Trop de notes");
        }
        int temp[] = new int[notes.length+1];
        for(int i = 0; i<notes.length;i++)
        {
            temp[i]=notes[i];
        }
        temp[notes.length] = note;
        notes = new int[temp.length];
        for(int i=0; i<temp.length; i++)
        {
            notes[i] = temp[i];
        }
    }
    public static void main(String[] args)
    {
        int[] tab={15,16,17};
        //int[] tab2 = {15,16,17,19,19,19};
        try
        {
            Etudiant et = new Etudiant("Marco",tab);
            //Etudiant et = new Etudiant("Marco",tab2);
            
            System.out.println(et.toString());
            et.entrerNote(15);
            System.out.println(et.toString());
            et.entrerNote(15);
            System.out.println(et.toString());
            et.entrerNote(15);
            System.out.println(et.toString());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}