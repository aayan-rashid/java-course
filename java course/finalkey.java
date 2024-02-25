final class A
{
    int name;
}

// class B extends A 
// {
//     // --cant extend final class
// }

class C 
{
    public void show()
    {
        System.out.println("C show");
    }

    public final void cantshow()
    {
        System.out.println("only C show");
    }
}
class D extends C
{
    public void show()
    {
        System.out.println("D show");
    }

    // public void cantshow()
    // {
    //     System.out.println("only D show");
    // }  
    //--cant copy final methods

}

public class finalkey 
{
    public static void main(String[] args)
    {
        
        final String name = "Aayan";
        //name = "trying to change"; --cant change final var
        System.out.println(name);

        C obj1 = new C();
        obj1.show();
        obj1.cantshow();

        D obj2 = new D();
        obj2.show();
    }    
}
