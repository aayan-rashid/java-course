public class access2 
{
    public static void main(String[] args) 
    {
        B b2 = new B();
       // System.out.println(b2.d); --private not in other file in same package
        System.out.println(b2.e);
        System.out.println(b2.f); //protected in same package

    }    
}
