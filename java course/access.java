import acessmod.*;

class B
{
    private int d;
    public int e;
    protected int f;

    public void showB()
    {
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

public class access 
{
    
    public static void main(String[] args) 
    {
        B b1 = new B();
        b1.showB();    
        //System.out.println(b1.d); --private only in same class
        System.out.println(b1.e);
        System.out.println(b1.f);

        accessmodif a3 = new accessmodif();
        System.out.println(a3.a);
        // System.out.println(a3.b); --private not in diff package
        // System.out.println(a3.c); --protected not in diff package

        a3.checkA();

        
    }

}
