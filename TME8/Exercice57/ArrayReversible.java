import java.util.ArrayList;

public class ArrayReversible extends ArrayList<Object> implements reversible
{
    private boolean isReversed = false;
    private static final long serialVersionUID = 1L;

    public ArrayReversible()
    {
        super();
    }

    public void inverse(){
        ArrayReversible test = new ArrayReversible();
        for (int i = this.size() - 1 ; i >=0 ; i--)
        {
            Object r = this.get(i);
            if (r instanceof reversible)
            {
                ((reversible) r).inverse();
            }
            test.add(r);
        }
        
        for (int i = 0; i < this.size() ; i++){
            this.set(i,test.get(i));
        }
        isReversed = true;
    }
    public void taille()
    {
        System.out.println(this.size());
    }

    public boolean isReversed()
    {
        return isReversed;
    }
    public static void main(String[] args)
    {
        ArrayReversible a = new ArrayReversible();
        StringReversible str1 = new StringReversible("test2323");
        StringReversible str2 = new StringReversible("123456");
        a.add(str1);
        a.add(str2);
        a.inverse();
        System.out.println(a.isReversed);
        a.taille();

    }



}